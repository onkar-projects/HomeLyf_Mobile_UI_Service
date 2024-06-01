package waterproofing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Walls extends BasePage {

	public Walls(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnWaterproofing() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Waterproofing\"]"));
	}
	
	public void clickOnWalls() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Walls\"]"));
	}
	
	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Consultation charges and then quotation')]/android.widget.Button"));
	}
	
	public void clickOnContinueBookingBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue Booking\"]"));
	}
	
	public String getOrderPlacedSuccessfulMsg() {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
	
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	public void clickOnAddToCartTabb() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[2]"));
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
	
	public void clickOnBookNow() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Book Now\"]"));
	}
	
	public void clickOnAddToCart() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add to Cart\"]"));
	}
	
//	public void clickOnPlusButton() {
//		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Consultation charges and then quotation\r\n"
//				+ "₹ 150 Rs.\"]/android.widget.Button"));
//	}
	
	public void clickOnMinusButton() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Consultation charges and then quotation\r\n"
				+ "₹ 150 Rs.\r\n"
				+ "1\"]/android.widget.Button[1]"));
	}
}
