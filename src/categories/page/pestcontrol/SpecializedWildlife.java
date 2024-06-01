package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedWildlife extends BasePage{

	
	public SpecializedWildlife(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}

	public void clickOnSpecializedWildlife() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Wildlife\"]"));
	}
	public void clickOnBirdsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Birds')]/android.widget.Button"));
	}
	public void clickOnBatsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Bats')]/android.widget.Button"));
	}
	public void clickOnSkunksService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Skunks')]/android.widget.Button"));
	}
	public void clickOnSnakesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Snakes')]/android.widget.Button"));
	}
	public void clickOnCoyotesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Coyotes')]/android.widget.Button"));
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
