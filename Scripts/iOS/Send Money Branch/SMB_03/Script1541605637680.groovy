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

TestObject Receiver_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : receiverName])
TestObject Receiver_Contact = findTestObject('iOS/Send Money screen/Generic text', [('label') : mobileNumber])

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Name)

CustomKeywords.'global.verify_element.exist'(Receiver_Contact)