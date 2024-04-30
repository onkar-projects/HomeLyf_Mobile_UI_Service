package tests;


import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.ErrorMessages;
import io.appium.java_client.android.AndroidDriver;
import pages.CustomerPage;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;

public class TC_Customer  {
	
	AndroidDriver driver;
	private static final Logger logger = LogManager.getLogger(TC_Customer.class);

	@BeforeClass
	public void setUP() {
		try {
			AppiumServerManager.startAppiumServer();
			driver = AppiumDriverManager.getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
		
	@Test(priority=1, enabled = false, description = "Customer SignUp with valid data" , dataProvider = "CustomerSignupvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_001_Customer_Sign_up(String name, String emailid, String number, String password, String confirmpassword) throws InterruptedException, MalformedURLException {
		Library.customer_SignUp_Details(driver,name, emailid, number, password, confirmpassword);
		
	}
	
	@Test(priority = 2, enabled = false, description = "Customer SignUp with null data")
	public void TC_002_Customer_Sign_up() throws MalformedURLException, InterruptedException {
		String actual = Library.customer_SignUp_Details(driver);
		Assert.assertEquals(actual,ErrorMessages.nullvaluesignupNamemessage);
	}
	@Test(priority = 3, enabled = false, description = "Customer SignUp with invalid data" , dataProvider = "CustomerSignupinvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_003_Customer_Sign_up(String name, String emailid, String number, String password, String confirmpassword) throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		String actual = Library.customer_SignUp_invalidDetails(driver,name, emailid, number, password, confirmpassword);
		Assert.assertEquals(actual,ErrorMessages.invalidvaluesignupNamemessage);
	}

	@Test(priority=4,enabled = false, description = "Customer SignIn with valid data", dataProvider ="CustomerSigninvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_004_Customer_Signin(String email, String password) throws InterruptedException, IOException {
		Library.customer_SignIn_Details(driver,email, password);	
	}
	
	@Test(priority = 5, enabled = false, description = "Customer SignIn with null data")
	public void TC_005_Customer_Sign_in() throws MalformedURLException, InterruptedException {
		AppiumServerManager.startAppiumServer();
		driver = AppiumDriverManager.getDriver();
		String actual = Library.customer_SignIn_Details(driver);
		Assert.assertEquals(actual,ErrorMessages.nullvaluesigninEmailErrormessage);
		
	}

	@Test(priority = 6, enabled = true, description = "Customer SignIn with invalid data", dataProvider ="CustomerSignininvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_006_Customer_Sign_in(String email, String password)throws InterruptedException, IOException {
//		AppiumServerManager.startAppiumServer();
//		driver = AppiumDriverManager.getDriver();
		String actual = Library.customer_SignIn_invalidDetails(driver,email, password);
		//Assert.assertEquals(actual,ErrorMessages.invalidvaluesigninEmailmessage);
		Assert.assertEquals(actual,ErrorMessages.nullvaluesigninEmailErrormessage);
	}
//	@Test(priority=5)//, description = "Customer Forgot Password with valid data", dataProvider = "emailforforgotpassword", dataProviderClass = DataProviderClass.class)
//	public void TC_003_Customer_forgot_password() throws InterruptedException {
//		ForgotPasswordforCustomer_page fpc = new ForgotPasswordforCustomer_page(driver);
//		fpc.forgotPassword();
//		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		AppiumServerManager.stopAppiumServer();
	}
}