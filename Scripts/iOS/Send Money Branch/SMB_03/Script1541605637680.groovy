import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.configuration.RunConfiguration

import global.random_data
import internal.GlobalVariable
////
Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)
Mobile.delay(30)
////
GlobalVariable.randomFirstName = (new random_data()).firstName()

GlobalVariable.randomLastName = (new random_data()).lastName()

GlobalVariable.randomMobileNumber = (new random_data().mobileNumber())

String firstName = GlobalVariable.randomFirstName

String lastName = GlobalVariable.randomLastName

String mobileNumber = GlobalVariable.randomMobileNumber

String receiverName = firstName +'  '+ lastName

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : receiverName]), receiverName)

CustomKeywords.'global.verify_element.text'(findTestObject('null', [('label') : mobileNumber]), mobileNumber)