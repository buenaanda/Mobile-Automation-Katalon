import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.tapClose'()

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Receiver'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Contact'))

