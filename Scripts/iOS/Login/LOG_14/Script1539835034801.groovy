import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'('1nvalid')

'Tap Login button'
CustomKeywords.'iOS.login_screen.tapSignIn'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Error username and password'), GlobalVariable.invalidUsernamePasswordError)

CustomKeywords.'iOS.login_screen.tapOK'()

CustomKeywords.'iOS.login_screen.tapLogout'()

Mobile.closeApplication()

