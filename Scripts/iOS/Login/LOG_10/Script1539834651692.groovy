import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)

CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

'Tap LOGIN button'
CustomKeywords.'iOS.login_screen.tapLogin'()

'Enter invalid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'('000000')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/OTP Verification screen/Error otp code'), GlobalVariable.invalidOTPError)

CustomKeywords.'iOS.login_screen.tapOK'()

