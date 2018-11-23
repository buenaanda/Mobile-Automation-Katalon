package android

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import io.appium.java_client.AppiumDriver
import global.wait_for_element
import io.appium.java_client.MobileElement
import global.scroll_to_element
import global.object

public class send_money_screen {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	private String testObjectPath = 'android/Send Money screen/'

	@Keyword
	def tapPersonalInformation() {
		tap(findTestObject(testObjectPath + 'Recipients Personal Information button'))
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
		(new wait_for_element()).visible(findTestObject(testObjectPath + 'Recipients Address button'))
		tap(findTestObject(testObjectPath + 'Current Address button'))
	}

	@Keyword
	def selectCountry(String country) {
		select(findTestObject(testObjectPath + 'Country field'), country)
	}

	@Keyword
	def enterPostal(String postal) {
		setText(findTestObject(testObjectPath + 'Postal field'), postal)
		hideKeypad()
	}

	@Keyword
	def enterUnitHouseNumberBuildingStreet(String unitHouseNumberBuildingStreet) {
		setText(findTestObject(testObjectPath + 'UnitHouse NumberBuildingStreet field'), unitHouseNumberBuildingStreet)
		tap(findTestObject('iOS/Global/Toolbar Done button'))
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
		setText(findTestObject(testObjectPath + 'Employer Name field'), employerName)
	}

	@Keyword
	def enterSchoolName(String schoolName) {
		setText(findTestObject(testObjectPath + 'School Name field'), schoolName)
	}

	@Keyword
	def enterAmount(String amount) {
		scrollToELementDown(findTestObject(testObjectPath + 'Amount field'))
		setText(findTestObject(testObjectPath + 'Amount field'), amount)
		tap(findTestObject('android/Global/Toolbar Done button'))
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
		Mobile.hideKeyboard()
	}

	@Keyword
	def enterMessage(message) {
		setText(findTestObject(testObjectPath + 'Message field'), message)
		Mobile.hideKeyboard()
	}

	@Keyword
	def tapSave() {
		tap(findTestObject('android/Global/Save button'))
		Mobile.delay(3)
	}

	@Keyword
	def tapClose() {
		String button = 'android/Global/x button'
		if(Mobile.verifyElementVisible(findTestObject(button), 5, FailureHandling.OPTIONAL) == false) {
			button = 'android/Global/Close button'
		}
		tap(findTestObject(button))
	}

	@Keyword
	def tapOK() {
		tap(findTestObject('android/Global/OK button'))
	}

	@Keyword
	def tapNext() {
		tap(findTestObject('android/Global/Next button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapBack() {
		tap(findTestObject('android/Global/Back button'))
	}

	@Keyword
	def checkTermsAndAgreement() {
		scrollToELementDown(findTestObject(testObjectPath + 'Terms and Agreement checkbox'))
		tap(findTestObject(testObjectPath + 'Terms and Agreement checkbox'))
	}

	@Keyword
	def tapCompleteBranchTransaction() {
		scrollToELementDown(findTestObject(testObjectPath + 'Complete Branch Transaction button'))
		tap(findTestObject(testObjectPath + 'Complete Branch Transaction button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapViewDetails() {
		tap(findTestObject(testObjectPath + 'View Details button'))
	}

	@Keyword
	def tapViewDashboard() {
		tap(findTestObject(testObjectPath + 'View Dashboard button'))
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

	def hideKeypad() {
		(new object()).hideKeypad()
	}
}
