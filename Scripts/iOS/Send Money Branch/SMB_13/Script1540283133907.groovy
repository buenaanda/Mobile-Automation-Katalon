import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Postal_field = findTestObject('iOS/Global/Generic field', [('value') : '3117'])

CustomKeywords.'iOS.send_money_screen.enterField'(Postal_field, '1234567890')

TestObject Postal_Field = findTestObject('iOS/Global/Generic field', [('value') : '123456789'])

CustomKeywords.'global.verify_element.text'(Postal_Field, '123456789')

