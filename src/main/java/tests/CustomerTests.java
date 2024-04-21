package tests;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import pages.CustomerLoginPage;
import utils.AppiumDriverManager;

public class CustomerTests {
    
    private static final Logger logger = LogManager.getLogger(CustomerTests.class);

    @Test(priority = 1, description = "Login as Customer")
    public void customer_Login_Test() throws MalformedURLException {
        AndroidDriver driver = AppiumDriverManager.getDriver();
        logger.info("Appium driver initialized successfully.");
        
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
        customerLoginPage.clickContiueAsCustomerButton();
        logger.info("Clicked on Sign Up button.");
        customerLoginPage.customer_EmailId_Text();
        logger.info("Entering Customer Email Id or PhoneNo.");
        
    }
       
}
