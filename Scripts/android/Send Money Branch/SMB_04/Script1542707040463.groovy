import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'android.send_money_screen.tapPersonalInformation'()

CustomKeywords.'android.send_money_screen.enterFirstName'("")

CustomKeywords.'android.send_money_screen.enterLastName'("")

CustomKeywords.'android.send_money_screen.enterMobileNumber'("")

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Global/Generic text', [('text') : 'Please Complete Required Fields!']))

CustomKeywords.'android.send_money_screen.tapClose'()

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/First Name is required error'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Last Name is required error'))

CustomKeywords.'global.verify_element.exist'(findTestObject('android/Send Money screen/Mobile number is required error'))