package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ResidentialInterior extends BasePage{

	
	public ResidentialInterior(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}

	public void clickOnResidentialInterior() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Residential Interior\"]"));
	}
}
