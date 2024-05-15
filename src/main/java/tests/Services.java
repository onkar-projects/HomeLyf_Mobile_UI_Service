package tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import electricals.LightFitting;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;

public class Services{

	AndroidDriver driver;
	LightFitting lightFitting;
	
	

//	@BeforeTest
//	public void setUP() {
//		try {
//			AppiumServerManager.startAppiumServer();
//			driver = AppiumDriverManager.getDriver();
//			lightFitting = new LightFitting(driver);
//			customer = new CustomerTests();
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	@Parameters({"email","password"})
	@BeforeClass
	public void setUP(@Optional String email, @Optional String password) throws InterruptedException {
		try {
			AppiumServerManager.startAppiumServer();
			driver = AppiumDriverManager.getDriver();
			Thread.sleep(2000);
			Library.customer_SignIn_Details(driver, email, password);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
//	@Test(priority = 1, enabled = true, description = "Customer SignIn with valid data", dataProvider = "CustomerSigninvaliddata", dataProviderClass = utils.DataProviderClass.class)
//	public void Customer_Signin(String email, String password) throws InterruptedException, IOException {
//		Library.customer_SignIn_Details(driver, email, password);
//	}

	@Test(priority = 2, enabled= true)
	public void selectLightFitting_FanInstallation() throws InterruptedException, IOException {	
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanInstallation();
		lightFitting.getTextFanInstallation();
		lightFitting.getDealPrice();
		Thread.sleep(2000);
		//basepage.clickOnBackButton();
		
	}

	@Test(priority = 3)
	public void selectLightFitting_FanRepair() throws InterruptedException {
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanRepair();
		lightFitting.getTextFanRepair();
		lightFitting.getDealPrice();
		Thread.sleep(2000);
		//basepage.clickOnBackButton();
		
	}
	
	@Test(priority = 4)
	public void selectLightFitting_FanUninstallation() throws InterruptedException {
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanUninstallation();
		lightFitting.getTextFanUninstallation();
		lightFitting.getDealPrice();
		Thread.sleep(2000);
		//basepage.clickOnBackButton();
		
		
	}
	
	@Test(priority = 5)
	public void selectLightFitting_CeilingLampsInstallation() throws InterruptedException {
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnCeilingLampsInstallation();
		lightFitting.getTextCeilingLampsInstallation();
		lightFitting.getDealPrice();
		
		
	}
	
	@Test(priority = 6)
	public void selectLightFitting_CeilingLampsUninstallation() throws InterruptedException {
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.scrollDown();
		lightFitting.clickOnCeilingLampsUninstallation();
		lightFitting.getTextCeilingLampsUninstallation();
		lightFitting.getDealPrice();
		
	}
	@Test(priority = 7)
	public void selectLightFitting_ConsultationChargesAndQuotation() throws InterruptedException {
		BasePage basepage = new BasePage(driver);
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnConsultaionChargesAndThenQuotation();
		lightFitting.getTextConsultaionChargesAndThenQuotation();
		//lightFitting.getDealPrice();
		
	}
	
	 

}
