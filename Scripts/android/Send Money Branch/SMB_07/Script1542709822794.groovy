import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject

CustomKeywords.'android.send_money_screen.tapPersonalInformation'()

CustomKeywords.'android.send_money_screen.tapClose'()

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/Send Money screen/Receiver Name'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('android/Send Money screen/Receiver Contact'))

