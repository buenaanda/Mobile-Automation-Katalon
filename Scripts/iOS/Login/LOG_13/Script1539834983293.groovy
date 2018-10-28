import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

Mobile.hideKeyboard()

'Tap Login button'
CustomKeywords.'iOS.login_screen.tapSignIn'()

'Enter valid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/My Account screen/Account Name', [('value') : accountName]), accountName)

Mobile.closeApplication()

