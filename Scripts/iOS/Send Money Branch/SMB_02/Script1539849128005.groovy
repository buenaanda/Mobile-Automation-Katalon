import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Tap Personal Information button'
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/First name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Middle name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Last name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Mobile number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Phone Number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Save button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Close button'))

