import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.selectCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo')

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Current Address', [('label') : '503 Tindalo, 1442, Cambodia']), 
    '503 Tindalo, 1442, Cambodia')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Destination Country'), 'Cambodia')

'SMB_19: User can edit any fields in Recipient\'s Address screen'
CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

TestObject Country_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Cambodia'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(findTestObject(Country_field), 'Vietnam')

TestObject Postal_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '1442'])

CustomKeywords.'iOS.send_money_screen.enterField'(findTestObject(Postal_field), '3117')

TestObject UnitHouse_NumberBuildingStreet_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '503 Tindalo'])

CustomKeywords.'iOS.send_money_screen.enterField'(findTestObject(UnitHouse_NumberBuildingStreet_field), '086 Bgy Loob')

TestObject Destination_Country_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Cambodia'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(findTestObject(Destination_Country_field), 'Vietnam')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Current Address', [('label') : '086 Bgy Loob, 3117, Vietnam']), 
    '086 Bgy Loob, 3117, Vietnam')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Destination Country'), 'Vietnam')

Mobile.closeApplication()

