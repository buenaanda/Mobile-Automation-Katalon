import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Country_dropdown = findTestObject('iOS/Global/Generic field', [('value') : 'Vietnam'])

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

CustomKeywords.'global.verify_element.text'(Country_dropdown, 'Vietnam')
