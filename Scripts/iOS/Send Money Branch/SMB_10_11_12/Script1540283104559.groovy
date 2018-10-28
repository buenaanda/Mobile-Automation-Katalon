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

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'India'])

CustomKeywords.'global.verify_element.text'(Country_dropdown, 'India')

'SMB_11: User can see if Province/State and City fields are not required (Optional)'
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'India'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'Mexico')

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

'SMB_12: User can see if Province/State and City fields are required'
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity required field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Mexico'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'United States')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity required field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'United States'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'Philippines')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity required field'))

