import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Receiver_Current_Address = findTestObject('iOS/Global/Generic text', [('label') : '503 Tindalo, 1442, Cambodia'])
TestObject Destination_Country = findTestObject('iOS/Global/Generic text', [('label') : 'Cambodia'])

CustomKeywords.'iOS.send_money_screen.selectCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo')

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Receiver_Current_Address)

CustomKeywords.'global.verify_element.exist'(Destination_Country)

