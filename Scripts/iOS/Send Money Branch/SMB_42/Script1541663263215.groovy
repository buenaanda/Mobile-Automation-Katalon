import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

String senderMobileNumber = "63" + GlobalVariable.mobileNumber
String senderName = "Allen Pogi Crisostomo"
String receiverName = GlobalVariable.randomFirstName +" "+ GlobalVariable.randomMiddleName +" "+ GlobalVariable.randomLastName
String receiverMobileNumber = "91"+ GlobalVariable.randomMobileNumber
String serviceFee = GlobalVariable.internationalServiceFee

CustomKeywords.'iOS.send_money_screen.tapViewDetails'()

TestObject Sender_Mobile_Number_label = findTestObject('iOS/Send Money screen/Generic text', [('label') : senderMobileNumber])

CustomKeywords.'global.verify_element.exist'(findTestObject(Sender_Mobile_Number_label))

CustomKeywords.'global.verify_element.exist'(findTestObject('null', [('label') : senderName]))

CustomKeywords.'global.verify_element.exist'(findTestObject('null', [('label') : 'Philippines']))

CustomKeywords.'global.verify_element.exist'(findTestObject('null', [('label') : receiverName]))

CustomKeywords.'global.verify_element.exist'(findTestObject('null', [('label') : serviceFee]))

CustomKeywords.'global.verify_element.exist'(findTestObject('null', [('label') : 'PHP 0.00']))