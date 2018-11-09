import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

String firstName = GlobalVariable.randomFirstName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber + " "

GlobalVariable.randomFirstName = (new random_data()).firstName()
GlobalVariable.randomLastName = (new random_data().lastName())

String newFirstName = GlobalVariable.randomFirstName
String newLastName = GlobalVariable.randomLastName
String newFirstNameLastName = newFirstName +"  "+ newLastName

TestObject First_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : firstName])
TestObject Last_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : lastName])
TestObject Receiver_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : newFirstNameLastName])
TestObject Receiver_Contact = findTestObject('iOS/Send Money screen/Generic text', [('label') : mobileNumber])

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, newFirstName)

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, newLastName)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Name)

CustomKeywords.'global.verify_element.exist'(Receiver_Contact)