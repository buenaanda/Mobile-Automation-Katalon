import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

TestObject Message = findTestObject('iOS/Send Money screen/Generic text', [('label') : GlobalVariable.randomSentence])
TestObject Message_Charge = findTestObject('iOS/Send Money screen/Generic text', [('label') : "PHP 50.00"])
TestObject Service_Charge = findTestObject('iOS/Send Money screen/Generic text', [('label') : "PHP 250.00"])
TestObject Personal_Message_label = findTestObject('iOS/Send Money screen/Generic text', [('label') : 'Personal Message'])

CustomKeywords.'global.verify_element.exist'(Message)

CustomKeywords.'global.verify_element.exist'(Message_Charge)

CustomKeywords.'iOS.send_money_screen.checkTermsAndAgreement'()

CustomKeywords.'iOS.send_money_screen.tapCompleteBranchTransaction'()

CustomKeywords.'iOS.send_money_screen.tapViewDetails'()

CustomKeywords.'global.scroll_to_element.down'(Personal_Message_label)

CustomKeywords.'global.verify_element.exist'(Message)

CustomKeywords.'global.verify_element.exist'(Message_Charge)

CustomKeywords.'global.verify_element.exist'(Service_Charge)