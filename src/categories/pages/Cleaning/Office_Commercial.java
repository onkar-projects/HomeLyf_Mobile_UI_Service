package Cleaning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Office_Commercial extends BasePage {
	public Office_Commercial(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerCleaningOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Cleaning']"));
	}

	public void clickCustomerOfficeCommercialSpaceOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Office or Commercial Space']"));
	}

	public void clickCustomerOfficeCommercialSpaceConsultationOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View)[12]"));
	    clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)[1]"));
	}
}
