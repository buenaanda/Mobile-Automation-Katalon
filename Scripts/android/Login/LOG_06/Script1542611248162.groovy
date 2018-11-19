import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.androidAppPath, true)

CustomKeywords.'android.initial_screen.tapLogin'()

'Enter invalid username in Username text field'
CustomKeywords.'android.login_screen.enterUsername'('1nvalid')

'Enter valid Password'
CustomKeywords.'android.login_screen.enterPassword'(GlobalVariable.password)

'Tap LOGIN button'
CustomKeywords.'android.login_screen.tapLogin'()

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/OTP Verification screen/OTP Verification screen'))

