import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'android.send_money_screen.selectCountry'('Cambodia')

CustomKeywords.'android.send_money_screen.enterPostal'('1442')

CustomKeywords.'android.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo')

CustomKeywords.'android.send_money_screen.selectDestinationCountry'('Cambodia')

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Address'), '503 Tindalo, 1442, Cambodia')

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Destination Country'), 'Cambodia')

