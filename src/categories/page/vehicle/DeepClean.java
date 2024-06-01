package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class DeepClean extends BasePage {

	public DeepClean(AndroidDriver driver) {
		super(driver);
	}

	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnDeepClean() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Deep Clean\"]"));
	}
	
	public void clickOnSUV() {
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'SUV')])/android.widget.Button"));
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
//	-----------------------------------------------------------------------//
	
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
