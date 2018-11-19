import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.enterEmployerName'('White Cloak Inc.')

TestObject Employer_Name_field = findTestObject('iOS/Global/Generic field', [('value') : 'White Cloak Inc.'])

CustomKeywords.'global.verify_element.text'(Employer_Name_field, 'White Cloak Inc.')

