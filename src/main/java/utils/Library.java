package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.CustomerPage;
import pages.VendorPage;

public class Library {

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
//			vendor.selectAllServiceCategories();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			vendor.selectServicePostcodes();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			vendor.enterAadharNumber(adhar);
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
	
	
	//---------------------------------------Customer Library------------------------------------------------
	
	
	public static CustomerPage customer_SignUp_Details(AndroidDriver driver, String name, String emailid, String number,
			String password, String confirmpassword) {

		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
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

	public static String customer_SignUp_invalidDetails(AndroidDriver driver, String name, String emailid, String number,
			String password, String confirmpassword) {
		String actual = null;
		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
			customer.clickCustomerSignUp();
			customer.enterCustomerName(name);
			//customer.getCustomerSignUpNameinvalidErrorMessage();
			actual = customer.getCustomerSignUpNameinvalidErrorMessage();
			customer.enterCustomerEmail(emailid);
			//customer.getCustomerSignUpEmailinvalidErrorMessage();
			customer.enterCustomerMobileNumber(number);
			//customer.getCustomerSignUpMobileNumberinvalidErrorMessage();
			customer.enterCustomerPassword(password);
			//customer.getCustomerSignUpPasswordinvalidErrorMessage();
			customer.enterCustomerConfirmPassword(confirmpassword);
			//customer.getCustomerSignUpConfirmPasswordinvalidErrorMessage();
			customer.clickCustomerSignupButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return actual;
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
	
	public static CustomerPage customer_SignIn_Details(AndroidDriver driver, String email, String password) {

		try {
			customer = new CustomerPage(driver);
			customer.clickContiueAsCustomerButton();
			customer.enterCustomer_EmailId(email);
			customer.enterCustomer_Password(password);
			customer.clickCustomer_Sign_In_button();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return customer;
	}

	public static String customer_SignIn_Details(AndroidDriver driver) {
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
			//customer.getCustomerSignIninvalidErrorMessage();
			actual =customer.getCustomerSignIninvalidErrorMessage();
			customer.enterCustomer_Password(password);
			//customer.getCustomerSignInPasswordinvalidErrorMessage();
			customer.clickCustomer_Sign_In_button();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return actual;
	}
}
