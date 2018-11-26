import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/City field'))

CustomKeywords.'android.send_money_screen.selectCountry'(findTestObject('android/Send Money screen/Country field'), 'Mexico')

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/ProvinceState field'), "Province/State *")

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/City field'), "City *")