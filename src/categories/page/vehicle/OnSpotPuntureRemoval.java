package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class OnSpotPuntureRemoval extends BasePage{

	public OnSpotPuntureRemoval(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnSpotPunctureRemoval() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"On the spot Puncture Removal\"]"));
	}
	
	public void clickOnTube() {
//		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Tube')])/android.widget.Button"));
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
	
	public void clickOnTubeless() {
//		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		clickElement(AppiumBy.xpath("(//android.view.View[contains(@content-desc,'Tubeless')])/android.widget.Button"));
		
	}
	
	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[3]"));
	}
	
	public void clickOnProcedButton() {
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
	
	public void clickOnHomeTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3]/android.view.View)[1]"));
	}
	
	public String getTextServiceCantAddDiffCategoriesMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"We're Sorry you cant add Services from different Category\"]"));
	}
	
}
