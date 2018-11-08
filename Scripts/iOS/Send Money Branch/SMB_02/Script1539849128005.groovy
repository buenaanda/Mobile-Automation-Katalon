import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Tap Personal Information button'
CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Personal Information screen/First name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Personal Information screen/Middle name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Personal Information screen/Last name field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Personal Information screen/Mobile number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Personal Information screen/Phone Number field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Global/Save button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Global/Close button'))

