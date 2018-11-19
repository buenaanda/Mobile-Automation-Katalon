import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Destination_Country_field

Destination_Country_field = findTestObject('iOS/Global/Generic field', [('value') : 'Vietnam'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Destination_Country_field, 'Mexico')

Destination_Country_field = findTestObject('iOS/Global/Generic field', [('value') : 'Mexico'])

CustomKeywords.'global.verify_element.text'(Destination_Country_field, 'Mexico')