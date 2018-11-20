package android

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

public class transfer_money_screen {

	@Keyword
	def tapSendMoney() {
		Mobile.tap(findTestObject("android/Transfer Money screen/Send Money button"), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def tapBranchTransaction() {
		String button = "android/Transfer Money screen/Branch Transaction button"
		if(Mobile.verifyElementExist(findTestObject("android/Transfer Money screen/Balance Inquiry Down message"), 2, FailureHandling.OPTIONAL) == true) {
			button = "android/Global/Proceed button"
		}
		Mobile.tap(findTestObject(button), 2)
	}
}
