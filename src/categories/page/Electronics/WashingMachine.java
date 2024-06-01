package Electronics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WashingMachine extends BasePage {
	public WashingMachine(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerElectronicsOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electronics\"]"));

	}

	public void clickCustomerWashingMachineOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Washing Machine\"]"));

	}

	public void clickCustomerWashingMachinePCBIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));

	}

	public void clickCustomerWashingMachineMotorIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));

	}

	public void clickCustomerWashingMachineDrumIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));

	}

}
