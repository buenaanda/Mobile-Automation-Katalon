import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import global.random_data
import internal.GlobalVariable


String firstName = GlobalVariable.randomFirstName

String middleName = GlobalVariable.randomMiddleName

String lastName = GlobalVariable.randomLastName

String mobileNumber = GlobalVariable.randomMobileNumber

String phoneNumber = GlobalVariable.randomPhoneNumber

String fullName = firstName +" "+ middleName +" "+ lastName

String contact = mobileNumber +" "+ phoneNumber

String firstNameLastName = firstName +"  "+ lastName

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterMiddleName'(middleName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'(phoneNumber)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : fullName]), fullName)

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : contact]), mobileNumber+"\n"+phoneNumber)
