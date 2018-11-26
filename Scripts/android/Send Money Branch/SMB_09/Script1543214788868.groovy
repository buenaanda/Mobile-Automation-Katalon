import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'android.send_money_screen.tapCurrentAddress'()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Country field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/City field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Postal field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/UnitHouse numberBuildingStreet field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Destination Country field'))

