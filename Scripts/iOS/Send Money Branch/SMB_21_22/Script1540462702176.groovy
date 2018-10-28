import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Unemployed')

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Position field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Employer Name field'))

TestObject Occupation_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Unemployed'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Student')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/School Name field'))

TestObject Occupation_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Student'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Driver')

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Employer Name field'))

TestObject Occupation_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Driver'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'IT and Tech Professional')

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Source of Funds field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Employer Name field'))

'SMB_22: User can select Position'
CustomKeywords.'iOS.send_money_screen.selectPosition'('Entry Level')

TestObject Position_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Entry Level'])

CustomKeywords.'global.verify_element.text'(Position_field, 'Entry Level')

