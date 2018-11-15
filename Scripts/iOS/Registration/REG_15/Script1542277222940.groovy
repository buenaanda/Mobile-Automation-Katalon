import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomFirstName = (new random_data()).firstName()
String firstName = GlobalVariable.randomFirstName

CustomKeywords.'iOS.registration_screen.enterFirstName'(firstName)
CustomKeywords.'global.verify_element.text'(findTestObject('iOS/Registration screen/First Name field'), firstName)