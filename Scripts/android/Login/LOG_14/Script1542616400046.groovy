import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.androidAppPath, false)

'Enter valid password in Password text field'
CustomKeywords.'android.login_screen.enterSignInPassword'('1nvalid')

'Tap Login button'
CustomKeywords.'android.login_screen.tapSignIn'()

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/OTP Verification screen/OTP Verification screen'))

