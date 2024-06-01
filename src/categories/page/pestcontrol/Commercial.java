package pestcontrol;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class Commercial extends BasePage {

	public Commercial(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnPestControl() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pest Control\"]"));
	}
	
	public void clickOnCommercial() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Commercial\"]"));
	}
	
	
	public void clickOnOfficesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Offices')]/android.widget.Button"));
	}
	public void clickOnRestaurantsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Restaurants')]/android.widget.Button"));
	}
	public void clickOnHotelsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Hotels')]/android.widget.Button"));
	}
	public void clickOnFoodProcessingPlantsService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Food Processing Plants')]/android.widget.Button"));
	}
	public void clickOnWarehousesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Warehouses')]/android.widget.Button"));
	}
	public void clickOnRetailStoresService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Retail Stores')]/android.widget.Button"));
	}
	public void clickOnHealthcareFacilitiesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Healthcare Facilities')]/android.widget.Button"));
	}
	public void clickOnEducationalFacilitiesService(){
		clickElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'Educational Facilities')]/android.widget.Button"));
	}
	
//	-------------common--------------------//
	public void clickOnAddToCartTab() {
		clickElement(AppiumBy.xpath("(//android.view.View[3])[3]"));
	}
	
	public void clickOnProceedButton() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Proceed\"]"));
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
	
}
