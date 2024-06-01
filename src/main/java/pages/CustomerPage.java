package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public String getWelcomeCustomerMsg() throws InterruptedException {
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
	
	public String getAddressErrorMsg() throws InterruptedException {
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

//	public void allow_Location_Permission_for_A13() {
//		clickElement(AppiumBy.xpath(
//				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"));
//	}

	public boolean isAlertPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			throw e;
		}
	}

	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}

	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public String getCustomerSignInEmailnullErrorMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Email or Mobile Number\"]"));

	}

	public String getCustomerSignInPasswordnullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Password\"]"));
	}

	public String getCustomerSignIninvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Invalid Email or Mobile Number\"]"));
	}

	public String getCustomerSignInPasswordinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath(
				"//android.view.View[@content-desc=\"Password must contain at least one uppercase letter, at least one special character.\")]"));
	}

	public void selectAddress() {
		clickElement(AppiumBy.xpath("(//android.widget.RadioButton)[1]"));
	}

	public void clickProceedtab() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Proceed']"));
	}
	// ----------------------------------Customer_SignUp--------------------------
	
	public String getCustomerSignUpNamenullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Name\"]"));
	}

	public String getCustomerSignUpEmailnullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Email Address\"]"));
	}

	public String getCustomerSignUpMobileNumbernullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Mobile No.\"]"));
	}

	public String getCustomerSignUpPasswordnullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("(//android.view.View[@content-desc=\"Please Enter Password\"])[1]"));
	}

	public String getCustomerSignUpConfirmPasswordnullErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("(//android.view.View[@content-desc=\"Please Enter Password\"])[2]"));
	}

	public String getCustomerSignUpNameinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath(
				"//android.view.View[@content-desc=\"Please enter a valid name with a maximum length of 30 characters, only letters(a-z, A-Z) are allowed.\"]"));
	}

	public String getCustomerSignUpEmailinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Please enter a valid email address\"]"));
	}

	public String getCustomerSignUpMobileNumberinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Please enter a valid mobile number\"]"));
	}

	public String getCustomerSignUpPasswordinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath(
				"(//android.view.View[@content-desc=\"Password must contain at least 8 characters, at least one uppercase letter, at least one digit, at least one special character.\"])[1]"));
	}

	public String getCustomerSignUpConfirmPasswordinvalidErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath(
				"(//android.view.View[@content-desc=\"Password must contain at least 8 characters, at least one uppercase letter, at least one digit, at least one special character.\"])[2]"));
	}

	// ---------------------------------------- Customer Home Page
	// Categories-----------------------------------------

	/*
	 * public void clickCustomerPaintingOption() {
	 * clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Painting\"]"
	 * )); }
	 * 
	 * public void clickCustomerPlumbingOption() {
	 * clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"
	 * )); }
	 * 
	 * public void clickCustomerElectronicsOption() { clickElement(AppiumBy.xpath(
	 * "//android.view.View[@content-desc=\"Electronics\"]")); }
	 * 
	 * public void clickCustomerCarpentryOption() { clickElement(AppiumBy.xpath(
	 * "//android.view.View[@content-desc=\"Carpentry\"]")); }
	 * 
	 * public void clickCustomerCleaningOption() {
	 * clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Cleaning\"]"
	 * )); }
	 * 
	 * public void clickCustomerElectricalsOption() { clickElement(AppiumBy.xpath(
	 * "//android.view.View[@content-desc=\"Electricals\"]")); }
	 * 
	 * public void clickCustomerWaterproofingOption() { clickElement(AppiumBy.xpath(
	 * "//android.view.View[@content-desc=\"Waterproofing\"]")); }
	 * 
	 * public void clickCustomerVehicleOption() {
	 * clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]")
	 * ); }
	 * 
	 * public void clickCustomerWaterPurifierOption() { clickElement(AppiumBy.
	 * xpath("//android.view.View[@content-desc=\"Water Purifier\"]")); }
	 * 
	 * public void clickCustomerPestControlOption() { clickElement(AppiumBy.
	 * xpath("//android.view.View[@content-desc=\"Pest Control\"]")); }
	 * 
	 * public void clickCustomerViewMoreOption() { clickElement(AppiumBy.
	 * xpath("//android.view.View[@content-desc=\"View More\"])[1]")); }
	 */
}
