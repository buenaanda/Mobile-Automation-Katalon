import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'iOS.send_money_screen.checkTermsAndAgreement'()

CustomKeywords.'iOS.send_money_screen.tapCompleteBranchTransaction'()

TestObject Success_screen_message = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'You can now go to a branch to send your money!'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

Success_screen_message = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'To complete your transaction, please present your mobile number along with the required documents at a PERA HUB branch'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

Success_screen_message = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Present your mobile # to Pera Hub Branch'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

TestObject Mobile_Number = findTestObject('iOS/Send Money screen/Generic text', [('label') : '639070405298'])

CustomKeywords.'global.verify_element.exist'(Mobile_Number)

