package tests;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import pages.CustomerLoginPage;
import pages.BasePage;
import utils.AppiumDriverManager;

public class LoginTest extends BasePage {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    public LoginTest(AndroidDriver driver) {
        super(driver);
    }

    @Test
    public void loginWithValidData() throws MalformedURLException {
        // Initialize Appium driver
        AndroidDriver driver = AppiumDriverManager.getDriver();
        logger.info("Appium driver initialized successfully.");

        // Perform login actions
        CustomerLoginPage loginPage = new CustomerLoginPage(driver);
        // Add login actions here
        logger.info("Performed login actions.");

        // Quit driver
    }
}
