package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
import org.openqa.selenium.Keys

import java.awt.RenderingHints.Key

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

import io.appium.java_client.AppiumDriver

public class send_money_screen {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	@Keyword
	def tapPersonalInformation() {
		tap(findTestObject("iOS/Send Money screen/Personal Information button"))
	}

	@Keyword
	def enterField(TestObject to, String text) {
		setText(to, text)
	}

	@Keyword
	def selectDropdown(TestObject to, String textToEnter) {
		select(to, textToEnter)
	}

	@Keyword
	def enterFirstName(String firstname) {
		setText(findTestObject("iOS/Send Money screen/First name field"), firstname)
	}

	@Keyword
	def enterMiddleName(String middlename) {
		setText(findTestObject("iOS/Send Money screen/Middle name field"), middlename)
	}

	@Keyword
	def enterLastName(String lastname) {
		setText(findTestObject("iOS/Send Money screen/Last name field"), lastname)
	}

	@Keyword
	def enterMobileNumber(String mobileNumber) {
		setText(findTestObject("iOS/Send Money screen/Mobile number field"), mobileNumber)
	}

	@Keyword
	def enterPhoneNumber(String phoneNumber) {
		setText(findTestObject("iOS/Send Money screen/Phone number field"), phoneNumber)
	}

	@Keyword
	def tapCurrentAddress() {
		waitForElementPresent(findTestObject('iOS/Send Money screen/Current Address button'))
		tap(findTestObject('iOS/Send Money screen/Current Address button'))
	}

	@Keyword
	def selectCountry(String country) {
		select(findTestObject('iOS/Send Money screen/Country field'), country)
	}

	@Keyword
	def enterPostal(String postal) {
		setText(findTestObject("iOS/Send Money screen/Postal field"), postal)
	}

	@Keyword
	def enterUnitHouseNumberBuildingStreet(String unitHouseNumberBuildingStreet) {
		setText(findTestObject("iOS/Send Money screen/UnitHouse NumberBuildingStreet field"), unitHouseNumberBuildingStreet)
	}

	@Keyword
	def selectDestinationCountry(String destinationCountry) {
		select(findTestObject('iOS/Send Money screen/Destination Country field'), destinationCountry)
	}

	@Keyword
	def tapSenderEmploymentInformation() {
		tap(findTestObject('iOS/Send Money screen/Sender Employment Information button'))
	}

	@Keyword
	def selectOccupation(String occupation) {
		select(findTestObject('iOS/Send Money screen/Occupation field'), occupation)
	}

	@Keyword
	def selectPosition(String position) {
		select(findTestObject('iOS/Send Money screen/Position field'), position)
	}

	@Keyword
	def selectSourceOfFunds(String sourceOfFunds) {
		select(findTestObject('iOS/Send Money screen/Source of Funds field'), sourceOfFunds)
	}

	@Keyword
	def enterEmployerName(String employerName) {
		setText(findTestObject('iOS/Send Money screen/Employer Name field'), employerName)
	}

	@Keyword
	def enterAmount(String amount) {
		setText(findTestObject('iOS/Send Money screen/Amount field'), amount)
		driver.getKeyboard().sendKeys(Keys.ENTER)
	}

	@Keyword
	def tapSave() {
		tap(findTestObject("iOS/Send Money screen/Save button"))
	}

	@Keyword
	def tapClose() {
		tap(findTestObject("iOS/Send Money screen/Close button"))
	}

	def tap(TestObject to) {
		Mobile.tap(to, 5, FailureHandling.STOP_ON_FAILURE)
	}

	def setText(TestObject to, String text) {
		Mobile.setText(to, text, 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.hideKeyboard()
	}

	def select(TestObject to, String value) {
		tap(to)
		driver.getKeyboard().sendKeys(value)
		tap(findTestObject('iOS/Send Money screen/Search here first result', [('label') : value]))
	}
	
	def waitForElementPresent(TestObject to) {
		Mobile.waitForElementPresent(to, 30)
	}
}
