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
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Consultation charges and then quotation\r\n"
				+ "	Description Not Available\r\n"
				+ "	₹ 150\r\n"
				+ "	Duration: 30 Min\"]"));
	}
}
