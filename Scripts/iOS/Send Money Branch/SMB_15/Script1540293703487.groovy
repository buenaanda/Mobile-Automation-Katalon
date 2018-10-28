import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Mexico')

TestObject Destination_Country_field = findTestObject('iOS/Send Money screen/Destination Country field', [('value') : 'Mexico'])

CustomKeywords.'global.verify_element.text'(findTestObject(Destination_Country_field), 'Mexico')