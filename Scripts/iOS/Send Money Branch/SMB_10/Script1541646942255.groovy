import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

'Tap Login button'
CustomKeywords.'iOS.login_screen.tapSignIn'()

'Enter valid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

CustomKeywords.'iOS.send_money_screen.selectCountry'('India')

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : 'India'])

CustomKeywords.'global.verify_element.text'(Country_dropdown, 'India')

