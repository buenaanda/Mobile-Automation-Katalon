package iOS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable
import global.object
import global.wait_for_element
import global.scroll_to_element

public class registration_screen {

	@Keyword
	def tapUseMobileNumber() {
		tap(findTestObject('iOS/Registration screen/Mobile Number button'))
	}

	@Keyword
	def tapCustomerNumber() {
		tap(findTestObject('iOS/Registration screen/Customer Number button'))
	}

	@Keyword
	def tapPrivacyPolicy() {
		tap(findTestObject('iOS/Registration screen/Privacy Policy button'))
	}

	@Keyword
	def tapTermsAndAgreement() {
		tap(findTestObject('iOS/Registration screen/Terms And Agreement button'))
	}

	@Keyword
	def checkTermsAndAgreement() {
		tap(findTestObject('iOS/Registration screen/Terms And Agreement checkbox'))
	}

	@Keyword
	def enterMobileNumber(String mobileNumber) {
		setText(findTestObject('iOS/Registration screen/Mobile Number field'), mobileNumber)
		hideKeypad()
	}

	@Keyword
	def tapNext() {
		tap(findTestObject('iOS/Global/Next button'))
		waitForLoaderNotVisible()
	}

	@Keyword
	def tapOK() {
		tap(findTestObject('iOS/Global/OK button'))
	}

	@Keyword
	def enterUsername(String username) {
		setText(findTestObject('iOS/Registration screen/Username field'), username)
	}

	@Keyword
	def enterPassword(String password) {
		setText(findTestObject('iOS/Registration screen/Password field'), password)
	}

	@Keyword
	def tapSecurityDisclaimer() {
		tap(findTestObject('iOS/Registration screen/Security Disclaimer button'))
	}

	@Keyword
	def tapClose() {
		tap(findTestObject('iOS/Global/Close button'))
	}

	@Keyword
	def enterFirstName(String firstName) {
		setText(findTestObject('iOS/Registration screen/First Name field'), firstName)
	}

	@Keyword
	def enterMiddleName(String middleName) {
		setText(findTestObject('iOS/Registration screen/Middle Name field'), middleName)
	}

	@Keyword
	def enterLastName(String lastName) {
		setText(findTestObject('iOS/Registration screen/Middle Name field'), lastName)
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
