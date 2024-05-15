package WaterPurifier;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ElectricWaterPurifier extends BasePage {

	
	public ElectricWaterPurifier(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Water Purifier\"]"));
	}
	
	public void clickOnElectricWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electric Water Purifier\"]"));
	}
}
