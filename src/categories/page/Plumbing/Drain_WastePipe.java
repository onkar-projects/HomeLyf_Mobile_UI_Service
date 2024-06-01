package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Drain_WastePipe extends BasePage {
	public Drain_WastePipe(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));

	}

	public void clickCustomerDrainWastePipeOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Drain & Waste Pipe\"]"));

	}

	public void clickCustomerDrainWastePipeRemovalOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));

	}

	public void clickCustomerDrainWastePipeConsultationOption() {
	     clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		//clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[2]"));

	}

}
