package android

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import global.object

public class initial_screen {

	@Keyword
	def tapLogin() {
		(new object()).tap(findTestObject('android/Initial screen/Login button'))
	}

	@Keyword
	def tapRegister() {
		(new object()).tap(findTestObject('android/Initial screen/Register button'))
	}
}