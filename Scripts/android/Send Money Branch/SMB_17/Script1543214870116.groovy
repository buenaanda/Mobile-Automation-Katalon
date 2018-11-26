import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject

CustomKeywords.'android.send_money_screen.tapSave'()

CustomKeywords.'android.send_money_screen.tapClose'()

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Country error'), "Address Country is required")

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Postal error'), "Postal is required")

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/House Number error'), "House No is required")

CustomKeywords.'global.verify_element.text'(findTestObject('android/Send Money screen/Destination Country error'), "Destination Country is required")