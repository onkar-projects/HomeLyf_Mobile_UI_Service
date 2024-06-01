package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ResidentialInterior extends BasePage{

	
	public ResidentialInterior(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}

	public void clickOnResidentialInterior() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Residential Interior\"]"));
	}
	
	public void clickOnKitchenService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Kitchen')]/android.widget.Button"));
	}
	
	public void clickOnBathroomService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Bathroom')]/android.widget.Button"));
	}
	
	public void clickOnBedroomService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Bedroom')]/android.widget.Button"));
	}
	
	public void clickOnLivingRoomService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Living Room')]/android.widget.Button"));
	}
	
	public void clickOnDiningRoomService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Dining Room')]/android.widget.Button"));
	}
	
	public void clickOnBasementService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Basement')]/android.widget.Button"));
	}
	
	public void clickOnAtticService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Attic')]/android.widget.Button"));
	}
	
	
	
//	-------------common--------------------//
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Proceed']"));
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
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
	
}
