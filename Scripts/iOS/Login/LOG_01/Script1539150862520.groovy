import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)

CustomKeywords.'iOS.initial_screen.tapLogin'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Username field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Password field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Login button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Login screen/Register now button'))

