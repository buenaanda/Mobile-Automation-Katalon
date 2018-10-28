import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

CustomKeywords.'iOS.login_screen.tapLogout'()

CustomKeywords.'iOS.initial_screen.tapLogin'()

'Enter invalid username in Username text field'
CustomKeywords.'iOS.login_screen.enterUsername'('1nvalid')

'Enter valid Password'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

'Tap LOGIN button'
CustomKeywords.'iOS.login_screen.tapLogin'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Error username and password'), GlobalVariable.invalidUsernamePasswordError)

CustomKeywords.'iOS.login_screen.tapOK'()

