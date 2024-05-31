package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

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
	
	public String getWelcomeCustomerMsg() {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Welcome! Satya Your home, our priority. Let's get things done!\"]"));
	}
	
	public void selectAddressFromList() {
		List<WebElement> addresslist = driver.findElements(AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View)"));
		System.out.println(addresslist.size());
		
		for(int i=1;i<=addresslist.size();i++){
			String selectAddress = addresslist.get(i).getDomAttribute("content-desc");
			System.out.println("*************************"+selectAddress+"*************************"); 
		
		}
		
		//android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View
	}
	
	public void scrollDownToProceedBtn() {		
//		String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Sign Up\"))";
//		String proceedButton = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description('Proceed'))";
//		 driver.findElement(AppiumBy.androidUIAutomator(proceedButton));
//		String btn = "Proceed"
		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(button('Proceed'))");
		TouchAction touchAction = new TouchAction(driver);
		 
	    // Perform a scroll by initiating a press at (100, 500), moving to (100, 100), and releasing
	    touchAction.press(PointOption.point(100, 500))
	               .moveTo(PointOption.point(100, 100))
	               .release()
	               .perform();
	}
		
	public void clickOnSelectAddressRadioBtn() {
		clickElement(AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"name: Nivas,type: Home, marketCity road, pune,Pune, postCodeID: 2, Pune\"]"));
	}
	
	public void clickOnProcedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}
	
	public String getAddressErrorMsg() {
			return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please select an address\"]"));
	}
	
	public void clickOnAddNewAddressButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add New Address\"]"));
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
	public void clickOnBHK() {
		clickElement(AppiumBy.accessibilityId("1BHK to 4BHK ₹ 150 Rs."));
	}
	public void clickCustomerPaintingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Painting']"));
	}
	public void clickCustomerHomeFlatsOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Home & Flats']"));
	}
}
