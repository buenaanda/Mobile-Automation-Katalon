import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Enter valid username in Username text field'
CustomKeywords.'android.login_screen.enterUsername'(GlobalVariable.username)

'Enter invalid password in Password field'
CustomKeywords.'android.login_screen.enterPassword'('1ncorrect')

'Tap LOGIN button'
CustomKeywords.'android.login_screen.tapLogin'()

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/OTP Verification screen/OTP Verification screen'))