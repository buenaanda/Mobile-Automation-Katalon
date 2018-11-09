import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Receiver_Current_Address = findTestObject('iOS/Send Money Screen/Generic text', [('label') : '086 Bgy Loob, 3117, Vietnam'])
TestObject Destination_Country = findTestObject('iOS/Send Money Screen/Generic text', [('label') : 'Vietnam'])

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

TestObject Country_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Cambodia'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_field, 'Vietnam')

TestObject Postal_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '1442'])

CustomKeywords.'iOS.send_money_screen.enterField'(Postal_field, '3117')

TestObject UnitHouse_NumberBuildingStreet_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '503 Tindalo'])

CustomKeywords.'iOS.send_money_screen.enterField'(UnitHouse_NumberBuildingStreet_field, '086 Bgy Loob')

TestObject Destination_Country_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Cambodia'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Destination_Country_field, 'Vietnam')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Current_Address)

CustomKeywords.'global.verify_element.exist'(Destination_Country)