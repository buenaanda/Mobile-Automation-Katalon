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


suiteProperties.put('id', 'Test Suites/iOS/Send Money/Send Money Branch Test Suite')

suiteProperties.put('name', 'Send Money Branch Test Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/appleramos/Katalon Studio/mobile-automation-katalon/Reports/iOS/Send Money/Send Money Branch Test Suite/20181107_224052/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/iOS/Send Money/Send Money Branch Test Suite', suiteProperties, [new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_01', 'Test Cases/iOS/Send Money Branch/SMB_01',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_07', 'Test Cases/iOS/Send Money Branch/SMB_07',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_02', 'Test Cases/iOS/Send Money Branch/SMB_02',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_03_04', 'Test Cases/iOS/Send Money Branch/SMB_03_04',  null), new TestCaseBinding('Test Cases/iOS/Send Money Branch/SMB_04', 'Test Cases/iOS/Send Money Branch/SMB_04',  null)])
