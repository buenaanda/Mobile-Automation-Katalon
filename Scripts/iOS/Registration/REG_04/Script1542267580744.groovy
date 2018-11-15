import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.registration_screen.enterMobileNumber'(invalidMobileNumber)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/Mobile Number field'), "")