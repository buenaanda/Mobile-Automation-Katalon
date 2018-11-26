package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable

public class verify_element {

	@Keyword
	def disabled(TestObject to) {
		String attribute = Mobile.getAttribute(to, 'enabled', 10)
		Mobile.verifyEqual(attribute, 'false')
	}

	@Keyword
	def enabled(TestObject to) {
		String attribute = Mobile.getAttribute(to, 'enabled', 10)
		Mobile.verifyEqual(attribute, 'true')
	}

	@Keyword
	def text(TestObject to, String text) {
		Mobile.waitForElementPresent(to, 10, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(to, text, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def value(TestObject to, String text) {
		Mobile.verifyElementText(to, text, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def exist(TestObject to) {
		Mobile.verifyElementExist(to, 5, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def notExist(TestObject to) {
		Mobile.verifyElementNotExist(to, 5, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	def clickable(TestObject to) {
		String attribute = Mobile.getAttribute(to, 'clickable', 5)
		Mobile.verifyEqual(attribute, 'true')
	}

	@Keyword
	def notClickable(TestObject to) {
		String attribute = Mobile.getAttribute(to, 'clickable', 5)
		Mobile.verifyEqual(attribute, 'false')
	}

	@Keyword
	def toastMessageExist(String text) {
		String xpath = String.format("//android.widget.Toast[@text='%s']", text)
		TestObject to = findTestObject('android/Global/Toast message')
		to.findProperty('xpath').setValue(xpath)
		Mobile.verifyElementExist(findTestObject(to), 5)
	}
}
