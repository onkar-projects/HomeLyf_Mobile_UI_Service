package Cleaning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Bathroom extends BasePage {
	public Bathroom(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerCleaningOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Cleaning']"));
	}

	public void clickCustomerBathroomOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Bathroom\"]"));

	}

	public void clickCustomerBathroomCompleteWashOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));

	}

	public void clickCustomerBathroomChemicalwashOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[2]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[2]"));

	}

}
