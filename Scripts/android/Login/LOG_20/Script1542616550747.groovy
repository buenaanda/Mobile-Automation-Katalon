import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.androidAppPath, true)

CustomKeywords.'android.initial_screen.tapLogin'()

'Enter valid username in Username text field'
CustomKeywords.'android.login_screen.enterUsername'(GlobalVariable.username)

'Enter valid password in Password text field'
CustomKeywords.'android.login_screen.enterPassword'(GlobalVariable.password)

'Tap Login button'
CustomKeywords.'android.login_screen.tapLogin'()

'Enter valid OTP'
CustomKeywords.'android.otp_verification_screen.enterOTP'(GlobalVariable.otp)

'Do not make any activities for 5 minutes'
Mobile.delay(600)

CustomKeywords.'android.navigation_menu.tapTransferMoney'()

CustomKeywords.'android.transfer_money_screen.tapSendMoney'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Global/Error inactive'), GlobalVariable.inactiveErrorAndroid)

Mobile.closeApplication()

