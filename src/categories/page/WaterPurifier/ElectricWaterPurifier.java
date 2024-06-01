package WaterPurifier;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ElectricWaterPurifier extends BasePage {

	
	public ElectricWaterPurifier(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnWaterPurifier(){
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Water Purifier\"]"));
	}
	
	public void clickOnElectricWaterPurifier(){
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electric Water Purifier\"]"));
	}
	
	public void clickOnAnnualFilterService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Annual Filter Service')]/android.widget.Button"));
	}
	
	public void clickOnRepair(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Repair')]/android.widget.Button"));
		
	}
	
	public void ClickOnPlusButton() {
		for(int i = 0; i<6; i++) {
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Repair')]/android.widget.Button[2]"));
		}
	}
	
	public String getTextAddedServiceToCart() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Service Added to Cart\"]"));
	}
	public String getTextSelectTimeSlotToasterMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Please Select Timeslot']"));
	}
	
	public void clickOnInstallExtraPurifierFilterAndCable(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Install Extra purifier filter and cable')]/android.widget.Button"));
		
	}
	
	public void clickOnStorageCleaningStorage(){
//		WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Storage cleaning storage\"))"));
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Storage cleaning storage')]/android.widget.Button"));
	}
		
	public void clickOnTabLeaking(){
//		WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Tab leaking\"))"));
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Tab leaking')]/android.widget.Button"));
	}
//	-------------------------//
	
	public void clickOnHomeTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3]/android.view.View)[1]"));
	}
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Proceed']"));
	}
	
	public void clickOnSelectDate() {
		clickElement(AppiumBy.xpath("(//android.view.View[4]/android.view.View)[1]/android.view.View[1]"));
	}
	
	public void clickOnSelectTime() {
		clickElement(AppiumBy.xpath("(//android.view.View[6]/android.view.View/android.view.View)[1]"));
	}
	public void clickOnContinueBookingBtn() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue Booking\"]"));
	}
	
	public String getOrderPlacedSuccessfulMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Order placed successfully\"]"));
	}
	
	public String getMaximumQuantityAtleast5ToasterMsg() throws InterruptedException {
		return getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc=\"Maximum quantity can be added is 5\"]"));
	}
}
