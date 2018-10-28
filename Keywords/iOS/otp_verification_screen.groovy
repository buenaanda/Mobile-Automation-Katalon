package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

import internal.GlobalVariable

import io.appium.java_client.AppiumDriver as AppiumDriver

public class otp_verification_screen {

	AppiumDriver<?> driver = MobileDriverFactory.getDriver()

	@Keyword
	def enterOTP(String otp) {
		Mobile.waitForElementPresent(findTestObject('iOS/OTP Verification screen/OTP Verification screen'), 30)
		driver.getKeyboard().sendKeys(otp)
	}

	@Keyword
	def tapResend() {
		Mobile.tap(findTestObject("iOS/OTP Verification screen/Resend button"), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(3)
	}
}
