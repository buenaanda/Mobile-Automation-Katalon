import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Country is required']), 'Country is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Postal is required']), 'Postal is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Present address is required']), 'Present address is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Destination country is required']), 'Destination country is required')