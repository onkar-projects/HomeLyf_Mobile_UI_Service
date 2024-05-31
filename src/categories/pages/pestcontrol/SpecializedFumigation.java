package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedFumigation extends BasePage {

	public SpecializedFumigation(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnSpecializedFumigation() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Fumigation\"]"));
	}

	public void clickOnStructuralFumigationService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Structural Fumigation')]/android.widget.Button"));
	}
	public void clickOnContainerFumigationService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Container Fumigation')]/android.widget.Button"));
	}
	public void clickOnCommodityFumigationService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Commodity Fumigation')]/android.widget.Button"));
	}
	public void clickOnSoilFumigationService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Soil Fumigation')]/android.widget.Button"));
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
