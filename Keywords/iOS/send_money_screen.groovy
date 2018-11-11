package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import global.wait_for_element
import io.appium.java_client.MobileElement
import global.scroll_to_element
import global.object

public class send_money_screen {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	private String testObjectPath = 'iOS/Send Money screen/'

	@Keyword
	def tapPersonalInformation() {
		tap(findTestObject(testObjectPath + 'Personal Information button'))
	}

	@Keyword
	def enterField(TestObject to, String text) {
		setText(to, text)
		tap(findTestObject(testObjectPath + 'Toolbar Done button'))
	}

	@Keyword
	def selectDropdown(TestObject to, String textToEnter) {
		select(to, textToEnter)
	}

	@Keyword
	def enterFirstName(String firstname) {
		setText(findTestObject(testObjectPath + 'First Name field'), firstname)
	}

	@Keyword
	def enterMiddleName(String middlename) {
		setText(findTestObject(testObjectPath + 'Middle Name field'), middlename)
	}

	@Keyword
	def enterLastName(String lastname) {
		setText(findTestObject(testObjectPath + 'Last Name field'), lastname)
	}

	@Keyword
	def enterMobileNumber(String mobileNumber) {
		setText(findTestObject(testObjectPath + 'Mobile Number field'), mobileNumber)
	}

	@Keyword
	def enterPhoneNumber(String phoneNumber) {
		setText(findTestObject(testObjectPath + 'Phone Number field'), phoneNumber)
	}

	@Keyword
	def tapCurrentAddress() {
		(new wait_for_element()).visible(findTestObject(testObjectPath + 'Current Address button'))
		tap(findTestObject(testObjectPath + 'Current Address button'))
	}

	@Keyword
	def selectCountry(String country) {
		select(findTestObject(testObjectPath + 'Country field'), country)
	}

	@Keyword
	def enterPostal(String postal) {
		setText(findTestObject(testObjectPath + 'Postal field'), postal)
	}

	@Keyword
	def enterUnitHouseNumberBuildingStreet(String unitHouseNumberBuildingStreet) {
		setText(findTestObject(testObjectPath + 'UnitHouse NumberBuildingStreet field'), unitHouseNumberBuildingStreet)
		tap(findTestObject(testObjectPath + 'Toolbar Done button'))
	}

	@Keyword
	def selectDestinationCountry(String destinationCountry) {
		select(findTestObject(testObjectPath + 'Destination Country field'), destinationCountry)
	}

	@Keyword
	def tapSenderEmploymentInformation() {
		tap(findTestObject(testObjectPath + 'Sender Employment Information button'))
	}

	@Keyword
	def selectOccupation(String occupation) {
		select(findTestObject(testObjectPath + 'Occupation field'), occupation)
	}

	@Keyword
	def selectPosition(String position) {
		select(findTestObject(testObjectPath + 'Position field'), position)
	}

	@Keyword
	def selectSourceOfFunds(String sourceOfFunds) {
		select(findTestObject(testObjectPath + 'Source of Funds field'), sourceOfFunds)
	}

	@Keyword
	def enterEmployerName(String employerName) {
		MobileElement employerNameField = driver.findElementByXPath("//*[@type='XCUIElementTypeTextField' and @value='\"Employer's\" name*']")
		employerNameField.sendKeys(employerName)
	}

	@Keyword
	def enterAmount(String amount) {
		scrollToELementDown(findTestObject(testObjectPath + 'Amount field'))
		setText(findTestObject(testObjectPath + 'Amount field'), amount)
		tap(findTestObject(testObjectPath + 'Toolbar Done button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapCurrency() {
		tap(findTestObject(testObjectPath + 'Currency button'))
	}

	@Keyword
	def selectCurrency(String currency) {
		waitForElementVisible(findTestObject(testObjectPath + 'Select Currency Done button'))
		selectPickerWheelValue(currency)
		tap(findTestObject(testObjectPath + 'Select Currency Done button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def enterPromoCode(promoCode) {
		setText(findTestObject(testObjectPath + 'Promo Code field'), promoCode)
		tap(findTestObject(testObjectPath + 'Select Currency Done button'))
	}

	@Keyword
	def enterMessage(message) {
		setText(findTestObject(testObjectPath + 'Message field'), message)
	}

	@Keyword
	def tapSave() {
		tap(findTestObject(testObjectPath + 'Save button'))
		Mobile.delay(3)
	}

	@Keyword
	def tapClose() {
		tap(findTestObject(testObjectPath + 'Close button'))
	}

	@Keyword
	def tapOK() {
		tap(findTestObject(testObjectPath + 'OK button'))
	}

	@Keyword
	def tapNext() {
		tap(findTestObject(testObjectPath + 'Next button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapBack() {
		tap(findTestObject(testObjectPath + 'Back button'))
	}

	@Keyword
	def checkTermsAndAgreement() {
		scrollToELementDown(testObjectPath + 'Terms and Agreement checkbox')
		tap(findTestObject(testObjectPath + 'Terms and Agreement checkbox'))
	}

	@Keyword
	def tapCompleteBranchTransaction() {
		tap(findTestObject(testObjectPath + 'Complete Branch Transaction button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapViewDetails() {
		tap(findTestObject(testObjectPath + 'View Details button'))
	}

	def tap(TestObject to) {
		(new object()).tap(to)
	}

	def setText(TestObject to, String text) {
		(new object()).setText(to, text)
	}

	def select(TestObject to, String value) {
		(new object()).select(to, value)
	}

	def waitForLoaderNotVisible() {
		(new wait_for_element()).loaderNotVisible()
	}

	def waitForElementVisible(TestObject to) {
		(new wait_for_element()).visible(to)
	}

	def scrollToELementDown(TestObject to) {
		(new scroll_to_element()).down(to)
	}

	def selectPickerWheelValue(String value) {
		(new object()).selectPickerWheelValue(value)
	}
}
