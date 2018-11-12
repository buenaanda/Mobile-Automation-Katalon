import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

TestObject Message = findTestObject('iOS/Send Money screen/Generic text', [('label') : GlobalVariable.randomSentence])
TestObject Message_Charge = findTestObject('iOS/Send Money screen/Generic text', [('label') : "PHP 50.00"])

CustomKeywords.'global.verify_element.exist'(Message)

CustomKeywords.'global.verify_element.exist'(Message_Charge)