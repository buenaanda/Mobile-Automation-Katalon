package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

public class navigation_menu {

	@Keyword
	def tapTransferMoney() {
		Mobile.tap(findTestObject("iOS/Navigation menu/Transfer Money menu"), 0, FailureHandling.STOP_ON_FAILURE)
	}
}
