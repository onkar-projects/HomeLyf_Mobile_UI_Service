package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Toilet extends BasePage {
	public Toilet(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));

	}

	public void clickCustomerToiletOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Toilet\"]"));

	}

	public void clickCustomerToiletCommodeInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));

	}

	public void clickCustomerToiletCommodeRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));

	}

	public void clickCustomerToiletCommodeUninstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));

	}

	public void clickCustomerToiletIndianToiletsInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[4]"));

	}

	public void clickCustomerToiletIndianToiletsRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));

	}

	public void clickCustomerToiletIndianToiletsUninstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));

	}

	public void clickCustomerToiletFlushIssuesOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[6]"));

	}

	public void clickCustomerToiletConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[7]"));

	}

}
