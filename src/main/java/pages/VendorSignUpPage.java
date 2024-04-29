package pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import io.appium.java_client.TouchAction;

public class VendorSignUpPage extends BasePage {

	public VendorSignUpPage(AndroidDriver driver) {
		super(driver);
	}

	public void clickOnContinueAsPartner() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Continue as a Partner']"));
	}

	public void allow_Location_Permission() {
		clickElement(AppiumBy.xpath(
				"//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
	}

	public void clickOnDonotHaveAccountLink() {
		clickElement(AppiumBy.accessibilityId("Don't have an account?"));
	}

	public void enterName(String name) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]"), name);

	}

	public void enterEmailAddress(String email) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]"), email);
	}

	public void enterMobileNumber(String mobileNumber) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index=3]"), mobileNumber);
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

	public void enterAadharNumber(String adharNumber) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='6']"), adharNumber);
	}

	public void enterExperience(String exp) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='7']"), exp);
	}

	public void enterShopOwnerName(String shopname) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='9']"), shopname);
	}

	public void enterType(String type) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='10']"), type);
	}

	public void enterLineOne(String lineOne) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='11']"), lineOne);
	}

	public void enterLineTwo(String lineTwo) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='12']"), lineTwo);
	}

	public void enterLineThree(String lineThree) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='13']"), lineThree);
	}

	public void enterCity() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Select City']"));
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Pune']"));
	}

	public void enterPostCode() throws InterruptedException {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Select Postcode']"));
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='411002']"));
	}

	public void enterVendorPassword(String password) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='16']"), password);
	}

	public void enterVendorConfirmPassword(String confirmPassword) throws InterruptedException {
		enterText(AppiumBy.xpath("//android.widget.EditText[@index='17']"), confirmPassword);
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
	    scroll.addAction(finger.createPointerMove(Duration.ofMillis(0),
	                PointerInput.Origin.viewport(), startpoint, 200));
	    scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    scroll.addAction(new Pause(finger, Duration.ofMillis(600)));
	    scroll.addAction(finger.createPointerMove(Duration.ofMillis(600),
	                PointerInput.Origin.viewport(), scrollEnd, 200));
	    scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(scroll));
	}
	
	

}
