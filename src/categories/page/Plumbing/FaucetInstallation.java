package Plumbing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class FaucetInstallation extends BasePage {
	public FaucetInstallation(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPlumbingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Plumbing\"]"));
	}

	public void clickCustomerFaucetInstallationOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Faucet Installation\"]"));

	}

	public void clickCustomerFaucetInstallationJetSprayInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));

	}

	public void clickCustomerFaucetInstallationShowerHeadInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));
		//clickElement(AppiumBy.xpath("(//android.view.View[2])[3]"));
	}

	public void clickCustomerFaucetInstallationTapsInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));

	}

	public void clickCustomerFaucetInstallationMixerInstallOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[4]"));
		//clickElement(AppiumBy.xpath("//android.view.View[4]"));

	}

	public void clickCustomerFaucetInstallationjetSprayRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));

	}

	public void clickCustomerFaucetInstallationShowerHeadRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));
		//clickElement(AppiumBy.xpath("//android.view.View[6]"));

	}

	public void clickCustomerFaucetInstallationTapsRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[6]"));

	}

	public void clickCustomerFaucetInstallationMixerRepairOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[7]"));

	}

}
