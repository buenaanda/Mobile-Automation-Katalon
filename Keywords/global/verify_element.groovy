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
		Mobile.verifyElementText(to, text, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def exist(TestObject to) {
		Mobile.verifyElementExist(to, 5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def notExist(TestObject to) {
		Mobile.verifyElementNotExist(to, 5, FailureHandling.STOP_ON_FAILURE)
	}
}
