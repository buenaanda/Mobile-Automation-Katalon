import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

CustomKeywords.'iOS.login_screen.tapSignIn'()

CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()

CustomKeywords.'iOS.send_money_screen.tapSenderEmploymentInformation'()

CustomKeywords.'iOS.send_money_screen.selectOccupation'('IT and Tech Professional')

CustomKeywords.'iOS.send_money_screen.selectPosition'('Entry Level')

CustomKeywords.'iOS.send_money_screen.selectSourceOfFunds'('Salary/Income')

CustomKeywords.'iOS.send_money_screen.enterEmployerName'('White Cloak Inc.')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Occupation', [('label') : 'IT and Tech Professional, Entry Level']), 
    'IT and Tech Professional,' + '\nEntry Level')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Source of Funds', [('label') : 'Salary/Income']), 
    'Salary/Income')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Source of Employer Name', [('label') : 'White Cloak Inc.']), 
    'White Cloak Inc.')

Mobile.closeApplication()

