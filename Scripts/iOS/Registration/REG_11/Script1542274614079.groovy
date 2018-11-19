import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.registration_screen.enterPassword'('Hell')
TestObject Password_Status = findTestObject('null', [('label') : 'Weak'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!')
Password_Status = findTestObject('null', [('label') : 'Good'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!2')
Password_Status = findTestObject('null', [('label') : 'Great'])
CustomKeywords.'global.verify_element.exist'(Password_Status)
CustomKeywords.'iOS.registration_screen.enterPassword'('Hello!23')
Password_Status = findTestObject('null', [('label') : 'Excellent'])
CustomKeywords.'global.verify_element.exist'(Password_Status)

