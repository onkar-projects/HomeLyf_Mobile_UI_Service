package Carpentry;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class OldFurnitureRepair extends BasePage {
	public OldFurnitureRepair(AndroidDriver driver) {
		super(driver);
	}

	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}

	public void clickCustomerCarpentryOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Carpentry']"));
	}

	public void clickCustomerOldFurnitureRepairOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Old Furniture Repair']"));
	}

	public void clickCustomerOldFurnitureRepairConsultationOption() {
		// clickElement(AppiumBy.xpath("(//android.view.View)[12]"));
		// clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View[2]/android.view.View)"));
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Add']"));
	}

}
