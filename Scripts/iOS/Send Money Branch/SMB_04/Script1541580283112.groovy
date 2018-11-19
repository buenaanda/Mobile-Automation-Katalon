import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

TestObject First_name_field = findTestObject('iOS/Global/Generic field', [('value') : GlobalVariable.randomFirstName])
TestObject Last_name_field = findTestObject('iOS/Global/Generic field', [('value') : GlobalVariable.randomLastName])
TestObject Mobile_number_field = findTestObject('iOS/Global/Generic field', [('value') : GlobalVariable.randomMobileNumber])
TestObject Firstname_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Firstname is required'])
TestObject Lastname_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Lastname is required'])
TestObject Mobile_number_is_required_error = findTestObject('iOS/Global/Generic text', [('label') : 'Mobile number is required'])

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, '')

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, '')

CustomKeywords.'iOS.send_money_screen.enterField'(Mobile_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(Firstname_is_required_error)

CustomKeywords.'global.verify_element.exist'(Lastname_is_required_error)

CustomKeywords.'global.verify_element.exist'(Mobile_number_is_required_error)

