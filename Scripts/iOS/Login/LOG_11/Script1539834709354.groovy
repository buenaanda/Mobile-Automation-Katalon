import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Wait for the OTP timer to end'
Mobile.delay(20)

'Tap RESEND button'
CustomKeywords.'iOS.otp_verification_screen.tapResend'()

CustomKeywords.'global.wait_for_element.loaderNotVisible'()

CustomKeywords.'global.verify_element.disabled'(findTestObject('iOS/OTP Verification screen/Resend button'))

