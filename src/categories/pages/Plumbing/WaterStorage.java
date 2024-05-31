package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WaterStorage extends BasePage {
	public WaterStorage(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));

	}

	public void clickCustomerWaterStorageOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Water Storage\"]"));

	}

	public void clickCustomerWaterStorageInstallOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
	}

	public void clickCustomerWaterStorageConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		// clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
	}

}
