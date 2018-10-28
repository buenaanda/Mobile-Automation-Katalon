import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

//CustomKeywords.'iOS.initial_screen.tapLogin'()
//
//'Enter valid username in Username text field'
//CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)
//
//'Enter valid password in Password text field'
//CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)
//
//'Tap Login button'
//CustomKeywords.'iOS.login_screen.tapLogin'()
//
//'Enter valid OTP'
//CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)
//
//CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()
//
//CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()
//
//CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()
//
//CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()
//
//CustomKeywords.'iOS.send_money_screen.enterFirstName'('Buena')
//
//CustomKeywords.'iOS.send_money_screen.enterMiddleName'('Garcia')
//
//CustomKeywords.'iOS.send_money_screen.enterLastName'('Anda')
//
//CustomKeywords.'iOS.send_money_screen.enterMobileNumber'('09271819134')
//
//CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'('021234567')

///
Mobile.delay(50)

///

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

CustomKeywords.'iOS.send_money_screen.selectCountry'('India')

CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo St.')

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('India')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.enterAmount'('500')



