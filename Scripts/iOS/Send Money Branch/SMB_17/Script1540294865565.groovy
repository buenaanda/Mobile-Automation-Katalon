import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject

TestObject Country_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Country is required'])
TestObject Postal_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Postal is required'])
TestObject Present_address_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Present address is required'])
TestObject Destination_country_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Destination country is required'])

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Country_is_required_error)

CustomKeywords.'global.verify_element.exist'(Postal_is_required_error)

CustomKeywords.'global.verify_element.exist'(Present_address_is_required_error)

CustomKeywords.'global.verify_element.exist'(Destination_country_is_required_error)