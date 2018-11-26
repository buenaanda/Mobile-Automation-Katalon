import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'android.send_money_screen.tapCurrentAddress'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Country field'), 'Vietnam')
