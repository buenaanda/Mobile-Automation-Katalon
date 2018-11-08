import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null'), 'Occupation is required')

CustomKeywords.'global.verify_element.text'(findTestObject('null'), 'Position is required')

CustomKeywords.'global.verify_element.text'(findTestObject('null'), 'Source of funds is required')

CustomKeywords.'global.verify_element.text'(findTestObject('null'), 'Employer is required')

