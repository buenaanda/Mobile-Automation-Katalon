import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Country field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Postal field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/UnitHouse NumberBuildingStreet field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Destination Country field'))

