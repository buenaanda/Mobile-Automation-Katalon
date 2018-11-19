package android

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.annotation.Keyword
import global.object

public class login_screen {

	@Keyword
	def enterUsername(String username) {
		(new object()).setText(findTestObject('android/Login screen/Username field'), username)
	}

	@Keyword
	def enterPassword(String password) {
		(new object()).setText(findTestObject('android/Login screen/Password field'), password)
	}

	@Keyword
	def tapLogin() {
		(new object()).tap(findTestObject('android/Login screen/Login button'))
		Mobile.delay(3)
	}

	@Keyword
	def tapSignIn() {
		(new object()).tap(findTestObject('android/Login screen/Sign in button'))
		Mobile.delay(3)
	}

	@Keyword
	def tapOK() {
		(new object()).tap(findTestObject('android/Login screen/OK button'))
	}

	@Keyword
	def tapLogout() {
		(new object()).tap(findTestObject('android/Login screen/Logout button'))
	}
}
