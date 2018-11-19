import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Enter valid password in Password text field'
CustomKeywords.'android.login_screen.enterPassword'(GlobalVariable.password)

'Tap Login button'
CustomKeywords.'android.login_screen.tapSignIn'()

'Enter valid OTP'
CustomKeywords.'android.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'global.verify_element.text'(findTestObject('android/My Account screen/Account Name'), accountName)

Mobile.closeApplication()

