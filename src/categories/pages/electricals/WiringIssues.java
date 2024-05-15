package electricals;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WiringIssues extends BasePage {
	
	

	public WiringIssues(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnWiringIssues() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Wiring issues\"]"));
	}
	
	public void clickOnNewPoints() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"New points\r\n"
				+ "Description Not Available\r\n"
				+ "₹ 150\r\n"
				+ "Duration: 30 Min\"]"));
	}
	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Consultation charges and then quotation\r\n"
				+ "	Description Not Available\r\n"
				+ "	₹ 150\r\n"
				+ "	Duration: 30 Min\"]"));
	}
	
		
	public void clickOnWalls() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Walls\"]"));
	}
	
	public void clickOnFloorOrTerrace() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Floor or terrace\"]"));
	}	
		
		
	
}
