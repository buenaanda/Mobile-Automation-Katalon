import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

TestObject Occupation_is_required_error = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Occupation is required'])
TestObject Position_is_required_error = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Position is required'])
TestObject Source_of_funds_is_required_error = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Source of funds is required'])
TestObject Employer_is_required_error = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Employer is required'])

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Occupation_is_required_error)

CustomKeywords.'global.verify_element.exist'(Position_is_required_error)

CustomKeywords.'global.verify_element.exist'(Source_of_funds_is_required_error)

CustomKeywords.'global.verify_element.exist'(Employer_is_required_error)

