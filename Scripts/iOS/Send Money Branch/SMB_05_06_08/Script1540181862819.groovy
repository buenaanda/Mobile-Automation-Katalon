import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject

CustomKeywords.'iOS.send_money_screen.enterFirstName'('Buena')

CustomKeywords.'iOS.send_money_screen.enterMiddleName'('Garcia')

CustomKeywords.'iOS.send_money_screen.enterLastName'('Anda')

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'('09271819134')

CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'('021234567')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver name', [('label') : 'Buena Garcia Anda']), 'Buena Garcia Anda')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver contact', [('label') : '09271819134 021234567']), "09271819134"+"\n"+"021234567")

'SMB_06 : Tap Personal Information button'
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject Middle_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Garcia'])

CustomKeywords.'iOS.send_money_screen.enterField'(Middle_name_field, '')

TestObject Phone_number_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '021234567'])

CustomKeywords.'iOS.send_money_screen.enterField'(Phone_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver name', [('label') : 'Buena  Anda']), 'Buena  Anda')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver contact', [('label') : '09271819134 ']), '09271819134'+'\n')

'SMB_08 : Tap Personal Information button'
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject First_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Buena'])

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, 'Kat')

TestObject Last_name_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Buena'])

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, 'Alon')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver name', [('label') : 'Kat  Alon']), 'Kat  Alon')

CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Send Money screen/Receiver contact', [('label') : '09271819134 ']), '09271819134'+'\n')
