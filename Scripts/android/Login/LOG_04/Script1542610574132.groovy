import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Tap Login button'
CustomKeywords.'android.login_screen.tapLogin'()

CustomKeywords.'global.wait_for_element.visible'(findTestObject('android/OTP Verification screen/OTP Verification screen'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/OTP Verification screen/OTP Verification screen'))

CustomKeywords.'global.verify_element.notClickable'(findTestObject('android/OTP Verification screen/Resend button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Global/Back button'))

Mobile.delay(65)

CustomKeywords.'global.verify_element.clickable'(findTestObject('android/OTP Verification screen/Resend button'))

