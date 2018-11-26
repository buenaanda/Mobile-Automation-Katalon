package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.exception.StepFailedException
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
		String loader = ''
		int counter = 1
		if(Mobile.verifyElementVisible(findTestObject('iOS/Global/Loader'), 2, FailureHandling.OPTIONAL) == true) {
			loader = 'iOS/Global/Loader'
		} else if (Mobile.verifyElementVisible(findTestObject('android/Global/Loader'), 2, FailureHandling.OPTIONAL) == true) {
			loader = 'android/Global/Loader'
		}
		try {
			while (Mobile.getAttribute(findTestObject(loader), 'visible', 2) == 'true') {
				Mobile.delay(1)
				counter = counter + 1
				if(counter == 40) {
					break
				}
			}
		} catch(StepFailedException e) {
		}
	}
}
