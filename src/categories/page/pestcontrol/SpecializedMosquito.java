package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedMosquito extends BasePage {

	public SpecializedMosquito(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnSpecializedMosquito() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Mosquito\"]"));
	}

	public void clickOnSprayingService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Spraying')]/android.widget.Button"));
	}
	public void clickOnFoggingService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Fogging')]/android.widget.Button"));
	}
	public void clickOnLarvicideTreatmentsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Larvicide Treatments')]/android.widget.Button"));
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
