package vehicle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WashAtHome extends BasePage{

	public WashAtHome(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnVehicle() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
	}
	
	public void clickOnWashAtHome() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Wash at Home\"]"));
	}
	

}
