import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Tap Personal Information button'
CustomKeywords.'android.send_money_screen.tapPersonalInformation'()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/First Name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Middle Name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Last Name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Mobile Number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Landline Number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Global/Save button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Global/x button'))

