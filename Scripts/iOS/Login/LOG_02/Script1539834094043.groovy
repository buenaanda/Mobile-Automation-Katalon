import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Enter valid username in Username text field'
CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Username field'), GlobalVariable.username)

'Login button is disabled'
CustomKeywords.'global.verify_element.disabled'(findTestObject('iOS/Login screen/Login button'))

