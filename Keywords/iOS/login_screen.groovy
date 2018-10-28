package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty

public class login_screen {

	@Keyword
	def enterUsername(String username) {
		Mobile.setText(findTestObject('iOS/Login screen/Username field'), username, 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def enterPassword(String password) {
		Mobile.setText(findTestObject('iOS/Login screen/Password field'), password, 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def tapLogin() {
		Mobile.tap(findTestObject('iOS/Login screen/Login button'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(3)
	}

	@Keyword
	def tapSignIn() {
		Mobile.tap(findTestObject('iOS/Login screen/Sign in button'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(3)
	}

	@Keyword
	def tapOK() {
		Mobile.tap(findTestObject('iOS/Login screen/OK button'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def tapLogout() {
		Mobile.tap(findTestObject('iOS/Login screen/Logout button'), 10, FailureHandling.STOP_ON_FAILURE)
	}
}
