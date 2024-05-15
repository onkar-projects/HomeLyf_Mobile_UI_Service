package WaterPurifier;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class NonElectricWaterPurifier extends BasePage {

	public NonElectricWaterPurifier(AndroidDriver driver) {
		super(driver);
		
	}

	public void clickOnWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Water Purifier\"]"));
	}
	
	public void clickOnNonElectricWaterPurifier() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Non-Electric Water Purifier\"]"));
	}
}
