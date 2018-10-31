package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

public class initial_screen {

	@Keyword
	def tapLogin() {
		Mobile.tap(findTestObject('iOS/Initial screen/Login button'), 15, FailureHandling.STOP_ON_FAILURE)
	}
}
