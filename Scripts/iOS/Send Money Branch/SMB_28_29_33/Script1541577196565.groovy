import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.annotation.SetUp as SetUp
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('iOS/Send Money Branch/SMB_01'), [:], FailureHandling.STOP_ON_FAILURE) 
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
//
//CustomKeywords.'iOS.send_money_screen.tapSave'()
//
//CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()
//
//CustomKeywords.'iOS.send_money_screen.selectCountry'('India')
//
//CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')
//
//CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo St.')
//
//CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('India')
//
//CustomKeywords.'iOS.send_money_screen.tapSave'()
//
//
//CustomKeywords.'global.scroll_to_element.down'(findTestObject('iOS/Send Money screen/Amount field'))
//
//CustomKeywords.'iOS.send_money_screen.tapCurrency'()
//
//CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error enter amount first'), 'Please enter amount first')
//
//CustomKeywords.'iOS.login_screen.tapOK'()

@SetUp
void SMB_29() {
    Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

    Mobile.delay(40)
}

@Test(dependOnMethods = 'SMB_29')
void SMB_28() {
    CustomKeywords.'iOS.send_money_screen.enterAmount'('500')

    CustomKeywords.'iOS.send_money_screen.tapCurrency'()

    CustomKeywords.'iOS.send_money_screen.selectCurrency'('INR')

    Mobile.verifyElementText(findTestObject('iOS/Send Money screen/Conversion amount', [('value') : '433.13']), '433.13', 
        FailureHandling.CONTINUE_ON_FAILURE)

    CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Conversion currency', [('value') : 'PHP']), 
        'PHP')
}

@Test(dependsOnMethods = 'SMB_28')
void SMB_30() {
    CustomKeywords.'iOS.send_money_screen.tapNext'()
}

