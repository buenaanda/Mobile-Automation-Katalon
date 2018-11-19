import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject

TestObject Receiver_label = findTestObject('iOS/Global/Generic text', [('label') : 'Receiver:'])
TestObject Contact_label = findTestObject('iOS/Global/Generic text', [('label') : 'Contact:'])

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.tapClose'()

CustomKeywords.'global.verify_element.notExist'(Receiver_label)

CustomKeywords.'global.verify_element.notExist'(Contact_label)

