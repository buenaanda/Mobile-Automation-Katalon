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


suiteProperties.put('id', 'Test Suites/iOS/Registration/Registration')

suiteProperties.put('name', 'Registration')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/buenaanda/Katalon Studio/mobile-automation-katalon/Reports/iOS/Registration/Registration/20181116_183959/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/iOS/Registration/Registration', suiteProperties, [new TestCaseBinding('Test Cases/iOS/Registration/REG_01', 'Test Cases/iOS/Registration/REG_01',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_02', 'Test Cases/iOS/Registration/REG_02',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_03', 'Test Cases/iOS/Registration/REG_03',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_04', 'Test Cases/iOS/Registration/REG_04',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_05', 'Test Cases/iOS/Registration/REG_05',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_06', 'Test Cases/iOS/Registration/REG_06',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_07', 'Test Cases/iOS/Registration/REG_07',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_09', 'Test Cases/iOS/Registration/REG_09',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_08', 'Test Cases/iOS/Registration/REG_08',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_14', 'Test Cases/iOS/Registration/REG_14',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_10', 'Test Cases/iOS/Registration/REG_10',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_11', 'Test Cases/iOS/Registration/REG_11',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_12', 'Test Cases/iOS/Registration/REG_12',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_13', 'Test Cases/iOS/Registration/REG_13',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_15', 'Test Cases/iOS/Registration/REG_15',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_16', 'Test Cases/iOS/Registration/REG_16',  null), new TestCaseBinding('Test Cases/iOS/Registration/REG_17', 'Test Cases/iOS/Registration/REG_17',  null)])
