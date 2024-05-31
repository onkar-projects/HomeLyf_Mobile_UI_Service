package tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import commonPackage.ServicesLibrary;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;

public class Services {
	AndroidDriver driver;
	private static final Logger logger = LogManager.getLogger(Services.class);

	
	@BeforeClass
	public void setUP() throws InterruptedException {
			try {
				AppiumServerManager.startAppiumServer();
				driver = AppiumDriverManager.getDriver();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	@Test(priority=1,enabled = true, description = "Customer SignIn with valid data", dataProvider ="CustomerSigninvaliddata", dataProviderClass = utils.DataProviderClass.class)
	public void TC_001_Customer_Signin(String email, String password) throws InterruptedException, IOException {
		Library.customer_SignIn_Details(driver,email, password);
	
	}	

	@Test(priority = 76, enabled = true, description = "Painting Category Home & Flat sub category")
	public void TC_076_selectHomeFlats1to4bhk() throws InterruptedException {
		ServicesLibrary.HomeFlats1to4bhk(driver);
	}

	@Test(priority = 77, enabled = true, description = "Painting Category Home & Flat sub category")
	public void TC_077_selectHomeFlatsConsultation() throws InterruptedException {
		ServicesLibrary.HomeFlatsConsultation(driver);
	}

	@Test(priority = 78, enabled = true, description = "Painting Category Commercial Building sub category")
	public void TC_078_selectCommercialBuildingApartment11floor() throws InterruptedException {
		ServicesLibrary.CommercialApartment11floor(driver);
	}

	@Test(priority = 79, enabled = true, description = "Painting Category Commercial Building sub category")
	public void TC_079_selectCommercialBuildingConsultation() throws InterruptedException {
		ServicesLibrary.CommercialBuildingConsultation(driver);
	}

	@Test(priority = 80, enabled = true, description = "Painting Category Office sub category")
	public void TC_080_selectOfficelessthan5k() throws InterruptedException {
		ServicesLibrary.Officelessthan5k(driver);
	}

	@Test(priority = 81, enabled = true, description = "Painting Category Office sub category")
	public void TC_081_selectOfficeConsultation() throws InterruptedException {
		ServicesLibrary.OfficeConsultation(driver);
	}

	@Test(priority = 82, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_082_selectFaucetInstallationJetSprayInstall() throws InterruptedException {
		ServicesLibrary.FaucetInstallationJetSprayInstall(driver);
	}

	@Test(priority = 83, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_083_selectFaucetInstallationShowerHeadInstall() throws InterruptedException {
		ServicesLibrary.FaucetInstallationShowerHeadInstall(driver);
	}

	@Test(priority = 84, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_084_selectFaucetInstallationTapsInstall() throws InterruptedException {
		ServicesLibrary.FaucetInstallationTapsInstall(driver);
	}

	@Test(priority = 85, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_085_selectFaucetInstallationMixerInstall() throws InterruptedException {
		ServicesLibrary.FaucetInstallationMixerInstall(driver);
	}

	@Test(priority = 86, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_086_selectFaucetInstallationjetSprayRepair() throws InterruptedException {
		ServicesLibrary.FaucetInstallationjetSprayRepair(driver);
	}

	@Test(priority = 87, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_087_selectFaucetInstallationShowerHeadRepair() throws InterruptedException {
		ServicesLibrary.FaucetInstallationShowerHeadRepair(driver);
	}

	@Test(priority = 88, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_088_selectFaucetInstallationTapsRepair() throws InterruptedException {
		ServicesLibrary.FaucetInstallationTapsRepair(driver);
	}

	@Test(priority = 89, enabled = true, description = "Plumbing Category Faucet Installation sub category")
	public void TC_089_selectFaucetInstallationMixerRepair() throws InterruptedException {
		ServicesLibrary.FaucetInstallationMixerRepair(driver);
	}

	@Test(priority = 90, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_090_selectTapMixerTapInstall() throws InterruptedException {
		ServicesLibrary.TapandMixerTapInstall(driver);
	}

	@Test(priority = 91, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_091_selectTapMixerMixerInstall() throws InterruptedException {
		ServicesLibrary.TapandMixerMixerInstall(driver);
	}

	@Test(priority = 92, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_092_selectTapMixerTapsRepair() throws InterruptedException {
		ServicesLibrary.TapandMixerTapsRepair(driver);
	}

	@Test(priority = 93, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_093_selectTapMixerMixerRepair() throws InterruptedException {
		ServicesLibrary.TapandMixerMixerRepair(driver);
	}

	@Test(priority = 94, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_094_selectTapMixerTapsUninstall() throws InterruptedException {
		ServicesLibrary.TapandMixerTapsUninstall(driver);
	}

	@Test(priority = 95, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_095_selectTapMixerMixerUninstall() throws InterruptedException {
		ServicesLibrary.TapandMixerMixerUninstall(driver);
	}

	@Test(priority = 96, enabled = true, description = "Plumbing Category Tap Mixer sub category")
	public void TC_096_selectTapMixerConsultation() throws InterruptedException {
		ServicesLibrary.TapandMixerConsultation(driver);
	}

	@Test(priority = 97, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_097_selectToiletCommodeInstall() throws InterruptedException {
		ServicesLibrary.ToiletCommodeInstall(driver);
	}

	@Test(priority = 98, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_098_selectToiletCommodeRepair() throws InterruptedException {
		ServicesLibrary.ToiletCommodeRepair(driver);
	}

	@Test(priority = 99, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_099_selectToiletCommodeUninstall() throws InterruptedException {
		ServicesLibrary.ToiletCommodeUninstall(driver);
	}

	@Test(priority = 100, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_100_selectToiletIndianToiletsInstall() throws InterruptedException {
		ServicesLibrary.ToiletIndianToiletsInstall(driver);
	}

	@Test(priority = 101, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_101_selectToiletIndianToiletsRepair() throws InterruptedException {
		ServicesLibrary.ToiletIndianToiletsRepair(driver);
	}

	@Test(priority = 102, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_102_selectToiletIndianToiletsUninstall() throws InterruptedException {
		ServicesLibrary.ToiletIndianToiletsUninstall(driver);
	}

	@Test(priority = 103, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_103_selectToiletFlushIssues() throws InterruptedException {
		ServicesLibrary.ToiletFlushIssues(driver);
	}

	@Test(priority = 104, enabled = true, description = "Plumbing Category Toilet sub category")
	public void TC_104_selectToiletConsultation() throws InterruptedException {
		ServicesLibrary.ToiletConsultation(driver);
	}

	@Test(priority = 105, enabled = true, description = "Plumbing Category Basin Sink sub category")
	public void TC_105_selectBasinSinkInstall() throws InterruptedException {
		ServicesLibrary.BasinandSinkInstall(driver);
	}

	@Test(priority = 106, enabled = true, description = "Plumbing Category Basin Sink sub category")
	public void TC_106_selectBasinSinkRepair() throws InterruptedException {
		ServicesLibrary.BasinandSinkRepair(driver);
	}

	@Test(priority = 107, enabled = true, description = "Plumbing Category Basin Sink sub category")
	public void TC_107_selectBasinSinkUninstall() throws InterruptedException {
		ServicesLibrary.BasinandSinkUninstall(driver);
	}

	@Test(priority = 108, enabled = true, description = "Plumbing Category Basin Sink sub category")
	public void TC_108_selectBasinSinkConsultation() throws InterruptedException {
		ServicesLibrary.BasinandSinkConsultation(driver);
	}

	@Test(priority = 109, enabled = true, description = "Plumbing Category Drain Waste Pipe sub category")
	public void TC_109_selectDrainWastePipeRemoval() throws InterruptedException {
		ServicesLibrary.DrainWastePipeRemoval(driver);
	}

	@Test(priority = 110, enabled = true, description = "Plumbing Category Drain Waste Pipe sub category")
	public void TC_110_selectDrainWastePipeConsultation() throws InterruptedException {
		ServicesLibrary.DrainWastePipeConsultation(driver);
	}

	@Test(priority = 111, enabled = true, description = "Plumbing Category Water Storage sub category")
	public void TC_111_selectWaterStorageInstall() throws InterruptedException {
		ServicesLibrary.WaterStorageInstall(driver);
	}

	@Test(priority = 112, enabled = true, description = "Plumbing Category Water Storage sub category")
	public void TC_112_selectWaterStorageConsultation() throws InterruptedException {
		ServicesLibrary.WaterStorageConsultation(driver);
	}

	@Test(priority = 113, enabled = true, description = "Electronics Category AC sub category")
	public void TC_113_selectACMaintatinance() throws InterruptedException {
		ServicesLibrary.ACMaintatinance(driver);
	}

	@Test(priority = 114, enabled = true, description = "Electronics Category AC sub category")
	public void TC_114_selectACInstallation() throws InterruptedException {
		ServicesLibrary.ACInstallation(driver);
	}

	@Test(priority = 115, enabled = true, description = "Electronics Category AC sub category")
	public void TC_115_selectACUninstallation() throws InterruptedException {
		ServicesLibrary.ACUninstallation(driver);
	}

	@Test(priority = 116, enabled = true, description = "Electronics Category AC sub category")
	public void TC_116_selectACCleaningwithBlower() throws InterruptedException {
		ServicesLibrary.ACCleaningwithBlower(driver);
	}

	@Test(priority = 117, enabled = true, description = "Electronics Category AC sub category")
	public void TC_117_selectACCleaningwithFoam() throws InterruptedException {
		ServicesLibrary.ACCleaningwithFoam(driver);
	}

	@Test(priority = 118, enabled = true, description = "Electronics Category AC sub category")
	public void TC_118_selectACLeakage() throws InterruptedException {
		ServicesLibrary.ACLeakage(driver);
	}

	@Test(priority = 119, enabled = true, description = "Electronics Category AC sub category")
	public void TC_119_selectACConsulatation() throws InterruptedException {
		ServicesLibrary.ACConsulatation(driver);
	}

	@Test(priority = 120, enabled = true, description = "Electronics Category TV sub category")
	public void TC_120_selectTVDisplayIssue() throws InterruptedException {
		ServicesLibrary.TVDisplayIssue(driver);
	}

	@Test(priority = 121, enabled = true, description = "Electronics Category TV sub category")
	public void TC_121_selectTVPCBIssue() throws InterruptedException {
		ServicesLibrary.TVPCBIssue(driver);
	}

	@Test(priority = 122, enabled = true, description = "Electronics Category TV sub category")
	public void TC_122_selectTVConsultation() throws InterruptedException {
		ServicesLibrary.TVConsultation(driver);
	}

	@Test(priority = 123, enabled = true, description = "Electronics Category Fridge sub category")
	public void TC_123_selectFridgeFrosting() throws InterruptedException {
		ServicesLibrary.FridgeFrosting(driver);
	}

	@Test(priority = 124, enabled = true, description = "Electronics Category Fridge sub category")
	public void TC_124_selectFridgeSmellIssue() throws InterruptedException {
		ServicesLibrary.FridgeSmellIssue(driver);
	}

	@Test(priority = 125, enabled = true, description = "Electronics Category Fridge sub category")
	public void TC_125_selectFridgeCompressor() throws InterruptedException {
		ServicesLibrary.FridgeCompressor(driver);
	}

	@Test(priority = 126, enabled = true, description = "Electronics Category Fridge sub category")
	public void TC_126_selectFridgeInsufficientCooling() throws InterruptedException {
		ServicesLibrary.FridgeInsufficientCooling(driver);
	}

	@Test(priority = 127, enabled = true, description = "Electronics Category Washing Machine sub category")
	public void TC_127_selectWashingMachine() throws InterruptedException {
		ServicesLibrary.WashingMachinePCBIssue(driver);
	}

	@Test(priority = 128, enabled = true, description = "Electronics Category Washing Machine sub category")
	public void TC_128_selectWashingMachineMotorIssue() throws InterruptedException {
		ServicesLibrary.WashingMachineMotorIssue(driver);
	}

	@Test(priority = 129, enabled = true, description = "Electronics Category Washing Machine sub category")
	public void TC_129_selectWashingMachineDrumIssue() throws InterruptedException {
		ServicesLibrary.WashingMachineDrumIssue(driver);
	}

	@Test(priority = 130, enabled = true, description = "Carpentry Category New Furniture Estimate sub category")
	public void TC_130_selectNewFurnitureEstimate() throws InterruptedException {
		ServicesLibrary.selectNewFurnitureEstimate(driver);
	}

	@Test(priority = 131, enabled = true, description = "Carpentry Category Old Furniture Repair sub category")
	public void TC_131_selectOldFurnitureRepair() throws InterruptedException {
		ServicesLibrary.selectOldFurnitureRepair(driver);
	}

	@Test(priority = 132, enabled = true, description = "Carpentry Category Polish Wooden Furniture sub category")
	public void TC_132_selectPolishWoodenFurniture() throws InterruptedException {
		ServicesLibrary.selectPolishWoodenFurniture(driver);
	}

	@Test(priority = 133, enabled = true, description = "Cleaning Category Bathroom sub category")
	public void TC_133_selectBathroomCompletewash() throws InterruptedException {
		ServicesLibrary.BathroomCompletewash(driver);
	}

	@Test(priority = 134, enabled = true, description = "Cleaning Category Bathroom sub category")
	public void TC_134_selectBathroomChemicalwash() throws InterruptedException {
		ServicesLibrary.BathroomChemicalwash(driver);
	}

	@Test(priority = 135, enabled = true, description = "Cleaning Category Home sub category")
	public void TC_135_selectHomeRoomsClean() throws InterruptedException {
		ServicesLibrary.HomeRoomsClean(driver);
	}

	@Test(priority = 136, enabled = true, description = "Cleaning Category Home sub category")
	public void TC_136_selectHomeCompleteClean() throws InterruptedException {
		ServicesLibrary.HomeCompleteClean(driver);
	}

	@Test(priority = 137, enabled = true, description = "Cleaning Category Office Commercial sub category")
	public void TC_137_selectOfficeCommercialConsultation() throws InterruptedException {
		ServicesLibrary.CommercialBuildingConsultation(driver);
	}

	@Test(priority = 138, enabled = true, description = "Check Error for Maximum Quantity")
	public void TC_138_checkErrorforMaxQuantity() throws InterruptedException {
		ServicesLibrary.ErrorforMaxQuantity(driver);
	}
	@Test(priority = 139, enabled = true, description = "Check Error for Multiple Categery Services")
	public void TC_139_checkErrorforMultipleCategeryServices() throws InterruptedException {
		ServicesLibrary.ErrorforMultipleCategeryServices(driver);
	}
	
	@Test(priority = 140, enabled = true, description = "Check Error for Not selecting Time")
	public void TC_140_checkErrorforNotselectingTime() throws InterruptedException {
		ServicesLibrary.ErrorforNotselectingTime(driver);
	}
	@AfterClass

	public void tearDown() throws InterruptedException {
		driver.quit();
		AppiumServerManager.stopAppiumServer();
		Thread.sleep(3000);
	}
}

