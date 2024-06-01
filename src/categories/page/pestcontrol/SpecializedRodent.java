package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedRodent extends BasePage {

	
	public SpecializedRodent(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}

	public void clickOnSpecializedRodent() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Rodent\"]"));
	}
	
	public void clickOnMiceService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Mice')]/android.widget.Button"));
	}
	public void clickOnRatsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Rats')]/android.widget.Button"));
	}
	public void clickOnSquirelsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Squirrels')]/android.widget.Button"));
	}
	public void clickOnOtherRodentsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Other Rodents')]/android.widget.Button"));
	}
//	-------------common--------------------//
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
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
}
