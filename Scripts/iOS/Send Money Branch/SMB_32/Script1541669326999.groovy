import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String promoCode = GlobalVariable.promoCode1

CustomKeywords.'iOS.send_money_screen.enterPromoCode'(promoCode)

TestObject Promo_Code_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : promoCode])

CustomKeywords.'global.verify_element.text'(Promo_Code_field, promoCode)