package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class SpecializedInsect extends BasePage{

	public SpecializedInsect(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnSpecializedInsect() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Specialized Insect\"]"));
	}

}
