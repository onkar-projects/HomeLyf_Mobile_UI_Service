package Cleaning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Home extends BasePage {
	public Home(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerCleaningOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Cleaning']"));
	}

	public void clickCustomerHomeOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Home\"]"));
	}

	public void clickCustomerHomeRoomsOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}

	public void clickCustomerHomeCompleteOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));
	}
}
