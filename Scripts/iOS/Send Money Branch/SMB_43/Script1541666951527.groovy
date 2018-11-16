import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

CustomKeywords.'iOS.send_money_screen.tapBack'()

CustomKeywords.'iOS.send_money_screen.tapViewDashboard'()

CustomKeywords.'global.verify_element.exist'(findTestObject("iOS/Navigation menu/My Account menu"))