import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.enterPassword'('Hell')
TestObject Password_Status = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Weak'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!')
Password_Status = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Good'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!2')
Password_Status = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Great'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!23')
Password_Status = findTestObject('iOS/Registration screen/Generic text', [('label') : 'Excellent'])
CustomKeywords.'global.verify_element.exist'(Password_Status)

