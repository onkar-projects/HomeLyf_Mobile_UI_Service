package electricals;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class WiringIssues extends BasePage {

	public WiringIssues(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnElectricals() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electricals\"]"));
	}

	public void clickOnWiringIssues() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Wiring issues\"]"));
	}

	public void clickOnNewPoints() {
		clickElement(AppiumBy.xpath(
				"//android.view.View[contains(@content-desc, 'New points')]/android.widget.Button"));
	}

	public void clickOnAddBtn() {
		clickElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Add\"])[1]"));
	}

	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[2]"));
	}
	
	public String getTextNoServiceInCartMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Oops! No Items In Cart\"]"));
	}

	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
	}

	public void clickOnSelectDate() {
		clickElement(AppiumBy.xpath("(//android.view.View[4]/android.view.View[1]/android.view.View)[1]"));
	}

	public void clickOnSelectTime() {
		clickElement(AppiumBy.xpath("(//android.view.View[6]/android.view.View[1]/android.view.View)[1]"));
	}

	public void clickOnContinueBookingBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue Booking\"]"));
	}
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
	
	public void clickOnHomeTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3]/android.view.View)[1]"));
	}

	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View)[4]"));
	}
	
	
}
