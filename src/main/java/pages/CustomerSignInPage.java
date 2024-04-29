package pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CustomerSignInPage extends BasePage {

	public CustomerSignInPage(AndroidDriver driver) {
		super(driver);
	}

	public void clickContiueAsCustomerButton() {
		clickElement(AppiumBy.accessibilityId("Continue as a Customer"));
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

	public void clickForgot_Password() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(text(),\"Forg\"))], Forgot Password?"));
	}
}
