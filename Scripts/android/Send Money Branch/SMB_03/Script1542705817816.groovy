import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

import global.random_data
import internal.GlobalVariable

GlobalVariable.randomFirstName = (new random_data()).firstName()
GlobalVariable.randomLastName = (new random_data()).lastName()
GlobalVariable.randomMobileNumber = (new random_data().mobileNumber())

String firstName = GlobalVariable.randomFirstName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String receiverName = firstName +"  "+ lastName

CustomKeywords.'android.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'android.send_money_screen.enterLastName'(lastName)

CustomKeywords.'android.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject("android/Send Money screen/Receiver Name"), receiverName)

CustomKeywords.'global.verify_element.text'(findTestObject("android/Send Money screen/Receiver Contact"), mobileNumber + "\n")