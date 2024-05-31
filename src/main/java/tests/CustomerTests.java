package tests;


import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import pages.CustomerPage;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;

public class CustomerTests {
	
	AndroidDriver driver;
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

	@Test(priority=2,enabled = true, description = "Customer SignIn with valid data", dataProvider ="CustomerSigninvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_002_Customer_Signin(String email, String password) throws InterruptedException, IOException {
		Library.customer_SignInDD_Details(driver,email, password);	
	}

//	@Test(priority=3)//, description = "Customer Forgot Password with valid data", dataProvider = "emailforforgotpassword", dataProviderClass = DataProviderClass.class)
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