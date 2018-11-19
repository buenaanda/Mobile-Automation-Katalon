import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Leave Password field as blank'
CustomKeywords.'android.login_screen.enterPassword'('')

CustomKeywords.'global.verify_element.disabled'(findTestObject('android/Login screen/Login button'))

