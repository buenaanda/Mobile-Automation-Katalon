import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.registration_screen.enterMobileNumber'(GlobalVariable.mobileNumber)
CustomKeywords.'iOS.registration_screen.tapNext'()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/OTP Verification screen/OTP Verification screen'))