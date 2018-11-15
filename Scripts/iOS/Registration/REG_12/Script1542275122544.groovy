import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.registration_screen.enterPassword'('Hello123')
CustomKeywords.'iOS.registration_screen.tapNext'()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Username field'))