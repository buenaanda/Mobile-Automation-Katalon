
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : 'India'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'Mexico')

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity field'))