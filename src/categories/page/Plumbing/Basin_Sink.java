package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Basin_Sink extends BasePage {
	public Basin_Sink(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));
	}

	public void clickCustomerBasinandSinkOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Basin and Sink\"]"));
	}

	public void clickCustomerBasinandSinkInstallOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
	}

	public void clickCustomerBasinandSinkRepairOption() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		//clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[2]"));
	}

	public void clickCustomerBasinandSinkUninstallOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[3]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[3]"));
	}

	public void clickCustomerBasinandSinkConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[4]"));
		// clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[4]"));
	}

}
