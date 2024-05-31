package commonPackage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class CommonLocators extends BasePage {
	public CommonLocators(AndroidDriver driver) {
		super(driver);
	}

	public void clickHometab() {
		// clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View[1]"));
		// clickElement(AppiumBy.xpath("(//android.view.View)[9]"));
//		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Home\r\n" 
//		          + "Tab 1 of 3\"]"));
		clickElement(AppiumBy.xpath("(//android.view.View[3]/android.view.View)[1]"));
	}

	public void clickHomeAfterordertab() {
		clickElement(AppiumBy.xpath("(//android.view.View[1])[6]"));
	}

	public void clickBookNowtab() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Book Now']"));
	}

	public void clickCarttab() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View[3]"));
	}

	public void clickDatetab() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View)[1]"));
		// clickElement(AppiumBy.xpath("(//android.view.View[4]/android.view.View)[2]"));
		// clickElement(AppiumBy.xpath("(//android.view.View[3]/android.view.View)[1]"));
	}

	public void clickTimetab() {
		clickElement(AppiumBy.xpath("(//android.view.View[2]/android.view.View)[2]"));
		// clickElement(AppiumBy.xpath("(//android.view.View[6]/android.view.View/android.view.View)[1]"));
		// clickElement(AppiumBy.xpath("//android.view.View[@content-desc='8:30 AM']"));
	}

	public void clickPaymentOptiontab() {
		clickElement(AppiumBy.xpath("//android.widget.RadioButton[@content-desc='Pay Cash After Service']"));
	}

	public void clickContinueBookingtab() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Continue Booking']"));
	}

	public void clickProceedtab() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Proceed']"));
	}

	public void clickaddquantitytab() {
		// clickElement(AppiumBy.xpath("(//android.widget.Button)[3]"));
		clickElement(AppiumBy.xpath("(//android.widget.Button)[3]"));
	}

	public void clickminusquantitytab() {
		clickElement(AppiumBy.xpath("(//android.widget.Button)[1]"));
	}

	public String getAddtoCartMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Service Added to Cart']"));
	}

	public String getMaxquanityMessage() throws InterruptedException {
		return getTextByAttribute(
				AppiumBy.xpath("//android.view.View[@content-desc='Maximum quantity can be added is 5']"));
	}

	public String getTimeslotErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Select Timeslot']"));
	}

	public String getMultipleCategorySelectErrorMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath(
				"//android.view.View[@content-desc=\"We're Sorry you cant add Services from different Category\"]"));
	}

	public String getOrdersuccessMessage() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Order placed successfully']"));
	}
}
