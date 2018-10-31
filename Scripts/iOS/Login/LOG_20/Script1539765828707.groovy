import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

CustomKeywords.'iOS.initial_screen.tapLogin'()

'Enter valid username in Username text field'
CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)

'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

'Tap Login button'
CustomKeywords.'iOS.login_screen.tapLogin'()

'Enter valid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)

'Do not make any activities for 5 minutes'
Mobile.delay(400)

CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Transfer Money screen/Error inactive'), GlobalVariable.inactiveError)

CustomKeywords.'iOS.transfer_money_screen.tapOK'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Password field'))

CustomKeywords.'iOS.login_screen.tapLogout'()

Mobile.closeApplication()

