import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.enterMobileNumber'("0000000000")
CustomKeywords.'iOS.registration_screen.tapNext'()
TestObject SMS_Sending_Error = findTestObject('iOS/Registration screen/Generic text', [('label') : 'SMS sending error'])
CustomKeywords.'iOS.registration_screen.tapOK'()
