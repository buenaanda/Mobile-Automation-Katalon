import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.enterMobileNumber'("0000000000")
CustomKeywords.'iOS.registration_screen.tapNext'()
TestObject SMS_Sending_Error = findTestObject('iOS/Global/Generic text', [('label') : 'SMS sending error'])
CustomKeywords.'global.verify_element.exist'(SMS_Sending_Error)
CustomKeywords.'iOS.registration_screen.tapOK'()
