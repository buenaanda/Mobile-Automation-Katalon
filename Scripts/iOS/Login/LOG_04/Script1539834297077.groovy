import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Tap Login button'
CustomKeywords.'iOS.login_screen.tapLogin'()

CustomKeywords.'global.wait_for_element.visible'(findTestObject('iOS/OTP Verification screen/OTP Verification screen'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/OTP Verification screen/OTP Verification screen'))

CustomKeywords.'global.verify_element.disabled'(findTestObject('iOS/OTP Verification screen/Resend button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/OTP Verification screen/Close button'))

Mobile.delay(20)

CustomKeywords.'global.verify_element.enabled'(findTestObject('iOS/OTP Verification screen/Resend button'))

