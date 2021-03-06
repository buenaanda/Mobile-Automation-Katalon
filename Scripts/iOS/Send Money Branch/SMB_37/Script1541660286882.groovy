import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable

String senderMobileNumber = "63" + GlobalVariable.mobileNumber

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'iOS.send_money_screen.checkTermsAndAgreement'()

CustomKeywords.'iOS.send_money_screen.tapCompleteBranchTransaction'()

TestObject Success_screen_message = findTestObject('iOS/Global/Generic text', [('label') : 'You can now go to a branch to send your money!'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

Success_screen_message = findTestObject('iOS/Global/Generic text', [('label') : 'To complete your transaction, please present your mobile number along with the required documents at a PERA HUB branch'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

Success_screen_message = findTestObject('iOS/Global/Generic text', [('label') : 'Present your mobile # to Pera Hub Branch'])

CustomKeywords.'global.verify_element.exist'(Success_screen_message)

TestObject Mobile_Number = findTestObject('iOS/Global/Generic text', [('label') : senderMobileNumber])

CustomKeywords.'global.verify_element.exist'(Mobile_Number)

