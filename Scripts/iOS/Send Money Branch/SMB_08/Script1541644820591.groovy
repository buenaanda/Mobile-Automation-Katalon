import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject as TestObject

import internal.GlobalVariable as GlobalVariable

import global.random_data


String firstName = GlobalVariable.randomFirstName

String lastName = GlobalVariable.randomLastName

String mobileNumber = GlobalVariable.randomMobileNumber

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject First_name_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : firstName])

GlobalVariable.randomFirstName = (new random_data()).firstName()

String newFirstName = GlobalVariable.randomFirstName

CustomKeywords.'iOS.send_money_screen.enterField'(First_name_field, newFirstName)

TestObject Last_name_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : lastName])

GlobalVariable.randomLastName = (new random_data().lastName())

String newLastName = GlobalVariable.randomLastName

CustomKeywords.'iOS.send_money_screen.enterField'(Last_name_field, newLastName)

CustomKeywords.'iOS.send_money_screen.tapSave'()

String newFirstNameLastName = newFirstName +" "+ newLastName

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : newFirstNameLastName]), newFirstNameLastName)

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : mobileNumber + " "]), mobileNumber+'\n')