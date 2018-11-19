package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

public class transfer_money_screen {

	@Keyword
	def tapSendMoney() {
		Mobile.tap(findTestObject("iOS/Transfer Money screen/Send Money button"), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def tapBranchTransaction() {
		try {
			Mobile.tap(findTestObject("iOS/Transfer Money screen/Branch Transaction button"), 10)
		} catch(StepFailedException e) {
			Mobile.tap('iOS/Transfer Money screen/Proceed button', 2)
		}
	}
}
