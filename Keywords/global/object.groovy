package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

import internal.GlobalVariable

public class object {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	def tap(TestObject to) {
		Mobile.tap(to, 5, FailureHandling.STOP_ON_FAILURE)
	}

	def setText(TestObject to, String text) {
		Mobile.setText(to, text, 5, FailureHandling.STOP_ON_FAILURE)
	}

	def select(TestObject to, String value) {
		tap(to)
		setText(findTestObject('iOS/Global/Search here field'), value)
		tap(findTestObject('iOS/Global/Search here first result', [('label') : value]))
	}

	def selectPickerWheelValue(String value) {
		MobileElement wheels = driver.findElementByClassName("XCUIElementTypePickerWheel")
		wheels.sendKeys(value)
	}
}
