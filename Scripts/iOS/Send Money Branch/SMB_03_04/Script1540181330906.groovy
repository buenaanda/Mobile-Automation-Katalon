import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.enterFirstName'('Buena')

CustomKeywords.'iOS.send_money_screen.enterLastName'('Anda')

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'('09271819134')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver name', [('label') : 'Buena  Anda']), 'Buena  Anda')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver contact', [('label') : '09271819134']), '09271819134')

'SMB_04 : Tap Personal Information button'
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject First_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Buena'])

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, '')

TestObject Last_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Anda'])

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, '')

TestObject Mobile_number_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '09271819134'])

CustomKeywords.'iOS.send_money_screen.enterField'(Mobile_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Firstname is required']), 'Firstname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Lastname is required']), 'Lastname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Mobile number is required']), 'Mobile number is required')

