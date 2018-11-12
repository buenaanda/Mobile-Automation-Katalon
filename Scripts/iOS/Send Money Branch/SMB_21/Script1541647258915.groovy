import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable

String sendMoneyScreen = GlobalVariable.sendMoneyScreen_iOS

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Unemployed')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Employer Name field'))

TestObject Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Unemployed'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Student')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'School Name field'))

Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Student'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Driver')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Employer Name field'))

Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Driver'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'IT and Tech Professional')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Employer Name field'))
