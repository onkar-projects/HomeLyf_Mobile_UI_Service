package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CustomerPage extends BasePage {

	public CustomerPage(AndroidDriver driver) {
		super(driver);
	}

	// ---------------------------Customer_SignIn---------------------------------
	
	public void clickContiueAsCustomerButton() {
		clickElement(AppiumBy.accessibilityId("Continue as a Customer"));
		acceptAlert();
	}
	
	public void allow_Location_Permission() {
		clickElement(AppiumBy.xpath(
				"//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
	}

	public void enterCustomer_EmailId(String email) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[1]"), email);
	}

	public void enterCustomer_Password(String password) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[2]"), password);
	}

	public void clickCustomer_Sign_In_button() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Sign In']"));
	}

	// ----------------------------------Customer_SignUp--------------------------
	
	public void clickCustomerSignUp() {
		clickElement(AppiumBy.accessibilityId("Don't have an account?"));
	}

	public void enterCustomerName(String name) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[1]"), name);
	}

	public void enterCustomerEmail(String email) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[2]"), email);
	}

	public void enterCustomerMobileNumber(String mobileNubmer) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[3]"), mobileNubmer);
	}

	public void enterCustomerPassword(String password) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[4]"), password);
	}

	public void enterCustomerConfirmPassword(String confPassword) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[5]"), confPassword);
	}

	public void clickCustomerSignupButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Sign Up']"));
	}

}
