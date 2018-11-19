import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber + " "
String phoneNumber = GlobalVariable.randomPhoneNumber
String firstNameLastName = firstName +"  "+ lastName

TestObject Middle_name_field = findTestObject('iOS/Global/Generic field', [('value') : middleName])
TestObject Phone_number_field = findTestObject('iOS/Global/Generic field', [('value') : phoneNumber])
TestObject Receiver_Name = findTestObject('iOS/Global/Generic text', [('label') : firstNameLastName])
TestObject Receiver_Contact = findTestObject('iOS/Global/Generic text', [('label') : mobileNumber])

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.enterField'(Middle_name_field, '')

CustomKeywords.'iOS.send_money_screen.enterField'(Phone_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Name)

CustomKeywords.'global.verify_element.exist'(Receiver_Contact)