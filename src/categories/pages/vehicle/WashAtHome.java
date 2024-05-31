package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WashAtHome extends BasePage{

	public WashAtHome(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnWashAtHome() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Wash at Home\"]"));
	}
	
	public void clickOnSUV() {
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'SUV')])/android.widget.Button"));
	}
	
	public void clickOnAddBtn() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}
	
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}
	
	public void clickOnHatchback() {
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Hatchback')])/android.widget.Button"));
	}
	
	public void clickOnSedan() {
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[3]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Sedan')])/android.widget.Button"));
	}
	
	public void clickOnHeavyDuty() {
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[4]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Heavy duty')])/android.widget.Button"));
		
	}
	
	
//	public void clickOnAddToCart() {
//		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add to Cart\"]"));
//	}
	
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
