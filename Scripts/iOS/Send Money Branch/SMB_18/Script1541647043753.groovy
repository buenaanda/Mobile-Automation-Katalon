import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.selectCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo')

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : '503 Tindalo, 1442, Cambodia']), 
    '503 Tindalo, 1442, Cambodia')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Current Address screen/Destination country'), 'Cambodia')

