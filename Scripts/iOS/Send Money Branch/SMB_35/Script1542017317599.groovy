import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

TestObject Promo_Description = findTestObject('iOS/Global/Generic text', [('label') : 'PHP 250.00 Half base off You have PHP 250.00 off on your Service Fee'])

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'global.scroll_to_element.down'(findTestObject('iOS/Send Money screen/Terms and Agreement button'))

CustomKeywords.'global.verify_element.exist'(Promo_Description)