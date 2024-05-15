package tests;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	VendorPage vendor = new VendorPage(driver);

	@BeforeClass
	public void setUP() {
		AppiumServerManager.startAppiumServer();
	}

	private static final Logger logger = LogManager.getLogger(VendorTests.class);

	@Test(priority = 1, description = "Vendor SignUp using valid Credentials ", enabled = false, dataProvider = "VendorSignUpTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignUp_Test(String name, String email, String mobile, String adhar, String exp, String shopName,
			String type, String lineOne, String lineTwo, String lineThree, String password, String confirmPassword)
			throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignupDetails(driver, name, email, mobile, adhar, exp, shopName, type, lineOne, lineTwo,
				lineThree, password, confirmPassword);
	}

	@Test(priority = 2, description = "Vendor Sign in using valid Credentials", enabled = false, dataProvider = "VendorSignInTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignIn_Test(String username, String password)
			throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignInDetails(driver, username, password);
	}

	@Test(priority = 3, description = "Vendor SignUp using invalid Credentials ", enabled = false, dataProvider = "VendorSignUpInvalidTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignUp_Invalid_Test(String name, String email, String mobile, String adhar, String exp,
			String shopName, String type, String lineOne, String lineTwo, String lineThree, String password,
			String confirmPassword) throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignupDetails(driver, name, email, mobile, adhar, exp, shopName, type, lineOne, lineTwo,
				lineThree, password, confirmPassword);
	}

	@Test(priority = 4, description = "Vendor Sign in using invalid Credentials", enabled = true, dataProvider = "VendorSignInInvalidTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignIn_Invalid_Test(String username, String password)
			throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		ArrayList<String> message = Library.vendor_Invalid_SignInDetails(driver, username, password);
		Assert.assertEquals(message.get(0), ErrorMessages.invalidEmailErrorMessage);
		Assert.assertEquals(message.get(1), ErrorMessages.invalidPasswordMessage);

	}

	@Test(priority = 5, description = "Vendor Sign in using Blank Credentials", enabled = false)
	public void vendor_SignIn_Blank_Test() throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		vendor = new VendorPage(driver);
		vendor.clickOnContinueAsPartner();
		vendor.clickVendor_Sign_In_button();
		String emailError = vendor.getVendorSignInEmailErrorMessage();
		String passError = vendor.getVendorSignInPasswordErrorMessage();
		Assert.assertEquals(emailError, ErrorMessages.blankEmailErrorMessage);
		Assert.assertEquals(passError, ErrorMessages.blankPasswordErrorMessage);

	}

	@Test(priority = 6, description = "Vendor SignUp using blank Credentials ", enabled = false)
	public void vendor_SignUp_blank_Test() throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignUp_blank_Details(driver);
	}

	@Test(priority = 7, description = "Vendor SignUp using invalid Credentials ", enabled = false, dataProvider = "VendorSignUpInvalidTestData", dataProviderClass = DataProviderClass.class)
	public void vendor_SignUp_InvalidError_Test(String name, String email, String mobile, String adhar, String exp,
			String shopName, String type, String lineOne, String lineTwo, String lineThree, String password,
			String confirmPassword) throws MalformedURLException, InterruptedException {
		driver = AppiumDriverManager.getDriver();
		Library.vendor_SignUp_InvalidError_Details(driver, name, email, mobile, adhar, exp, shopName, type, lineOne, lineTwo, lineThree, password, confirmPassword);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		AppiumServerManager.stopAppiumServer();
	}

}
