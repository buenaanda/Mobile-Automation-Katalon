import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
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

CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Send Via Branch screen'))

