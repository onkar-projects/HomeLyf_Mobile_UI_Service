package utils;

import java.util.ArrayList;
import org.testng.Assert;

import config.ErrorMessages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.CustomerPage;
import pages.VendorPage;

public class Library  {

	public static VendorPage vendor;
	public static CustomerPage customer;

	public static VendorPage vendor_SignupDetails(AndroidDriver driver, String name, String email, String mobile,
			String adhar, String exp, String shopName, String type, String lineone, String lineTwo, String lineThree,
			String password, String confirmPassword) {
		try {
			vendor = new VendorPage(driver);
			vendor.clickOnContinueAsPartner();
			vendor.clickOnDonotHaveAccountLink();
			Thread.sleep(2000);
			vendor.enterName(name);
			Thread.sleep(2000);
			vendor.enterEmailAddress(email);
			vendor.enterMobileNumber(mobile);
			vendor.clickServiceCategories();
			vendor.selectServiceCategories();
			// vendor.selectAllServiceCategories();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			vendor.selectServicePostcodes();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			vendor.enterAadharNumber(adhar);
			vendor.scrollDown();
			vendor.enterExperience(exp);
			// driver.findElement(By.xpath("//android.widget.EditText[@index='9']")).click();
			vendor.enterShopOwnerName(shopName);
			vendor.enterType(type);
			vendor.enterLineOne(lineone);
			vendor.enterLineTwo(lineTwo);
			vendor.enterLineThree(lineThree);
			vendor.enterCity();
			vendor.enterPostCode();
			vendor.enterVendorPassword(password);
			vendor.enterVendorConfirmPassword(confirmPassword);
			vendor.clickVendorSignUpButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return vendor;
	}

	public static void vendor_SignUp_blank_Details(AndroidDriver driver) {
		vendor = new VendorPage(driver);
		vendor.clickOnContinueAsPartner();
		vendor.clickOnDonotHaveAccountLink();
		try {
			vendor.clickVendorSignUpButton();

			Thread.sleep(2000);

			Assert.assertEquals(vendor.getSignUpNameError(), ErrorMessages.blankNameErrorMessage);
			Assert.assertEquals(vendor.getSignUpEmailAddressError(), ErrorMessages.enterEmailAddressMessage);
			Assert.assertEquals(vendor.getSignUpMobileNoError(), ErrorMessages.blankMobileNoErrorMessage);
			Assert.assertEquals(vendor.getSignUpServiceCategoriesError(),
					ErrorMessages.blankServiceCategoriesErrorMessage);
			Assert.assertEquals(vendor.getSignUpServicePostcodesError(),
					ErrorMessages.blankServicePostcodeErrorMessage);
			Assert.assertEquals(vendor.getSignUpAadharNoError(), ErrorMessages.blankAdharNoErrorMessage);
			Assert.assertEquals(vendor.getSignUpExpError(), ErrorMessages.blankExperienceErrorMessage);
			Assert.assertEquals(vendor.getSignUpShopNameError(), ErrorMessages.blankShopNameErrorMessage);
			Assert.assertEquals(vendor.getSignUpTypeError(), ErrorMessages.blankTypeErrorMessage);
			Assert.assertEquals(vendor.getSignUpLine1Error(), ErrorMessages.blankLine1ErrorMessage);
			Assert.assertEquals(vendor.getSignUpLine2Error(), ErrorMessages.blankLine2ErrorMessage);
			Assert.assertEquals(vendor.getSignUpLine3Error(), ErrorMessages.blankLine3ErrorMessage);
			Assert.assertEquals(vendor.getVendorSignInPasswordErrorMessage(), ErrorMessages.blankPasswordErrorMessage);
			Assert.assertEquals(vendor.getSignUpConfirmPasswordError(), ErrorMessages.blankConfirmPasswordErrorMessage);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void vendor_SignUp_InvalidError_Details(AndroidDriver driver, String name, String email,
			String mobile, String adhar, String exp, String shopName, String type, String lineOne, String lineTwo,
			String lineThree, String password, String confirmPassword) throws InterruptedException {

		vendor = new VendorPage(driver);
		vendor.clickOnContinueAsPartner();
		vendor.clickOnDonotHaveAccountLink();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		Assert.assertEquals(vendor.getSignUpInvalidNameError(name), ErrorMessages.invalidNameErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidEmailAddressError(email),
				ErrorMessages.invalidEmailAddressErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidMobileNoError(mobile), ErrorMessages.invalidMobileNoErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidAadharNoError(adhar), ErrorMessages.invalidAadharNoErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidExpError(exp), ErrorMessages.invalidExpErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidShopNameError(shopName), ErrorMessages.invalidShopNameErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidTypeError(type), ErrorMessages.invalidTypeErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidLine1Error(lineOne), ErrorMessages.invalidAddressLine1ErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidLine2Error(lineTwo), ErrorMessages.invalidAddressLine2ErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidLine3Error(lineThree),
				ErrorMessages.invalidAddressLine3ErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidPasswordError(password), ErrorMessages.invalidPasswordErrorMessage);
		Assert.assertEquals(vendor.getSignUpInvalidConfirmPasswordError(confirmPassword),
				ErrorMessages.invalidPasswordErrorMessage);

	}

	public static VendorPage vendor_SignInDetails(AndroidDriver driver, String username, String password) {

		try {
			vendor = new VendorPage(driver);
			vendor.clickOnContinueAsPartner();
			Thread.sleep(2000);
			vendor.textVendor_EmailId(username);
			vendor.textVendor_Password(password);
			vendor.clickVendor_Sign_In_button();
			Thread.sleep(2000);
			vendor.clickLogout();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return vendor;
	}

	public static ArrayList<String> vendor_Invalid_SignInDetails(AndroidDriver driver, String username,
			String password) {
		ArrayList<String> res = new ArrayList<String>();

		try {
			vendor = new VendorPage(driver);
			vendor.clickOnContinueAsPartner();
			vendor.textVendor_EmailId(username);
			vendor.textVendor_Password(password);
			Thread.sleep(2000);
			res.add(vendor.getVendorinvalidSignInEmailError()); // 0
			res.add(vendor.getVendorinvalidSignInPasswordError()); // 1
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			System.out.println("1st condition executed successfully------");
		} catch (

		InterruptedException e) {
			e.printStackTrace();
		}
		return res;
	}

	public static CustomerPage customer_SignUp_Details(AndroidDriver driver, String name, String emailid, String number,
			String password, String confirmpassword) {

		try {
			customer = new CustomerPage(driver);
//			customer.clickContiueAsCustomerButton();
			customer.clickCustomerSignUp();
			customer.enterCustomerName(name);
			customer.enterCustomerEmail(emailid);
			customer.enterCustomerMobileNumber(number);
			customer.enterCustomerPassword(password);
			customer.enterCustomerConfirmPassword(confirmpassword);
			customer.clickCustomerSignupButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}
	//Data Driven
	public static CustomerPage customer_SignInDD_Details(AndroidDriver driver,String email,String password) {

		try {
			customer = new CustomerPage(driver);
//			customer.clickContiueAsCustomerButton();
			customer.acceptAlert();
			customer.enterCustomer_EmailId("5t7my@fthcapital.com");
			customer.enterCustomer_Password("Pass@123");
			customer.clickCustomer_Sign_In_button();
			customer.getWelcomeCustomerMsg();
			customer.clickOnSelectAddressRadioBtn();
			customer.clickOnProcedButton();			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}

	public static CustomerPage customer_SignIn_Details(AndroidDriver driver) {

		try {
			customer = new CustomerPage(driver);
//			customer.clickContiueAsCustomerButton();
			customer.acceptAlert();
			customer.enterCustomer_EmailId("5t7my@fthcapital.com");
			customer.enterCustomer_Password("Pass@123");
			customer.clickCustomer_Sign_In_button();
			String welcomemsg = customer.getWelcomeCustomerMsg();
			System.out.println("------------"+welcomemsg+"-------------");
			customer.clickOnSelectAddressRadioBtn();
			customer.clickOnProcedButton();			
			Thread.sleep(5000);
			Assert.assertEquals(welcomemsg, "Welcome! Satya Your home, our priority. Let's get things done!");
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	public static CustomerPage AddressErrorMsg(AndroidDriver driver) {

		try {
			customer = new CustomerPage(driver);
			customer.acceptAlert();
			customer.enterCustomer_EmailId("5t7my@fthcapital.com");
			customer.enterCustomer_Password("Pass@123");
			customer.clickCustomer_Sign_In_button();
			customer.clickOnProcedButton();
			
			System.out.println("----------"+customer.getAddressErrorMsg()+"----------------------");
			Assert.assertEquals(customer.getAddressErrorMsg(), "Please select an address");
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	public static String customer_SignUp_Details(AndroidDriver driver) {
		String actual = "";
		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
			customer.clickCustomerSignUp();
			customer.clickCustomerSignupButton();
			actual = customer.getCustomerSignUpNamenullErrorMessage();
			customer.getCustomerSignUpEmailnullErrorMessage();
			customer.getCustomerSignUpMobileNumbernullErrorMessage();
			customer.getCustomerSignUpPasswordnullErrorMessage();
			customer.getCustomerSignUpConfirmPasswordnullErrorMessage();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return actual;
	}

	public static String customer_SignUp_invalidDetails(AndroidDriver driver, String name, String emailid,
			String number, String password, String confirmpassword) {
		String actual = null;
		try {
			customer = new CustomerPage(driver);
			customer.acceptAlert();
			customer.enterCustomer_EmailId("5t7my@fthcapital.com");
			customer.enterCustomer_Password("Pass@123");
			customer.clickCustomer_Sign_In_button();
			customer.clickOnProcedButton();
			
			System.out.println("----------"+customer.getAddressErrorMsg()+"----------------------");
			Assert.assertEquals(customer.getAddressErrorMsg(), "Please select an address");
						customer.clickContiueAsCustomerButton();
			customer.clickCustomerSignUp();
			customer.enterCustomerName(name);
			// customer.getCustomerSignUpNameinvalidErrorMessage();
			actual = customer.getCustomerSignUpNameinvalidErrorMessage();
			customer.enterCustomerEmail(emailid);
			// customer.getCustomerSignUpEmailinvalidErrorMessage();
			customer.enterCustomerMobileNumber(number);
			// customer.getCustomerSignUpMobileNumberinvalidErrorMessage();
			customer.enterCustomerPassword(password);
			// customer.getCustomerSignUpPasswordinvalidErrorMessage();
			customer.enterCustomerConfirmPassword(confirmpassword);
			// customer.getCustomerSignUpConfirmPasswordinvalidErrorMessage();
			customer.clickCustomerSignupButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return actual;
	}

	public static CustomerPage customer_SignIn_Detail(AndroidDriver driver) {

		try {
			customer = new CustomerPage(driver);
			customer.isAlertPresent();
			customer.dismissAlert();
			customer.enterCustomer_EmailId("fiweg27944@mfyax.com");
			customer.enterCustomer_Password("String@123");
			customer.clickCustomer_Sign_In_button();
			customer.selectAddress();
			customer.clickProceedtab();
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}
	public static CustomerPage customer_SignIn_Details(AndroidDriver driver, String email, String pass) {

		try {
			customer = new CustomerPage(driver);
			customer.isAlertPresent();
			customer.acceptAlert();
			customer.enterCustomer_EmailId(email);
			customer.enterCustomer_Password(pass);
			customer.clickCustomer_Sign_In_button();
			customer.selectAddress();
			customer.clickProceedtab();
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}
	public static String customer_SignIn_Details_nulldata(AndroidDriver driver) {
		String actual = "";
		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
			customer.clickCustomer_Sign_In_button();
			actual = customer.getCustomerSignInEmailnullErrorMessage();
			customer.getCustomerSignInPasswordnullErrorMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actual;
	}

	public static String customer_SignIn_invalidDetails(AndroidDriver driver, String email, String password) {
		String actual = null;
		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
			customer.enterCustomer_EmailId(email);
			// customer.getCustomerSignIninvalidErrorMessage();
			actual = customer.getCustomerSignIninvalidErrorMessage();
			customer.enterCustomer_Password(password);
			// customer.getCustomerSignInPasswordinvalidErrorMessage();
			customer.clickCustomer_Sign_In_button();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return actual;
	}

	public static String vendor_BlankEmailPassword(AndroidDriver driver) {
		String actual = "";
		try {
			vendor = new VendorPage(driver);
			vendor.clickOnContinueAsPartner();
			vendor.clickVendor_Sign_In_button();
			actual = vendor.getVendorSignInEmailErrorMessage();
			vendor.getVendorSignInPasswordErrorMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actual;
	}

	

}

