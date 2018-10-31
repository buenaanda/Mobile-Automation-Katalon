import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.enterPostal'('1234567890')

TestObject Postal_Field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '123456789'])

CustomKeywords.'global.verify_element.exist'(Postal_Field)

