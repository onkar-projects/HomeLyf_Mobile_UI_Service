package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedInsect extends BasePage{

	public SpecializedInsect(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	public void clickOnSpecializedInsect() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Insect\"]"));
	}
	public void clickOnAntsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Ants')]/android.widget.Button"));
	}
	public void clickOnCockroachesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Cockroaches')]/android.widget.Button"));
	}
	public void clickOnSpidersService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Spiders')]/android.widget.Button"));
	}
	public void clickOnFliesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Flies')]/android.widget.Button"));
	}
	
	public void clickOnOtherInsectsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Other Insects')]/android.widget.Button"));
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
