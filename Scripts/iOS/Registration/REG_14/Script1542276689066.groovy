import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.tapSecurityDisclaimer'()
TestObject Security_Disclaimer = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Security Disclaimer'])
CustomKeywords.'global.verify_element.exist'(Security_Disclaimer)
CustomKeywords.'iOS.registration_screen.tapClose'()