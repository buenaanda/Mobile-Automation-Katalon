import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

///
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(RunConfiguration.projectDir + GlobalVariable.appPath, false)
Mobile.delay(30)
///

TestObject UnitHouse_NumberBuildingStreet_field

UnitHouse_NumberBuildingStreet_field = findTestObject('iOS/Send Money screen/Generic field', [('value') : '086 Bgy Loob'])

CustomKeywords.'iOS.send_money_screen.enterField'(UnitHouse_NumberBuildingStreet_field, '123qwertyuiopasdfghjklzxcvbnmqwertyuirtrt')

UnitHouse_NumberBuildingStreet_field = findTestObject('iOS/Send Money screen/Generic field', 
    [('value') : '123qwertyuiopasdfghjklzxcvbnmqwertyuirtr'])

CustomKeywords.'global.verify_element.text'(UnitHouse_NumberBuildingStreet_field, '123qwertyuiopasdfghjklzxcvbnmqwertyuirtr')

