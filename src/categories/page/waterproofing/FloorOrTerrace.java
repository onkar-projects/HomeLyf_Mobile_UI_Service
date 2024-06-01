package waterproofing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class FloorOrTerrace extends BasePage{

	public FloorOrTerrace(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnWaterproofing() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Waterproofing\"]"));
	}
	
	public void clickOnFloorOrTerrace() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Floor or terrace\"]"));
	}
	
	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View)[3]"));
	}
	public void clickOnAddBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add\"]"));
	}

	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[2]"));
	}

	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}
	public void clickOnContinueBookingBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue Booking\"]"));
	}
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}

	public void clickOnSelectDate() {
		clickElement(AppiumBy.xpath("(//android.view.View[4]/android.view.View[1]/android.view.View)[1]"));
	}

	public void clickOnSelectTime() {
		clickElement(AppiumBy.xpath("(//android.view.View[6]/android.view.View[1]/android.view.View)[1]"));
	}

	
}
