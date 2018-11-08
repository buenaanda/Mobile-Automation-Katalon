package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import org.openqa.selenium.JavascriptExecutor

import io.appium.java_client.AppiumDriver

import internal.GlobalVariable

public class scroll_to_element {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	@Keyword
	def down(TestObject to) {
		while(Mobile.getAttribute(to, 'visible', 5) == 'false') {
			JavascriptExecutor js = (JavascriptExecutor) driver
			HashMap<String, String> scrollObject = new HashMap<String, String>()
			scrollObject.put("direction", "down")
			js.executeScript("mobile: scroll", scrollObject)
		}
	}
}
