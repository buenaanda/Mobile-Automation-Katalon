package iOS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import global.object
import global.wait_for_element

public class inactive_screen {
	
	@Keyword
	def tapOK() {
		(new object()).tap(findTestObject('iOS/Global/OK button'))
		(new wait_for_element()).visible(findTestObject('iOS/Login screen/Password field'))
	}
}
