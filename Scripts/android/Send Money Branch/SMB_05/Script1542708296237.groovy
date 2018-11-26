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
String contact = mobileNumber +"\n"+ phoneNumber
String firstNameLastName = firstName +"  "+ lastName

CustomKeywords.'android.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'android.send_money_screen.enterMiddleName'(middleName)

CustomKeywords.'android.send_money_screen.enterLastName'(lastName)

CustomKeywords.'android.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'android.send_money_screen.enterPhoneNumber'(phoneNumber)

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Name'), fullName)

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Contact'), contact)
