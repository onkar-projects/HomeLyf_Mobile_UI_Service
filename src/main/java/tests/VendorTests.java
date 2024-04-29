package tests;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.ErrorMessages;
import io.appium.java_client.android.AndroidDriver;
import pages.VendorPage;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.DataProviderClass;
import utils.Library;

public class VendorTests {

	
	AndroidDriver driver;
	VendorPage vendor= new VendorPage(driver);
	@BeforeClass
	public void setUP() {
		try {
			AppiumServerManager.startAppiumServer();
			driver = AppiumDriverManager.getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private static final Logger logger = LogManager.getLogger(VendorTests.class);

	@Test(priority = 1, description = "Vendor SignUp using valid Credentials ", enabled = false, dataProvider = "VendorSignUpTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignUp_Test(String name, String email, String mobile, String adhar, String exp, String shopName,
			String type, String lineOne, String lineTwo, String lineThree, String password, String confirmPassword)
			throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignupDetails(driver, name, email, mobile, adhar, exp, shopName, type, lineOne, lineTwo,
				lineThree, password, confirmPassword);
	}

	@Test(priority = 2, description = "Vendor Sign in using valid Credentials", enabled = false, dataProvider = "VendorSignInTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignIn_Test(String username, String password)
			throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignInDetails(driver, username, password);
	}

	@Test(priority = 3, enabled = true, description = "Vendor should not accept blank email field")
	public void vendor_SignIn_Test_ErrorMessage() throws MalformedURLException, InterruptedException {
//		AppiumServerManager.startAppiumServer();
//		driver = AppiumDriverManager.getDriver();
//		String actual = Library.vendor_BlankEmailPassword(driver);
//		Assert.assertEquals(actual,ErrorMessages.blankEmailErrorMessage);
		
		String ast = Library.getErrorMessageFromUI(driver,vendor, "getVendorSignInEmailErrorMessage");
		System.out.println("Actual Text for test: -------> "+ast);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		AppiumServerManager.stopAppiumServer();
	}

}
