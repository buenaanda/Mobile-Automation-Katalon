import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)
Mobile.delay(40)
///

String sendMoneyScreen = GlobalVariable.sendMoneyScreen_iOS

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Unemployed')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Employer Name field', [('value') : 'Employer\'s name*']))

TestObject Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Unemployed'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Student')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'School Name field', [('value') : 'School\'s name*']))

Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Student'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'Driver')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Employer Name field', [('value') : 'Employer\'s name*']))

Occupation_field = findTestObject(sendMoneyScreen + 'Generic field', [('value') : 'Driver'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Occupation_field, 'IT and Tech Professional')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Source of Funds field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Position field'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyScreen + 'Employer Name field', [('value') : 'Employer\'s name*']))
