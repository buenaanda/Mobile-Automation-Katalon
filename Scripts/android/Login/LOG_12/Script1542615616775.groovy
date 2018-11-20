import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'android.otp_verification_screen.enterOTP'(GlobalVariable.otp)

CustomKeywords.'global.wait_for_element.visible'(findTestObject('android/Navigation menu/My Account menu'))

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.androidAppPath, false)

CustomKeywords.'global.verify_element.text'(findTestObject('android/Login screen/Account Name'), accountNameFull)

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Sign In Password field'))

