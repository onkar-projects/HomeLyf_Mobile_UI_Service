package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Tap_Mixer extends BasePage {
	public Tap_Mixer(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));

	}

	public void clickCustomerTapandMixerOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Tap and Mixer\"]"));

	}

	public void clickCustomerTapandMixerTapInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));

	}

	public void clickCustomerTapandMixerMixerInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));

	}

	public void clickCustomerTapandMixerTapsRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));

	}

	public void clickCustomerTapandMixerMixerRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[4]"));

	}

	public void clickCustomerTapandMixerTapsUninstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));

	}

	public void clickCustomerTapandMixerMixerUninstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[6]"));

	}

	public void clickCustomerTapandMixerConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[7]"));

	}

}
