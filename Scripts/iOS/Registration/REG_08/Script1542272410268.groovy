import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.otp_verification_screen.enterOTP'(GlobalVariable.otp)
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Username field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Password field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Password Strength bar'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Security Disclaimer button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Global/Next button'))