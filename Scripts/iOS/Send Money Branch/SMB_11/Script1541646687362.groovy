import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Generic field', [('value') : 'Vietnam'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'Mexico')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/ProvinceState field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/DistrictCity required field'))