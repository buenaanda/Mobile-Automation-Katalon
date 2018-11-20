package global

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
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
		String textfieldXpath = "//*[@type = 'XCUIElementTypeTextField' and @value = 'Search here']"
		String firstResultXpath = String.format("//*[@type='XCUIElementTypeStaticText' and @value='%s']", value)
		
		if(Mobile.verifyElementExist(findTestObject("//*[@resource-id = 'com.whitecloak.perahub.dev:id/etSearch']"), 2, FailureHandling.OPTIONAL) == true) {
			textfieldXpath = "//*[@resource-id = 'com.whitecloak.perahub.dev:id/etSearch']"
			firstResultXpath = String.format("//*[@resource-id = 'com.whitecloak.perahub.dev:id/text_choices' and @text='%s']", value)
		}
		
		tap(to)
		MobileElement searchHereField = driver.findElementByXPath(textfieldXpath)
		searchHereField.sendKeys(value)
		MobileElement firstResult = driver.findElementByXPath(firstResultXpath)
		firstResult.click()
	}

	def selectPickerWheelValue(String value) {
		MobileElement wheels = driver.findElementByClassName("XCUIElementTypePickerWheel")
		wheels.sendKeys(value)
	}

	def selectMonthPickerWheelValue(String month) {
		List <MobileElement> wheels = driver.findElementsByClassName("XCUIElementTypePickerWheel")
		wheels.get(0).sendKeys(month)
	}

	def selectDayPickerWheelValue(String day) {
		List <MobileElement> wheels = driver.findElementsByClassName("XCUIElementTypePickerWheel")
		wheels.get(1).sendKeys(day)
	}

	def selectYearPickerWheelValue(String year) {
		List <MobileElement> wheels = driver.findElementsByClassName("XCUIElementTypePickerWheel")
		wheels.get(2).sendKeys(year)
	}

	def hideKeypad() {
		Mobile.tap(findTestObject('iOS/Global/Toolbar Done Button'), 5)
	}
}
