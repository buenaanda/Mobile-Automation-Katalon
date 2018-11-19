import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Leave Username field as blank'
CustomKeywords.'android.login_screen.enterUsername'('')

CustomKeywords.'global.verify_element.disabled'(findTestObject('android/Login screen/Login button'))

