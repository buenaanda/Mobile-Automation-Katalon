import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'User cannot login using invalid OTP'

CustomKeywords.'iOS.login_screen.enterUsername'(GlobalVariable.username)

CustomKeywords.'iOS.login_screen.enterPassword'(GlobalVariable.password)

'Tap LOGIN button'
CustomKeywords.'iOS.login_screen.tapLogin'()

'Enter invalid OTP'
CustomKeywords.'iOS.otp_verification_screen.enterOTP'('000000')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/OTP Verification screen/Error otp code'), GlobalVariable.invalidOTPError)

CustomKeywords.'iOS.login_screen.tapOK'()

