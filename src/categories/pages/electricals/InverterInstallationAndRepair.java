package electricals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class InverterInstallationAndRepair extends BasePage {

	public InverterInstallationAndRepair(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	-----------------------HomePage Category-------------------------------------//
	public void clickOnElectricals() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Electricals\"]"));
	}
	
	public void clickOnInverterInstallationAndRepair() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Inverter Installation & Repair\"]"));
	}
	
	public void clickOnConsultationChargesAndThenQuotation() {
		clickElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Consultation charges and then quotation\r\n"
				+ "Description Not Available\r\n"
				+ "₹ 150\r\n"
				+ "Duration: 30 Min\"]"));
	}
	
	
	
	public void clickOnCategories() {
			
		String categories;
			List<WebElement> element  = driver.findElements(By.xpath("//android.widget.ScrollView/android.view.View/android.view.View[3]/android.view.View/android.view.View")); 
//			for(int i =1 ; i<=element.size(); i++) {
				categories = element.get(1).getAttribute("content-desc");
				System.out.println("Categories: "+categories);
//			}
		}
}

