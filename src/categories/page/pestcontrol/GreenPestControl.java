package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class GreenPestControl extends BasePage {

	public GreenPestControl(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnGreenPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Green Pest Control\"]"));
	}

	public void clickOnEcoProductsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Eco-friendly Products')]/android.widget.Button"));
	}
	public void clickOnIPMService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Integrated Pest Management')]/android.widget.Button"));
	}
	public void clickOnBiologicalControlService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Biological Control')]/android.widget.Button"));
	}
	public void clickOnBotanicalPesticidesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Botanical Pesticides')]/android.widget.Button"));
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
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
}
