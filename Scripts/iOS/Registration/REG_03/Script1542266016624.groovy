import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.registration_screen.enterMobileNumber'(GlobalVariable.mobileNumber)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/Mobile Number field'), GlobalVariable.mobileNumber)
CustomKeywords.'global.verify_element.enabled'(findTestObject('iOS/Registration screen/Next button'))