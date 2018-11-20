import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'global.wait_for_element.visible'(findTestObject('iOS/Navigation menu/My Account menu'))

Mobile.closeApplication()

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Login screen/Account Name', [('label') : accountNameFull]), accountNameFull)

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Password field'))

