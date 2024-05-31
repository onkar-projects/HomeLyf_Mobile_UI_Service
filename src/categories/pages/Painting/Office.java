package Painting;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Office extends BasePage {
	public Office(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerPaintingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Painting']"));
	}

	public void clickCustomerOfficeOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Office']"));
	}

	public void clickCustomerOfficelessthan5kOption() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
	}

	public void clickCustomerOfficeConsultationOption() {
		clickElement(AppiumBy.xpath("(//android.view.View[2])[4]"));
		//clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[2]"));
		//clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View)[4]"));
		//clickElement(AppiumBy.xpath("//android.view.View[2]/android.view.View[2]/android.view.View[2]"));
	}

}
