import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject Position_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Entry Level'])

CustomKeywords.'iOS.send_money_screen.selectPosition'('Entry Level')

CustomKeywords.'global.verify_element.text'(Position_field, 'Entry Level')