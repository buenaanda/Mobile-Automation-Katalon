import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import global.random_data
import internal.GlobalVariable

GlobalVariable.randomMiddleName = (new random_data()).middleName()
GlobalVariable.randomPhoneNumber = (new random_data()).phoneNumber()

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String phoneNumber = GlobalVariable.randomPhoneNumber
String fullName = firstName +" "+ middleName +" "+ lastName
String contact = mobileNumber +" "+ phoneNumber
String firstNameLastName = firstName +"  "+ lastName

TestObject Receiver_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : fullName])
TestObject Receiver_Contact = findTestObject('iOS/Send Money screen/Generic text', [('label') : contact])

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterMiddleName'(middleName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'(phoneNumber)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Name)

CustomKeywords.'global.verify_element.exist'(Receiver_Contact)
