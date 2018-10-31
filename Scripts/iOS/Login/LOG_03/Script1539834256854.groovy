import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Password field'), '••••••••')

'Login button is enabled'
CustomKeywords.'global.verify_element.enabled'(findTestObject('iOS/Login screen/Login button'))

