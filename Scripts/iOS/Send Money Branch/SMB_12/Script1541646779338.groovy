import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity required field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : 'Mexico'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'United States')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity required field'))

TestObject Country_dropdown = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : 'United States'])

CustomKeywords.'iOS.send_money_screen.selectDropdown'(Country_dropdown, 'Philippines')

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState field'))

CustomKeywords.'global.verify_element.notExist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/ProvinceState required field'))

CustomKeywords.'global.verify_element.exist'(findTestObject('iOS/Send Money screen/Current Address screen/DistrictCity required field'))