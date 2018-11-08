import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'iOS.send_money_screen.checkTermsAndAgreement'()

CustomKeywords.'iOS.send_money_screen.tapCompleteBranchTransaction'()

CustomKeywords.'global.verify_element.exist'(findTestObject("iOS/Send Money screen/Global/Generic text", [('value') : 'You can now go to a branch to send your money!']))

CustomKeywords.'global.verify_element.exist'(findTestObject("iOS/Send Money screen/Global/Generic text", [('value') : 'To complete your transaction, please present your mobile number along with the required documents at a PERA HUB branch']))

CustomKeywords.'global.verify_element.exist'(findTestObject("iOS/Send Money screen/Global/Generic text", [('value') : 'Present your mobile # to Pera Hub Branch']))

CustomKeywords.'global.verify_element.exist'(findTestObject("iOS/Send Money screen/Global/Generic text", [('value') : '639271819134']))

