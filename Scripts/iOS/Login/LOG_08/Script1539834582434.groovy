import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Enter valid username in Username text field'
CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)

'Enter invalid password in Password field'
CustomKeywords.'iOS.login_screen.enterPassword'('1ncorrect')

'Tap LOGIN button'
CustomKeywords.'iOS.login_screen.tapLogin'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Error username and password'), GlobalVariable.invalidUsernamePasswordError)

CustomKeywords.'iOS.login_screen.tapOK'()

