import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String sendMoneyObject = GlobalVariable.sendMoneyScreen_iOS

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String phoneNumber = GlobalVariable.randomPhoneNumber
String fullName = firstName +" "+ middleName +" "+ lastName
String address = "503 Tindalo St, 1442, India"
String country = "India"
String occupation = "Unemployed"
String sourceOfFunds = GlobalVariable.randomSourceOfFunds
String receiveAmount = "INR "+ GlobalVariable.randomAmount + ".00"
String serviceFee = GlobalVariable.internationalServiceFee

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Receiver name', [('label') : fullName]), fullName)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Receiver contact', [('label') : '91' + mobileNumber +" "+ phoneNumber]), '91' + mobileNumber + "\n" + phoneNumber)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Destination country', [('label') : country]), country)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Occupation', [('label') : occupation]), occupation)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Source of Funds', [('label') : sourceOfFunds]), sourceOfFunds)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Employer Name', [('label') : 'NONE']), 'NONE')

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Receive Amount', [('label') : receiveAmount]), receiveAmount)

CustomKeywords.'global.scroll_to_element.down'(findTestObject(sendMoneyObject + 'Terms and Agreement checkbox'))

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Service Fee', [('label') : serviceFee]), serviceFee)

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Message', [('label') : 'No message']), 'No message')

CustomKeywords.'global.verify_element.text'(findTestObject(sendMoneyObject + 'Message charge', [('label') : 'PHP 0.00']), 'PHP 0.00')

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Terms and Agreement button'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Terms and Agreement checkbox'))

CustomKeywords.'global.verify_element.exist'(findTestObject(sendMoneyObject + 'Complete Branch Transaction button'))
