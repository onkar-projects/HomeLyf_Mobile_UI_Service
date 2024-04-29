package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CustomerSignUpPage extends BasePage {

	public CustomerSignUpPage(AndroidDriver driver) {
		super(driver);
	}
		
	  public void clickContiueAsCustomerButton() {
	    	clickElement(AppiumBy.accessibilityId("Continue as a Customer"));
	    	acceptAlert();
	    }
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
