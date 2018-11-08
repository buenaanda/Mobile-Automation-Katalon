import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

TestObject Occupation_and_Level = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'IT and Tech Professional, Entry Level'])
TestObject Source_of_Funds = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Salary/Income'])
TestObject Employer_Name = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'White Cloak Inc.'])

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Occupation_and_Level)

CustomKeywords.'global.verify_element.exist'(Source_of_Funds)

CustomKeywords.'global.verify_element.exist'(Employer_Name)

Mobile.closeApplication()

