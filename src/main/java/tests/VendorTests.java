package tests;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.ErrorMessages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.BasePage;
import pages.VendorLoginPage;
import pages.VendorSignUpPage;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.DataProviderClass;
import utils.Library;

public class VendorTests {

	VendorLoginPage vendorlog;

	AndroidDriver driver;

	private static final Logger logger = LogManager.getLogger(VendorTests.class);

	@Test(priority = 1, description = "SignUp As Vendor", enabled = false, dataProvider = "VendorSignUpTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignUp_Test(String name, String email, String mobile, String adhar, String exp, String shopName,
			String type, String lineOne, String lineTwo, String lineThree, String password, String confirmPassword)
			throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignupDetails(driver, name, email, mobile, adhar, exp, shopName, type, lineOne, lineTwo,
				lineThree, password, confirmPassword);
	}

	@Test(priority = 2, description = "Vendor Sign in", enabled = false, dataProvider = "VendorSignInTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignIn_Test(String username, String password)
			throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignInDetails(driver, username, password);
	}

	@Test(priority = 3, enabled = true)
	public void vendor_SignIn_Test_ErrorMessage() throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		String actual = Library.vendor_BlankEmailPassword(driver);
		System.out.println("Actual => " + actual);
		Assert.assertEquals(actual,ErrorMessages.blankEmailErrorMessage);
	}

}
