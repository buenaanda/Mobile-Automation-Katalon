import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.tapClose'()

TestObject Receiver_label = findTestObject('iOS/Send Money screen/Global/Generic text', [('label') : 'Receiver:'])

CustomKeywords.'global.verify_element.notExist'(findTestObject(Receiver_label))

TestObject Contact_label = findTestObject('iOS/Send Money screen/Global/Generic text', [('label') : 'Contact:'])

CustomKeywords.'global.verify_element.notExist'(findTestObject(Contact_label))

