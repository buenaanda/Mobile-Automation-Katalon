import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'android.login_screen.enterUsername'(GlobalVariable.username)

CustomKeywords.'android.login_screen.enterPassword'(GlobalVariable.password)

'Tap LOGIN button'
CustomKeywords.'android.login_screen.tapLogin'()

'Enter invalid OTP'
CustomKeywords.'android.otp_verification_screen.enterOTP'('000000')

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/Navigation menu/My Account Menu'))

