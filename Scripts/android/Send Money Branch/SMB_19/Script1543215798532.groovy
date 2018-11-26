import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'android.send_money_screen.tapCurrentAddress'()

CustomKeywords.'android.send_money_screen.selectCountry'('Vietnam')

CustomKeywords.'android.send_money_screen.enterPostal'('3117')

CustomKeywords.'android.send_money_screen.enterUnitHouseNumberBuildingStreet'('086 Bgy Loob')

CustomKeywords.'android.send_money_screen.selectDestinationCountry'('Vietnam')

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Receiver Address'), '086 Bgy Loob, 3117, Vietnam')

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Destination Country'), 'Vietnam')