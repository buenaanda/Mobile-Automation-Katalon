import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber + " "
String firstNameLastName = firstName +"  "+ lastName

CustomKeywords.'android.send_money_screen.tapPersonalInformation'()

CustomKeywords.'android.send_money_screen.enterMiddleName'("")

CustomKeywords.'android.send_money_screen.enterPhoneNumber'("")

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Name'), firstNameLastName)

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Contact'), mobileNumber)