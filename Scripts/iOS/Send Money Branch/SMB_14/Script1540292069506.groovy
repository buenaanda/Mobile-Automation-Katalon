import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('123#/-,qwertyuiopasdfghjklzxcvbnmqwertyui')

TestObject UnitHouse_NumberBuildingStreet_field = findTestObject('iOS/Send Money screen/UnitHouse NumberBuildingStreet field', 
    [('value') : '123#/-,qwertyuiopasdfghjklzxcvbnmqwertyu'])

CustomKeywords.'global.verify_element.text'(findTestObject(UnitHouse_NumberBuildingStreet_field), '123#/-,qwertyuiopasdfghjklzxcvbnmqwertyu')

