import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomLastName = (new random_data()).lastName()
String lastName = GlobalVariable.randomLastName

CustomKeywords.'iOS.registration_screen.enterLastName'(lastName)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/Last Name field'), lastName)