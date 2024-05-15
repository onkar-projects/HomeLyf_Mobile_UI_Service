package electricals;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class LightFitting extends BasePage{

	
	public LightFitting(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnLightFitting() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Light fitting\"]"));
	}
	
	public void clickOnElectricals() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electricals\"]"));
	}
	
	public void clickOnFanInstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[1]"));
	}
	
	public void getTextFanInstallation() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Fan installation']"));
	}
	
	public void getDealPrice() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Deal Price: ₹ 150']"));
	}
	public void clickOnBuyNow() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Buy Now\"]"));
	}
	
	public void clickOnAddToCart() {
		clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add to Cart\"]"));
	}
	
	public void clickOnFanRepair() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[2]"));
	}
	
	public void getTextFanRepair() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Fan repair']"));
	}
	
	public void clickOnFanUninstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[3]"));
	}
	
	public void getTextFanUninstallation(){
		getElementText(AppiumBy.xpath("//android.view.View[@content-desc='Fan uninstallation']"));
	}
	
	public void clickOnCeilingLampsInstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[4]"));
		
	}
	
	public void scrollDown() {
		scrollDown("Consultation charges and then quotation");
	}
	
	public void getTextCeilingLampsInstallation() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Ceiling Lamps installation']"));
	}
	
	public void clickOnCeilingLampsUninstallation() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[5]"));
	
	}
	public void getTextCeilingLampsUninstallation() throws InterruptedException{
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Ceiling Lamps uninstallation']"));
	}
	
	public void clickOnConsultaionChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("//android.view.View[3]/android.view.View/android.view.View[6]"));
	}
	
	public void getTextConsultaionChargesAndThenQuotation() throws InterruptedException {
		getTextByAttribute(AppiumBy.xpath("//android.view.View[@content-desc='Consultation charges and then quotation']"));
	}
	
	public void clickOn() {
		clickElement(AppiumBy.xpath(""));
	}
//	
//	public void clickOn() {
//		clickElement(AppiumBy.xpath(""));
//	}

	
}
