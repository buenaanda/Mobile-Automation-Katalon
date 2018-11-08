import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

import internal.GlobalVariable

String sendMoneyObject = GlobalVariable.sendMoneyScreen_iOS

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Unemployed')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyObject + 'Position field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyObject + 'Employer Name field'))

TestObject Occupation_field = findTestObject(sendMoneyObject + 'Generic field', [('value') : 'Unemployed'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Student')

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyObject + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyObject + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'School Name field'))

TestObject Occupation_field = findTestObject(sendMoneyObject + 'Generic field', [('value') : 'Student'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Driver')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyObject + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Employer Name field'))

TestObject Occupation_field = findTestObject(sendMoneyObject + 'Generic field', [('value') : 'Driver'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'IT and Tech Professional')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Source of Funds field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Employer Name field'))

