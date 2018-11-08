import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject First_name_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : GlobalVariable.randomFirstName])

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, '')

TestObject Last_name_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : GlobalVariable.randomLastName])

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, '')

TestObject Mobile_number_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : GlobalVariable.randomMobileNumber])

CustomKeywords.'iOS.send_money_screen.enterField'(Mobile_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : 'Firstname is required']), 
    'Firstname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : 'Lastname is required']), 
    'Lastname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : 'Mobile number is required']), 
    'Mobile number is required')

