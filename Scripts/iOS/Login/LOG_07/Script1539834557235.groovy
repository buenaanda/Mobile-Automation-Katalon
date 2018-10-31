import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Leave Username field as blank'
CustomKeywords.'iOS.login_screen.enterUsername'('')

CustomKeywords.'global.verify_element.disabled'(findTestObject('iOS/Login screen/Login button'))

