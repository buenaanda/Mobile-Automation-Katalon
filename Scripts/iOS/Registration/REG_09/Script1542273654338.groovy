import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.otp_verification_screen.enterOTP'("123456")
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/OTP Verification screen/Error invalid otp code'))
CustomKeywords.'iOS.registration_screen.tapOK'()