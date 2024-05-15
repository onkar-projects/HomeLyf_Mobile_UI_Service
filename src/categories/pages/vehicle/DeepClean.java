package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class DeepClean extends BasePage {

	public DeepClean(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnDeepClean() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Deep Clean\"]"));
	}
}
