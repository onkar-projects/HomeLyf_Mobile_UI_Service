package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class EmergencyPestControl extends BasePage {

	public EmergencyPestControl(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnEmergencyPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Emergency Pest Control\"]"));
	}
	public void clickOnTweentyBySevenService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'24/7 Services')]/android.widget.Button"));
	}
	public void clickOnEmergencyResponseTeamsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Emergency Response Teams')]/android.widget.Button"));
	}
	public void clickOnUrgentInfestationTreatmentsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Urgent Infestation Treatments')]/android.widget.Button"));
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
