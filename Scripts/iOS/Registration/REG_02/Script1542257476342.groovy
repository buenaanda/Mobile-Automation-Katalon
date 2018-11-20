import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import global.object

CustomKeywords.'iOS.registration_screen.tapUseMobileNumber'()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Privacy Policy button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Terms And Agreement button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Terms And Agreement checkbox'))

CustomKeywords.'iOS.registration_screen.tapPrivacyPolicy'()
TestObject Privacy_Policy = findTestObject('iOS/Global/Generic text', [('label') : 'Privacy Policy'])
CustomKeywords.'global.verify_element.exist'(Privacy_Policy)
CustomKeywords.'iOS.registration_screen.tapTermsAndAgreement'()
TestObject Terms_And_Agreement = findTestObject('iOS/Global/Generic text', [('label') : 'Terms and Conditions of the PERA HUB Mobile Application Service'])
CustomKeywords.'global.verify_element.exist'(Terms_And_Agreement)

CustomKeywords.'iOS.registration_screen.checkTermsAndAgreement'()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Mobile Country Code'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Mobile Number field'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Registration screen/Login Now button'))
(new object()).hideKeypad()
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Global/Next button'))
CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Global/Close button'))
