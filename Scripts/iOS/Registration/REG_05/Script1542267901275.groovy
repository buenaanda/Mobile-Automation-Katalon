import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.enterMobileNumber'("927181913")
TestObject Mobile_Number_Error = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Mobile number should be at least 10-digit long.'])
CustomKeywords.'global.verify_element.exist'(Mobile_Number_Error)