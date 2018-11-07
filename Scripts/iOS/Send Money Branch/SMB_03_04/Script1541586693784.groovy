import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

import global.random_data
import internal.GlobalVariable

String firstName = (new random_data()).firstName()

String lastName = (new random_data()).lastName()

String mobileNumber = (new random_data().mobileNumber())

String receiverName = firstName +'  '+ lastName

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'("09271819134")

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver name', [('label') : receiverName]), receiverName)

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver contact', [('label') : "09271819134"]), "09271819134")

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject First_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : firstName])

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, '')

TestObject Last_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : lastName])

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, '')

TestObject Mobile_number_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : mobileNumber])

CustomKeywords.'iOS.send_money_screen.enterField'(Mobile_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Firstname is required']),
	'Firstname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Lastname is required']),
	'Lastname is required')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Error required', [('label') : 'Mobile number is required']),
	'Mobile number is required')