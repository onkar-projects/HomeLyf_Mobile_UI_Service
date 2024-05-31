package Painting;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class CommercialBuilding extends BasePage {
	public CommercialBuilding(AndroidDriver driver) {
		super(driver);
	}
	public boolean CategoriesHeading() {
		return isElementDisplayed(AppiumBy.xpath("//android.view.View[@content-desc='Categories']"));
	}


	public void clickCustomerPaintingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Painting']"));
	}

	public void clickCustomerCommercialBuildingOption() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc='Commercial Building']"));
	}

	public void clickCustomerCommercialApartment11floorOption() {
//		clickElement(AppiumBy.xpath("(//android.view.View)[12]"));
//		clickElement(AppiumBy.xpath("//android.view.View[2]/android.view.View[2]/android.view.View[2]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc='Add'])[1]"));
	}

	public void clickCustomerCommercialBuildingConsultationOption() {
		clickElement(AppiumBy.xpath("//android.view.View[2]/android.view.View[2]/android.view.View[2]"));
	}
}
