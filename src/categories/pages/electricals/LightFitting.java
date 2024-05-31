package electricals;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import pages.BasePage;

public class LightFitting extends BasePage{
	
	public LightFitting(AndroidDriver driver) {
		super(driver);
	}

	public void clickOnElectricals() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electricals\"]"));
	}
	
	public void clickOnLightFitting() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Light fitting\"]"));
	}
	
	public void clickOnFanInstallation() {
//		clickElement(AppiumBy.xpath("(//android.widget.ScrollView/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Fan installation')])/android.widget.Button"));
	}
	
	public void getTextFanInstallation() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Fan installation']"));
	}
	
	
	public void clickOnFanRepair() {
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Fan repair')])/android.widget.Button"));
	}
	
	public void getTextFanRepair() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Fan repair']"));
	}
	
	public void clickOnFanUninstallation() {
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Fan uninstallation')])/android.widget.Button"));
	}
	
	public void getTextFanUninstallation(){
		getElementText(AppiumBy.xpath("//android.view.View[@content-desc='Fan uninstallation']"));
	}
	
	public void clickOnCeilingLampsInstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Ceiling Lamps installation')]/android.widget.Button"));
	}
	
	public void getTextCeilingLampsInstallation() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Ceiling Lamps installation']"));
	}
	
	public void clickOnCeilingLampsUninstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Ceiling Lamps uninstallation')]/android.widget.Button"));
	}
	
//	public void getTextCeilingLampsUninstallation() throws InterruptedException{
//		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Ceiling Lamps uninstallation']"));
//	}
	
	public void clickOnConsultaionChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Consultation charges and then quotation')]/android.widget.Button"));
	}
	
	public void getTextConsultaionChargesAndThenQuotation() throws InterruptedException {
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Consultation charges and then quotation']"));
	}
	public void scrollableElement() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String eleSelector = "new UiSelector().description(\"Consultation charges and then quotation\")"; //instead text we use description
//		HashMap<String,Object> scrollObj  =new HashMap<String,Object>();
//		scrollObj.put("strategy","-android uiautomator");
//		scrollObj.put("selector",eleSelector);
//		scrollObj.put("direction","down");
//		js.executeScript("mobile: scroll",scrollObj);
//		clickElement(AppiumBy.androidUIAutomator(eleSelector));
				
////		acceid: Consultation charges and then quotation ₹ 150 Rs.
//			String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Sign Up\"))";
//			String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description('Consultation charges and then quotation ₹ 150 Rs.'))";
//			 driver.findElement(AppiumBy.androidUIAutomator(signUpButton));
//			 
//		String partialDescription = "Consultation charges and then quotation\r\n"
//				+ "₹ 150 Rs.";
//		String scrollableSelector = "new UiScrollable(new UiSelector().scrollable(true))";
//		String scrollIntoViewCommand = ".scrollIntoView(new UiSelector().descriptionContains(\"" + partialDescription + "\"))";
//		String fullCommand = scrollableSelector + scrollIntoViewCommand;
//		driver.findElement(AppiumBy.androidUIAutomator(fullCommand));
			 
//		String xpath = "(//android.widget.ScrollView/android.view.View)[6]";
//		String scrollableSelector = "new UiScrollable(new UiSelector().scrollable(true))";
//		String scrollIntoViewCommand = ".scrollIntoView(new UiSelector().xpath(\"" + xpath + "\"))";
//		String fullCommand = scrollableSelector + scrollIntoViewCommand;

		
//		WebElement scrollView = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"));
//
//		// Perform a scroll action to bring the target element into view
//		WebElement targetElement =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Consultation charges and then quotation\")"));
//		driver.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		
//		WebElement scrollView = driver.findElement(AppiumBy.className("android.widget.ScrollView"));
//
//		// Locate the target element
//		WebElement targetElement = driver.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Consultation charges and then quotation')]/android.widget.Button"));
//
//		// Perform a scroll action to bring the target element into view
//		driver.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		
			 //new UiSelector().description("Consultation charges and then quotation
			// ₹ 150 Rs.")
		
//		 Get the device screen dimensions
//		Dimension size = driver.manage().window().getSize();

		// Define the start and end points for the scroll action
//		int startX = size.width / 2;
//		int startY = (int) (size.height * 0.8); // 80% from the bottom of the screen
//		int endY = (int) (size.height * 0.2); // 20% from the top of the screen
//
//		// Perform the scroll action
//		TouchAction touchActions = new TouchAction(driver);
//		touchActions.scroll(startX, startY, startX, endY);
//		touchActions.perform();
		
	}
	
	public void clickOnCeilingLampUninstallationAddButton() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Ceiling Lamps uninstallation')]/android.widget.Button"));
	}
	
	
	public void clickOnBookNow() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Book Now\"]"));
	}
	
	public void clickOnAddToCart() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add to Cart\"]"));
	}
	
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProcedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}
	
	public void clickOnSelectDate() {
		clickElement(AppiumBy.xpath("(//android.view.View[4]/android.view.View)[1]/android.view.View[1]"));
	}
	
	public void clickOnSelectTime() {
		clickElement(AppiumBy.xpath("(//android.view.View[6]/android.view.View/android.view.View)[1]"));
	}
	public void clickOnContinueBookingBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue Booking\"]"));
	}

	public String getOrderPlacedSuccessfulMsg() {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
}
