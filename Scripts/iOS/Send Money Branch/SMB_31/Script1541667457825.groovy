import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import global.random_data

GlobalVariable.randomFirstName = (new random_data()).firstName()
GlobalVariable.randomMiddleName = (new random_data()).middleName()
GlobalVariable.randomLastName = (new random_data()).lastName()
GlobalVariable.randomMobileNumber = (new random_data()).mobileNumber()
GlobalVariable.randomPhoneNumber = (new random_data()).phoneNumber()
GlobalVariable.randomSourceOfFunds = (new random_data()).sourceOfFunds()
GlobalVariable.randomAmount = (new random_data()).amount()
GlobalVariable.randomSentence = (new random_data()).message()

String firstName = GlobalVariable.randomFirstName
String middleName = GlobalVariable.randomMiddleName
String lastName = GlobalVariable.randomLastName
String mobileNumber = GlobalVariable.randomMobileNumber
String phoneNumber = GlobalVariable.randomPhoneNumber
String sourceOfFunds = GlobalVariable.randomSourceOfFunds
String amount = GlobalVariable.randomAmount
String message = GlobalVariable.randomSentence

CustomKeywords.'iOS.navigation_menu.tapTransferMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapSendMoney'()

CustomKeywords.'iOS.transfer_money_screen.tapBranchTransaction'()

CustomKeywords.'iOS.send_money_screen.tapPersonalInformation'()

CustomKeywords.'iOS.send_money_screen.enterFirstName'(firstName)

CustomKeywords.'iOS.send_money_screen.enterMiddleName'(middleName)

CustomKeywords.'iOS.send_money_screen.enterLastName'(lastName)

CustomKeywords.'iOS.send_money_screen.enterMobileNumber'(mobileNumber)

CustomKeywords.'iOS.send_money_screen.enterPhoneNumber'(phoneNumber)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.tapCurrentAddress'()

CustomKeywords.'iOS.send_money_screen.selectCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.enterPostal'('1442')

CustomKeywords.'iOS.send_money_screen.enterUnitHouseNumberBuildingStreet'('503 Tindalo St.')

CustomKeywords.'iOS.send_money_screen.selectDestinationCountry'('Cambodia')

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.tapSenderEmploymentInformation'()

CustomKeywords.'iOS.send_money_screen.selectOccupation'('Driver')

CustomKeywords.'iOS.send_money_screen.enterEmployerName'('Uber')

CustomKeywords.'iOS.send_money_screen.selectSourceOfFunds'(sourceOfFunds)

CustomKeywords.'iOS.send_money_screen.tapSave'()

CustomKeywords.'iOS.send_money_screen.enterAmount'(amount)

CustomKeywords.'iOS.send_money_screen.enterMessage'(message)

TestObject Message_Field = findTestObject('iOS/Send Money screen/Global/Generic field', [('value') : message])

CustomKeywords.'global.verify_element.text'(Message_Field, message)
