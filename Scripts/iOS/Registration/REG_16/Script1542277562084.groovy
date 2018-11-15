import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomMiddleName = (new random_data()).middleName()()
String middleName = GlobalVariable.randomMiddleName

CustomKeywords.'iOS.registration_screen.enterMiddleName'(middleName)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/Middle Name field'), middleName)