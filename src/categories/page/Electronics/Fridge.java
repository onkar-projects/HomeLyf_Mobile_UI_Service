package Electronics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Fridge extends BasePage {
	public Fridge(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerElectronicsOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electronics\"]"));
	}

	public void clickCustomerFridgeOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Fridge\"]"));
	}

	public void clickCustomerFridgeFrostingOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}

	public void clickCustomerFridgeSmellIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));
	}

	public void clickCustomerFridgeCompressorOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));
	}

	public void clickCustomerFridgeInsufficientCoolingOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[4]"));
	}

}
