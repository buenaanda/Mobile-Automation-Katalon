import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/iOS/PERA Hub Test Suite')

suiteProperties.put('name', 'PERA Hub Test Suite')

suiteProperties.put('description', 'Login, Send Money Branch')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/buenaanda/Katalon Studio/mobile-automation-katalon/Reports/iOS/PERA Hub Test Suite/20181119_184528/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/iOS/PERA Hub Test Suite', suiteProperties, [new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_01', 'Test Cases/iOS/Send Money Branch/SMB_01',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_07', 'Test Cases/iOS/Send Money Branch/SMB_07',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_02', 'Test Cases/iOS/Send Money Branch/SMB_02',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_03', 'Test Cases/iOS/Send Money Branch/SMB_03',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_04', 'Test Cases/iOS/Send Money Branch/SMB_04',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_05', 'Test Cases/iOS/Send Money Branch/SMB_05',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_06', 'Test Cases/iOS/Send Money Branch/SMB_06',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_08', 'Test Cases/iOS/Send Money Branch/SMB_08',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_09', 'Test Cases/iOS/Send Money Branch/SMB_09',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_17', 'Test Cases/iOS/Send Money Branch/SMB_17',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_18', 'Test Cases/iOS/Send Money Branch/SMB_18',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_19', 'Test Cases/iOS/Send Money Branch/SMB_19',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_10', 'Test Cases/iOS/Send Money Branch/SMB_10',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_11', 'Test Cases/iOS/Send Money Branch/SMB_11',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_12', 'Test Cases/iOS/Send Money Branch/SMB_12',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_13', 'Test Cases/iOS/Send Money Branch/SMB_13',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_14', 'Test Cases/iOS/Send Money Branch/SMB_14',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_15', 'Test Cases/iOS/Send Money Branch/SMB_15',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_16', 'Test Cases/iOS/Send Money Branch/SMB_16',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_20', 'Test Cases/iOS/Send Money Branch/SMB_20',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_25', 'Test Cases/iOS/Send Money Branch/SMB_25',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_21', 'Test Cases/iOS/Send Money Branch/SMB_21',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_22', 'Test Cases/iOS/Send Money Branch/SMB_22',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_23', 'Test Cases/iOS/Send Money Branch/SMB_23',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_24', 'Test Cases/iOS/Send Money Branch/SMB_24',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_26', 'Test Cases/iOS/Send Money Branch/SMB_26',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_29', 'Test Cases/iOS/Send Money Branch/SMB_29',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_28', 'Test Cases/iOS/Send Money Branch/SMB_28',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_33', 'Test Cases/iOS/Send Money Branch/SMB_33',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_34', 'Test Cases/iOS/Send Money Branch/SMB_34',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_38', 'Test Cases/iOS/Send Money Branch/SMB_38',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_37', 'Test Cases/iOS/Send Money Branch/SMB_37',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_42', 'Test Cases/iOS/Send Money Branch/SMB_42',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_43', 'Test Cases/iOS/Send Money Branch/SMB_43',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_31', 'Test Cases/iOS/Send Money Branch/SMB_31',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_32', 'Test Cases/iOS/Send Money Branch/SMB_32',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_35', 'Test Cases/iOS/Send Money Branch/SMB_35',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_36', 'Test Cases/iOS/Send Money Branch/SMB_36',  null)])
