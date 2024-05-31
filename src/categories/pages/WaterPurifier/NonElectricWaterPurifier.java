package WaterPurifier;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class NonElectricWaterPurifier extends BasePage {

	public NonElectricWaterPurifier(AndroidDriver driver) {
		super(driver);
		
	}

	public void clickOnWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Water Purifier\"]"));
	}
	
	public void clickOnNonElectricWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Non-Electric Water Purifier\"]"));
	}
	
	public void clickOnFilterChangeService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Filter Change')]/android.widget.Button"));
	}
	
	public void clickOnTapLeakageService() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Tap leakage')]/android.widget.Button"));
		
	}
	
	public void clickOnCandleChangeService() {
		
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Candle Change')]/android.widget.Button"));
	}
//-----------------------	
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
