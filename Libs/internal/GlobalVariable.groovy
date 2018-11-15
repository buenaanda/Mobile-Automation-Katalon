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
     
    /**
     * <p></p>
     */
    public static Object randomFirstName
     
    /**
     * <p></p>
     */
    public static Object randomLastName
     
    /**
     * <p></p>
     */
    public static Object randomMobileNumber
     
    /**
     * <p></p>
     */
    public static Object randomMiddleName
     
    /**
     * <p></p>
     */
    public static Object randomPhoneNumber
     
    /**
     * <p></p>
     */
    public static Object randomAmount
     
    /**
     * <p></p>
     */
    public static Object sendMoneyScreen_iOS
     
    /**
     * <p></p>
     */
    public static Object randomSourceOfFunds
     
    /**
     * <p></p>
     */
    public static Object internationalServiceFee
     
    /**
     * <p></p>
     */
    public static Object mobileNumber
     
    /**
     * <p></p>
     */
    public static Object randomSentence
     
    /**
     * <p>Profile default : 50% off on service fee</p>
     */
    public static Object promoCode1
     
    /**
     * <p></p>
     */
    public static Object randomUsername
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['username' : 'allen_15', 'password' : 'Hello!23', 'otp' : '111111', 'invalidUsernamePasswordError' : 'username and password did not match in our records.', 'invalidOTPError' : 'Wrong OTP Code', 'inactiveError' : 'It seems that your been inactive for a while. Please do login again.', 'appPath' : '/Data Files/PeraHub_v3.2.0-Dev.app', 'randomFirstName' : '', 'randomLastName' : '', 'randomMobileNumber' : '', 'randomMiddleName' : '', 'randomPhoneNumber' : '', 'randomAmount' : '', 'sendMoneyScreen_iOS' : 'iOS/Send Money screen/', 'randomSourceOfFunds' : '', 'internationalServiceFee' : 'PHP 500.00', 'mobileNumber' : '9271819134', 'randomSentence' : '', 'promoCode1' : 'A0027', 'randomUsername' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        username = selectedVariables['username']
        password = selectedVariables['password']
        otp = selectedVariables['otp']
        invalidUsernamePasswordError = selectedVariables['invalidUsernamePasswordError']
        invalidOTPError = selectedVariables['invalidOTPError']
        inactiveError = selectedVariables['inactiveError']
        appPath = selectedVariables['appPath']
        randomFirstName = selectedVariables['randomFirstName']
        randomLastName = selectedVariables['randomLastName']
        randomMobileNumber = selectedVariables['randomMobileNumber']
        randomMiddleName = selectedVariables['randomMiddleName']
        randomPhoneNumber = selectedVariables['randomPhoneNumber']
        randomAmount = selectedVariables['randomAmount']
        sendMoneyScreen_iOS = selectedVariables['sendMoneyScreen_iOS']
        randomSourceOfFunds = selectedVariables['randomSourceOfFunds']
        internationalServiceFee = selectedVariables['internationalServiceFee']
        mobileNumber = selectedVariables['mobileNumber']
        randomSentence = selectedVariables['randomSentence']
        promoCode1 = selectedVariables['promoCode1']
        randomUsername = selectedVariables['randomUsername']
        
    }
}
