import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required'), 'Occupation is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required'), 'Position is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required'), 'Source of funds is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required'), 'Employer is required')

