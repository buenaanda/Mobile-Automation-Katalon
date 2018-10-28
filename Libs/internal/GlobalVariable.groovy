package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object otp
     
    /**
     * <p></p>
     */
    public static Object invalidUsernamePasswordError
     
    /**
     * <p></p>
     */
    public static Object invalidOTPError
     
    /**
     * <p></p>
     */
    public static Object inactiveError
     
    /**
     * <p></p>
     */
    public static Object appPath
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['username' : 'allen_15', 'password' : 'Hello!23', 'otp' : '111111', 'invalidUsernamePasswordError' : 'username and password did not match in our records.', 'invalidOTPError' : 'Wrong OTP Code', 'inactiveError' : 'It seems that your been inactive for a while. Please do login again.', 'appPath' : '/Data Files/PeraHub v1.0.5-QAT.app'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        username = selectedVariables['username']
        password = selectedVariables['password']
        otp = selectedVariables['otp']
        invalidUsernamePasswordError = selectedVariables['invalidUsernamePasswordError']
        invalidOTPError = selectedVariables['invalidOTPError']
        inactiveError = selectedVariables['inactiveError']
        appPath = selectedVariables['appPath']
        
    }
}
