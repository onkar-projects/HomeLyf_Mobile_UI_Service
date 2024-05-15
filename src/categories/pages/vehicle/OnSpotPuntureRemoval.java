package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class OnSpotPuntureRemoval extends BasePage{

	public OnSpotPuntureRemoval(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnSpotPunctureRemoval() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"On the spot Puncture Removal\"]"));
	}
}
