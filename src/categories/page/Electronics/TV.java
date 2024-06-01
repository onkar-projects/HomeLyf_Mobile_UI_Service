package Electronics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class TV extends BasePage {
	public TV(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerElectronicsOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electronics\"]"));
	}

	public void clickCustomerTVOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"TV\"]"));
	}

	public void clickCustomerTVDisplayIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}

	public void clickCustomerTVPCBIssueOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));
	}

	public void clickCustomerTVConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[3]"));
	}

}
