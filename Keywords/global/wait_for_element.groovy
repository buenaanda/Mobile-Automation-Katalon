package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

public class wait_for_element {

	@Keyword
	def visible(TestObject to) {
		Mobile.waitForElementPresent(to, 30)
	}
	
	@Keyword
	def loaderNotVisible() {
		while (Mobile.getAttribute(findTestObject('iOS/Loader'), 'visible', 5) == 'true') {
			Mobile.delay(1)
		}
	}
}
