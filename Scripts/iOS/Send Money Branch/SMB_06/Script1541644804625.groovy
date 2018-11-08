import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject as TestObject

import internal.GlobalVariable as GlobalVariable


String firstName = GlobalVariable.randomFirstName

String middleName = GlobalVariable.randomMiddleName

String lastName = GlobalVariable.randomLastName

String mobileNumber = GlobalVariable.randomMobileNumber

String phoneNumber = GlobalVariable.randomPhoneNumber

String firstNameLastName = firstName +"  "+ lastName

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

TestObject Middle_name_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : middleName])

CustomKeywords.'iOS.send_money_screen.enterField'(Middle_name_field, '')

TestObject Phone_number_field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : phoneNumber])

CustomKeywords.'iOS.send_money_screen.enterField'(Phone_number_field, '')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : firstNameLastName]), firstNameLastName)

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : mobileNumber + " "]), mobileNumber +'\n')