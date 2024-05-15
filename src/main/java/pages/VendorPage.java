package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class VendorPage extends BasePage {

	public VendorPage(AndroidDriver driver) {
		super(driver);
	}

	// ----------------------------------Vendor_SignUp-------------------------------------------------
	public void clickOnContinueAsPartner() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Continue as a Partner']"));
		acceptAlertIfExists();
	}

	public void allow_Location_Permission() {
		clickElement(AppiumBy.xpath(
				"//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
	}

	public void clickOnDonotHaveAccountLink() {
		clickElement(AppiumBy.accessibilityId("Don't have an account?"));
	}
	public By enterNameLocator() {
		return AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
	}

	public void enterName(String name) throws InterruptedException {
		enterText(enterNameLocator(), name);

	}
	
	public By enterEmailAddressLocator() {
		return AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
	}

	public void enterEmailAddress(String email) throws InterruptedException {
		enterText(enterEmailAddressLocator(), email);
	}
	
	public By enterMobileNumberLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index=3]");
	}

	public void enterMobileNumber(String mobileNumber) throws InterruptedException {
		enterText(enterMobileNumberLocator(), mobileNumber);
	}
	

	public void clickServiceCategories() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Select Service Categories']"));
	}

	public void selectServiceCategories() throws InterruptedException {
		clickElement(AppiumBy.xpath("//*[@content-desc='Painting']"));
	}

	public void selectAllServiceCategories() throws InterruptedException {
		String ch = "Electronics";
		String[] categories = { "Painting", "Plumbing", "Electronics" };

		for (int i = 0; i < categories.length; i++) {
			if (ch.equalsIgnoreCase(categories[i])) {
				WebElement categoryElement = waitForElement(
						AppiumBy.xpath("//*[@content-desc='" + categories[i] + "']"));
				categoryElement.click();
			}
		}
	}

	public void selectServicePostcodes() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Select Service Postcodes\"]"));
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"411002\"]"));
	}
	
	public By enterAdharNumberLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='6']");
	}

	public void enterAadharNumber(String adharNumber) throws InterruptedException {
		enterText(enterAdharNumberLocator(), adharNumber);
	}
	
	public By enterExpLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='7']");
	}

	public void enterExperience(String exp) throws InterruptedException {
		enterText(enterExpLocator(), exp);
	}

	public By enterShopNameLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='9']");
	}
	
	public void enterShopOwnerName(String shopname) throws InterruptedException {
		enterText(enterShopNameLocator(), shopname);
	}

	public By enterTypeLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='10']");
	}
	
	public void enterType(String type) throws InterruptedException {
		enterText(enterTypeLocator(), type);
	}

	public By enterLineOneLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='11']");
	}
	
	public void enterLineOne(String lineOne) throws InterruptedException {
		enterText(enterLineOneLocator(), lineOne);
	}

	public By enterLineTwoLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='12']");
	}
	
	public void enterLineTwo(String lineTwo) throws InterruptedException {
		enterText(enterLineTwoLocator(), lineTwo);
	}

	public By enterLineThreeLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='13']");
	}
	
	public void enterLineThree(String lineThree) throws InterruptedException {
		enterText(enterLineThreeLocator(), lineThree);
	}

	public void enterCity() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Select City']"));
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Pune']"));
	}

	public void enterPostCode() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Select Postcode']"));
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='411002']"));
	}
	
	public By enterPasswordLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='16']");
	}

	public void enterVendorPassword(String password) throws InterruptedException {
		enterText(enterPasswordLocator(), password);
	}
	
	public By enterConfirmPasswordLocator() {
		return AppiumBy.xpath("//android.widget.EditText[@index='17']");
	}

	public void enterVendorConfirmPassword(String confirmPassword) throws InterruptedException {
		enterText(enterConfirmPasswordLocator(), confirmPassword);
	}

	public void clickVendorSignUpButton() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]"));
	}

	public void scroll(AndroidDriver driver) {
		Dimension dimensions = driver.manage().window().getSize();
		int startpoint = (int) (dimensions.getHeight() * 0.5);
		int scrollEnd = (int) (dimensions.getHeight() * 0.2); // Adjust the end point as per your requirement

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence scroll = new Sequence(finger, 1);
		scroll.addAction(
				finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startpoint, 200));
		scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		scroll.addAction(new Pause(finger, Duration.ofMillis(600)));
		scroll.addAction(
				finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), scrollEnd, 200));
		scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(scroll));
	}

	// -------------------------------Vendor_SignIn------------------------------------------------
	public void textVendor_EmailId(String username) throws InterruptedException {
		enterText(AppiumBy.xpath("(//android.widget.EditText)[1]"), username);
	}
	
	public String setEmailIdtext(String username) throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("(//android.widget.EditText)[1]"),getVendorSignInPasswordError(), username );
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
		return getElementText(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Welcome! Sambhaji, Let's get things done!\"]"));
	}

	public String getVendorSignInEmailErrorMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Email or Mobile Number\"]"));

	}
	public By getVendorSignInEmailError(){
		return AppiumBy.xpath("//android.view.View[@content-desc=\"Please Enter Email or Mobile Number\"]");
	}
	public String getVendorinvalidSignInEmailError() throws InterruptedException {
		By element = AppiumBy.xpath("//android.view.View[@content-desc='Invalid Email or Mobile Number']");
		return getTextByAttribute(element);
	}
	public String getVendorinvalidSignInPasswordError() throws InterruptedException {
		By element = AppiumBy.xpath("//android.view.View[@content-desc=\"Password must contain at least 8 characters, at least one uppercase letter, at least one digit, at least one special character.\"]");
		return getTextByAttribute(element);
	}
	
	
	public String getVendorInvalidSignInPasswordError() throws InterruptedException {
		By element = AppiumBy.xpath("//android.view.View[@content-desc='Password must contain at least 8 characters.']");
		return getTextByAttribute(element);
	}
	
	public By getVendorSignInPasswordError() throws InterruptedException {
		return AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Password']");
	}

	public String getVendorSignInPasswordErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Password']"));
	}
	
	public String getVendorSignEmailandPassword(String text) throws InterruptedException {
		return getTextByAttribute(getVendorSignInEmailError());
	}
	
	
	
//---------------------------------------------------------SignUpBlankErrorLocators-------------------------------------------------------------------------------------//
	
	public String getSignUpNameError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Name']"));
	}
	
	public String getSignUpEmailAddressError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Email Address']"));
	}
	
	public String getSignUpMobileNoError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Mobile No.']"));
	}
	
	public String getSignUpServiceCategoriesError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please select at least one service category.']"));
	}
	
	public String getSignUpServicePostcodesError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please select at least one service postcode.']"));
	}
	
	public String getSignUpAadharNoError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Aadhar No.']"));
	}
	
	public String getSignUpExpError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Years of Experience']"));
	}
	
	public String getSignUpShopNameError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Shop Or Owner Name']"));
	}
	
	public String getSignUpTypeError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Type']"));
	}
	
	public String getSignUpLine1Error() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Address Line 1']"));
	}
	
	public String getSignUpLine2Error() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Address Line 2']"));
	}
	
	public String getSignUpLine3Error() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Address Line 3']"));
	}
	
	public String getSignUpCityError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please select a city.']"));
	}
	
	public String getSignUpPostcodeError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please select a postcode.']"));
	}
	
	public String getSignUpPasswordError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Enter Password']"));
	}
	
	public String getSignUpConfirmPasswordError() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Re-enter Password']"));
	}
	//----------------------Vendor_SignUp_Invalid-------------
	
	
	public String getSignUpInvalidNameError(String name) throws InterruptedException {
		return getTextByAttribute(enterNameLocator(),AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid name with a maximum length of 30 characters, only letters(a-z, A-Z) are allowed.']"), name);
	}
	
	public String getSignUpInvalidEmailAddressError(String email) throws InterruptedException {
		return getTextByAttribute(enterEmailAddressLocator(),AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid email address']"), email);
	}
	
	public String getSignUpInvalidMobileNoError(String mobileNo) throws InterruptedException {
		return getTextByAttribute(enterMobileNumberLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid mobile number']"), mobileNo);
	}
	 
	public String getSignUpInvalidAadharNoError(String adharNo) throws InterruptedException {
		return getTextByAttribute(enterAdharNumberLocator(),AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Aadhar No.']"),adharNo);
	}
	
	public String getSignUpInvalidExpError(String exp) throws InterruptedException {
		return getTextByAttribute(enterExpLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter your experience in years.']"),exp);
	}
	
	public String getSignUpInvalidShopNameError(String shopName) throws InterruptedException {
		return getTextByAttribute(enterShopNameLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Shop Or Owner Name']"), shopName);
	}
	
	public String getSignUpInvalidTypeError(String type) throws InterruptedException {
		return getTextByAttribute(enterTypeLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Type']"),type);
	}
	
	public String getSignUpInvalidLine1Error(String lineOne) throws InterruptedException {
		return getTextByAttribute(enterLineOneLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Address Line 1']"),lineOne);
	}
	
	public String getSignUpInvalidLine2Error(String lineTwo) throws InterruptedException {
		return getTextByAttribute(enterLineTwoLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Address Line 2']"),lineTwo);
	}
	
	public String getSignUpInvalidLine3Error(String lineThree) throws InterruptedException {
		return getTextByAttribute(enterLineThreeLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Please enter a valid Address Line 3']"),lineThree);
	}
	
	public String getSignUpInvalidPasswordError(String password) throws InterruptedException {
		return getTextByAttribute(enterPasswordLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Password must contain at least 8 characters, at least one uppercase letter, at least one digit, at least one special character.']"),password);
	}
	
	public String getSignUpInvalidConfirmPasswordError(String confirmPassword) throws InterruptedException {
		return getTextByAttribute(enterConfirmPasswordLocator(), AppiumBy.xpath("//android.view.View[@content-desc='Password must contain at least 8 characters, at least one uppercase letter, at least one digit, at least one special character.']"),confirmPassword);
	}

	public void scrollDown() {		
//		String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Sign Up\"))";
		String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Select Postcode\"))";
		 driver.findElement(AppiumBy.androidUIAutomator(signUpButton));
	}	
	
	
}
