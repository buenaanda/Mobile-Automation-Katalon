import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomUsername = (new random_data()).username()

CustomKeywords.'iOS.registration_screen.enterUsername'(GlobalVariable.randomUsername)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/Username field'), GlobalVariable.randomUsername)