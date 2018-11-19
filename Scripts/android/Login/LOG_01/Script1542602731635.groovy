import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.androidAppPath, true)

CustomKeywords.'android.initial_screen.tapLogin'()

Mobile.hideKeyboard()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Username field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Password field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Login button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Register Now button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Login screen/Know more about PeraHub button'))