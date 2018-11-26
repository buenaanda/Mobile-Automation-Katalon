import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

String firstName = GlobalVariable.randomFirstName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber + "\n"

GlobalVariable.randomFirstName = (new random_data()).firstName()
GlobalVariable.randomLastName = (new random_data().lastName())

String newFirstName = GlobalVariable.randomFirstName
String newLastName = GlobalVariable.randomLastName
String newFirstNameLastName = newFirstName +"  "+ newLastName

CustomKeywords.'android.send_money_screen.tapPersonalInformation'()

CustomKeywords.'android.send_money_screen.enterFirstName'(newFirstName)

CustomKeywords.'android.send_money_screen.enterLastName'(newLastName)

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Receiver Name'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Receiver Contact'))