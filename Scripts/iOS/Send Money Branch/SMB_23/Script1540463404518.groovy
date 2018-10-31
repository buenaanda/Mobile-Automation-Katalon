import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.selectSourceOfFunds'('Salary/Income')

TestObject Source_of_Funds_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Salary/Income'])

CustomKeywords.'global.verify_element.text'(Source_of_Funds_field, 'Salary/Income')

