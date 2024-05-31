package Electronics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class AC extends BasePage {
	public AC(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerElectronicsOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electronics\"]"));
	}

	public void clickCustomerACOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"AC\"]"));
	}

	public void clickCustomerACMaintatinanceOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}

	public void clickCustomerACInstallationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));
	}

	public void clickCustomerACUninstallationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));
	}

	public void clickCustomerACCleaningwithBlowerOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[4]"));
	}

	public void clickCustomerACCleaningwithFoamOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[5]"));
	}

	public void clickCustomerACLeakageOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[6]"));
	}

	public void clickCustomerACConsulatationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[7]"));
	}

}
