package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ResidentialExterior extends BasePage {

	public ResidentialExterior(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnResidentialExterior() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Residential Exterior\"]"));
	}
	
	public void clickOnYardService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Yard')]/android.widget.Button"));
	}
	
	public void clickOnGardenService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Garden')]/android.widget.Button"));
	}
	
	public void clickOnPatioOrDeckService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Patio/Deck')]/android.widget.Button"));
	}
	
	public void clickOnGarageService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Garage')]/android.widget.Button"));
	}
	
	public void clickOnFenceService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Fence')]/android.widget.Button"));
	}
	
//	-------------common--------------------//
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
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
