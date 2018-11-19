import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomAmount = (new random_data()).amount()

String amount = GlobalVariable.randomAmount

CustomKeywords.'iOS.send_money_screen.enterAmount'(amount)

Mobile.takeScreenshot()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Global/Generic text', [('label') : 'PHP']))

