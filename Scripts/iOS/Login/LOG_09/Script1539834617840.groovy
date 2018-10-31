import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Leave Password field as blank'
CustomKeywords.'iOS.login_screen.enterPassword'('')

CustomKeywords.'global.verify_element.disabled'(findTestObject('iOS/Login screen/Login button'))

