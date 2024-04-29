package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class VendorLoginPage extends BasePage {

	public VendorLoginPage(AndroidDriver driver) {
		super(driver);
	}

	public void clickOnContinueAsPartner() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Continue as a Partner']"));
		acceptAlert();
	}

	public void allow_Location_Permission() {
		clickElement(AppiumBy.xpath(
				"//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
	}

	public void textVendor_EmailId(String username) throws InterruptedException {
		enterText(AppiumBy.xpath("(//android.widget.EditText)[1]"), username);
	}
	
	public void textVendor_Password(String password) throws InterruptedException {
		enterText(AppiumBy.xpath("(//android.widget.EditText)[2]"), password);
	}

	public void clickVendor_Sign_In_button() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Sign In']"));
	}
	
	public void clickLogout() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log Out\"]"));
	}
	
	public String validateSuccesfulSignInMessage() {
		return getElementText(AppiumBy.xpath("//android.view.View[@content-desc=\"Welcome! Sambhaji, Let's get things done!\"]"));	
	}
	
	public String getVendorSignInEmailErrorMessage() throws InterruptedException {
		String expected = getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Email or Mobile Number\"]"));
		return expected;
	}
	
	public void getVendorSignInPasswordErrorMessage() throws InterruptedException {
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Password\"]"));
	}
	
	
}
