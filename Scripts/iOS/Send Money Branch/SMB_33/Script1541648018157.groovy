import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String objectPath = 'iOS/Global/Generic text'

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String phoneNumber = GlobalVariable.randomPhoneNumber
String fullName = firstName +" "+ middleName +" "+ lastName
String address = "503 Tindalo St, 1442, Thailand"
String country = "Thailand"
String occupation = "Unemployed"
String sourceOfFunds = GlobalVariable.randomSourceOfFunds
String sendAmount = "PHP "+ GlobalVariable.randomAmount + ".00"
String serviceFee = GlobalVariable.internationalServiceFee

CustomKeywords.'iOS.send_money_screen.tapNext'()

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : fullName]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : '66 ' + mobileNumber +" "+ phoneNumber]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : country]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : occupation]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : sourceOfFunds]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : 'NONE']))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : sendAmount]))

CustomKeywords.'global.scroll_to_element.down'(findTestObject('iOS/Send Money screen/Terms and Agreement checkbox'))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : serviceFee]))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : 'No message']))

CustomKeywords.'global.verify_element.exist'(findTestObject(objectPath, [('label') : 'PHP 0.00']))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Terms and Agreement button'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Terms and Agreement checkbox'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Complete Branch Transaction button'))
