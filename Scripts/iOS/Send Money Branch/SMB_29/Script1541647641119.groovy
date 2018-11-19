import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomFirstName = (new random_data()).firstName()
GlobalVariable.randomMiddleName = (new random_data()).middleName()
GlobalVariable.randomLastName = (new random_data()).lastName()
GlobalVariable.randomMobileNumber = (new random_data()).mobileNumber()
GlobalVariable.randomPhoneNumber = (new random_data()).phoneNumber()
GlobalVariable.randomSourceOfFunds = (new random_data()).sourceOfFunds()

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String phoneNumber = GlobalVariable.randomPhoneNumber
String sourceOfFunds = GlobalVariable.randomSourceOfFunds

TestObject Enter_amount_first_error = findTestObject('iOS/Global/Generic text', [('label') : 'Please enter amount first'])

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)
 
'Enter valid password in Password text field'
CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)
 
'Tap Sign in button'
CustomKeywords.'iOS.login_screen.tapSignIn'()
 
'Enter valid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)
 
CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()
 
CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()
 
CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()
 
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()
 
CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)
 
CustomKeywords.'iOS.send_money_screen.enterMiddleName'(middleName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)
 
CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)
 
CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'(phoneNumber)
 
CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()
 
CustomKeywords.'iOS.send_money_screen.selectCountry'('Thailand')
 
CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')
 
CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo St.')
 
CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Thailand')
 
CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.tapSenderEmploymentInformation'()

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Unemployed')

CustomKeywords.'iOS.send_money_screen.selectSourceOfFunds'(sourceOfFunds)

CustomKeywords.'iOS.send_money_screen.tapSave'()
 
CustomKeywords.'global.scroll_to_element.down'(findTestObject('iOS/Send Money screen/Amount field'))

CustomKeywords.'iOS.send_money_screen.tapCurrency'()
 
CustomKeywords.'global.verify_element.exist'(Enter_amount_first_error)
 
CustomKeywords.'iOS.send_money_screen.tapOK'()