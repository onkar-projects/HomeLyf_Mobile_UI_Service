package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import WaterPurifier.ElectricWaterPurifier;
import WaterPurifier.NonElectricWaterPurifier;
import commonpackage.ServicesLibrary;
import electricals.InverterInstallationAndRepair;
import electricals.LightFitting;
import electricals.WiringIssues;
import io.appium.java_client.android.AndroidDriver;
import pestcontrol.Commercial;
import pestcontrol.EmergencyPestControl;
import pestcontrol.GreenPestControl;
import pestcontrol.ResidentialExterior;
import pestcontrol.ResidentialInterior;
import pestcontrol.SpecializedBedBug;
import pestcontrol.SpecializedFumigation;
import pestcontrol.SpecializedInsect;
import pestcontrol.SpecializedMosquito;
import pestcontrol.SpecializedRodent;
import pestcontrol.SpecializedTermite;
import pestcontrol.SpecializedWildlife;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;
import vehicle.DeepClean;
import vehicle.OnSpotPuntureRemoval;
import vehicle.WashAtHome;
import waterproofing.FloorOrTerrace;
import waterproofing.Walls;

public class Services {

	AndroidDriver driver;
	LightFitting lightFitting;
	InverterInstallationAndRepair invertertIAndR;
	WiringIssues wiringissues;
	FloorOrTerrace floorOrterrace;
	Walls walls;
	OnSpotPuntureRemoval onSpot;
	WashAtHome washathome;
	DeepClean deepclean;
	ElectricWaterPurifier electricwp;
	NonElectricWaterPurifier nonelectricwp;
	Commercial commercial;
	EmergencyPestControl Emergency;
	GreenPestControl greenPestControl;
	ResidentialExterior residentialExterior;
	ResidentialInterior residentialInterior;
	SpecializedBedBug specializedBedBug;
	SpecializedFumigation specializedFumigation;
	SpecializedInsect specializedInsect;
	SpecializedMosquito specializedMosquito;
	SpecializedRodent specializedRodent;
	SpecializedTermite specializedTermite;
	SpecializedWildlife specializedWildlife;

	SoftAssert sa = new SoftAssert();
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

	@Test(priority = 1, enabled = true, description = "Customer SignIn with valid data")
	public void Customer_Signin() throws InterruptedException, IOException {
		Library.customer_SignIn_Details(driver);
	}

	/*----------AddressErrorMsg----------------------*/
	@Test(priority = 75, enabled = false, description = "Address Error Toaster MesAssertge")
	public void getAddressErrorMsg() throws InterruptedException, IOException {
		Library.AddressErrorMsg(driver);
		// Assert.assertEquals(, "Please select an address");
	}

	/*---------------------------------------------Electricals-----------------------------------------------------*/
	@Test(priority = 2, enabled = true) // pass
	public void selectLightFitting_FanInstallation() throws InterruptedException, IOException {
		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanInstallation(driver), "Order placed successfully");

	}

	@Test(priority = 3, enabled = true) // pass
	public void selectLightFitting_FanRepair() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanRepair(driver), "Order placed successfully");

	}

	@Test(priority = 4, enabled = true) // pass
	public void selectLightFitting_FanUninstallation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanUninstallation(driver), "Order placed successfully");

	}

	@Test(priority = 5, enabled = true) // Pass
	public void selectLightFitting_CeilingLampsInstallation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectLightFitting_CeilingLampsInstallation(driver),
				"Order placed successfully");
	}

	@Test(priority = 6, enabled = true) // pass
	public void selectLightFitting_CeilingLampsUninstallation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectLightFitting_CeilingLampsUninstallation(driver),
				"Order placed successfully");
	}

	@Test(priority = 7, enabled = true) // done
	public void selectLightFitting_ConsultationChargeAndQuotation() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.selectLightFitting_ConsultationChargesAndQuotation(driver),
				"Order placed successfully");
	}

	@Test(priority = 8, enabled = true) // done
	public void selectInverterInstallationAndRepair_ConsultationChargeAndQuotation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectInverterInstallationAndRepair_ConsultationChargesAndQuotation(driver),
				"Order placed successfully");
	}

	@Test(priority = 9, enabled = true) // pass
	public void selectWiringIssues_NewPoints() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWiringIssues_NewPoints(driver), "Order placed successfully");

	}

	/*---------------------------------------------Waterproofing-----------------------------------------------------*/
	@Test(priority = 10, enabled = true) // pass
	public void selectWaterproofing_FloorOrTerrace() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWaterproofing_FloorOrTerrace(driver), "Order placed successfully");
	}

	@Test(priority = 11, enabled = true)
	public void selectWalls_ConsultationChargetAndQuotation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWalls_ConsultationChargesAndQuotation(driver),
				"Order placed successfully");
	}

	/*---------------------------------------------Vehicles-----------------------------------------------------*/

	@Test(priority = 12, enabled = true) // pass
	public void selectOnspotPunctureRemoval_Tube() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectOnspotPunctureRemoval_Tube(driver), "Order placed successfully");
	}

	@Test(priority = 13, enabled = true) // pass
	public void selectOnspotPunctureRemoval_Tubeless() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectOnspotPunctureRemoval_Tubeless(driver), "Order placed successfully");
	}

	@Test(priority = 14, enabled = true) // pass
	public void selectWashAtHome_SUV() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWashAtHome_SUV(driver), "Order placed successfully");
	}

	@Test(priority = 15, enabled = true) // pass
	public void selectWashAtHome_Hatchback() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWashAtHome_Hatchback(driver), "Order placed successfully");
	}

	@Test(priority = 16, enabled = true) // pass
	public void selectWashAtHome_Sedan() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWashAtHome_Sedan(driver), "Order placed successfully");
	}

	@Test(priority = 17, enabled = true) // pass
	public void selectWashAtHome_HeavyDuty() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectWashAtHome_HeavyDuty(driver), "Order placed successfully");
	}

	@Test(priority = 18, enabled = true) // pass
	public void selectDeepClean_SUV() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectDeepClean_SUV(driver), "Order placed successfully");
	}

	@Test(priority = 19, enabled = true) // pass
	public void selectDeepClean_Hatchback() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectDeepClean_Hatchback(driver), "Order placed successfully");
	}

	@Test(priority = 20, enabled = true) // pass
	public void selectDeepClean_Sedan() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectDeepClean_Sedan(driver), "Order placed successfully");
	}

	@Test(priority = 21, enabled = true) // pass
	public void selectDeepClean_HeavyDuty() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectDeepClean_HeavyDuty(driver), "Order placed successfully");
	}
	/*---------------------------------------------Water Purifier-----------------------------------------------------*/

	@Test(priority = 22, enabled = true) // pass
	public void selectElectricWaterPurifier_AnnualFilterService() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_AnnualFilterService(driver),
				"Order placed successfully");
	}

	@Test(priority = 23, enabled = true) // pass
	public void selectElectricWaterPurifier_Repair() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_Repair(driver).get(0), "Service Added to Cart");
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_Repair(driver).get(1),
				"Order placed successfully");

	}

	@Test(priority = 24, enabled = true) // pass
	public void selectElectricWaterPurifier_InstallExtraPurifierFilterAndCable() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_InstallExtraPurifierFilterAndCable(driver),
				"Order placed successfully");
	}

	@Test(priority = 25, enabled = true) // pass
	public void selectElectricWaterPurifier_StorageCleaning() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_StorageCleaning(driver),
				"Order placed successfully");
	}

	@Test(priority = 26, enabled = true) // pass
	public void selectElectricWaterPurifier_TabLeaking() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_TabLeaking(driver),
				"Order placed successfully");
	}

	@Test(priority = 27, enabled = true, description = "FilterChange End-To-End Booking") // pass
	public void selectNonElectricWaterPurifier_FilterChange() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_FilterChange(driver),
				"Order placed successfully");
	}

	@Test(priority = 28, enabled = true, description = "Tap Leakage End-To-End Booking") // pass
	public void selectNonElectricWaterPurifier_TapLeakage() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_TapLeakage(driver),
				"Order placed successfully");
	}

	@Test(priority = 29, enabled = true, description = "Candle Change End-To-End Booking") // pass
	public void selectNonElectricWaterPurifier_CandleChange() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_CandleChange(driver),
				"Order placed successfully");
	}

	// ----------------------------------Pest Control
	// Category---------------------------//

	@Test(priority = 30, enabled = true, description = "Office Services End-To-End Booking")
	public void selectPestControlCommercial_Offices() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Offices(driver), "Order placed successfully");
	}

	@Test(priority = 31, enabled = true, description = "PestControl-Restaurant Service End-To-End Booking") // pass
	public void selectPestControlCommercial_Restaurants() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Restaurants(driver),
				"Order placed successfully");
	}

	@Test(priority = 32, enabled = true, description = "PestControl-Hotel Service End-To-End Booking") // pass
	public void selectPestControlCommercial_Hotels() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Hotels(driver), "Order placed successfully");
	}

	@Test(priority = 33, enabled = true, description = "PestControl-FoodProcessingPlants Service End-To-End Booking") // pass
	public void selectPestControlCommercial_FoodProcessingPlants() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_FoodProcessingPlants(driver),
				"Order placed successfully");
	}

	@Test(priority = 34, enabled = true, description = "PestControl-Warehouses Service End-To-End Booking") // pass
	public void selectPestControlCommercial_Warehouses() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Warehouses(driver),
				"Order placed successfully");
	}

	@Test(priority = 35, enabled = true, description = "PestControl-Hotel Service End-To-End Booking") // pass
	public void selectPestControlCommercial_RetailStores() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_RetailStores(driver),
				"Order placed successfully");
	}

	@Test(priority = 36, enabled = true, description = "PestControl-HealthCare Service End-To-End Booking") // pass
	public void selectPestControlCommercial_HealthCare() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_HealthCare(driver),
				"Order placed successfully");
	}

	@Test(priority = 37, enabled = true, description = "PestControl-Educational Service End-To-End Booking") // pass
	public void selectPestControlCommercial_Educational() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Educational(driver),
				"Order placed successfully");
	}

//-------Specialized Termite-----//

	@Test(priority = 38, enabled = true, description = "PestControl-Inspection Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_Inspection() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPestControlSpecializedTermite_Inspection(driver),
				"Order placed successfully");
	}

	@Test(priority = 39, enabled = true, description = "PestControl-PreconstructionTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_preTreatment() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_ST_PreTreatment(driver), "Order placed successfully");
	}

	@Test(priority = 40, enabled = true, description = "PestControl-PostconstructionTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_postTreatment() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_ST_PostTreatment(driver), "Order placed successfully");
	}

//-----------specialized bed bug--------------//

	@Test(priority = 41, enabled = true, description = "PestControl-MattressEncasements Service End-To-End Booking")
	public void selectPestControlSpecializedBedBug_MattressEncasements() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SBB_MattressEncasements(driver), "Order placed successfully");
	}

	@Test(priority = 42, enabled = true, description = "PestControl-FurnitureTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedBedBug_FurnitureTreatment() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SBB_FurnitureTreatment(driver), "Order placed successfully");
	}

	// -----------specialized Rodent--------------//

	@Test(priority = 43, enabled = true, description = "PestControl-Mice Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Mice() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SR_Mice(driver), "Order placed successfully");
	}

	@Test(priority = 44, enabled = true, description = "PestControl-Rats Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Rats() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SR_Rats(driver), "Order placed successfully");
	}

	@Test(priority = 45, enabled = true, description = "PestControl-Squirrels Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Squirrels() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SR_Squirrels(driver), "Order placed successfully");
	}

	@Test(priority = 46, enabled = true, description = "PestControl-Rodents Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_OtherRodents() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SR_OtherRodents(driver), "Order placed successfully");
	}

	// -----------specialized WildLife--------------//

	@Test(priority = 47, enabled = true, description = "PestControl-Birds Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Birds() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Birds(driver), "Order placed successfully");
	}

	@Test(priority = 48, enabled = true, description = "PestControl-Bats Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Bats() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Bats(driver), "Order placed successfully");
	}

	@Test(priority = 49, enabled = true, description = "PestControl-Skunks Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Skunks() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Skunks(driver), "Order placed successfully");
	}

	// -----------specialized Mosquito--------------//

	@Test(priority = 50, enabled = true, description = "PestControl-Spraying Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Spraying() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SM_Spraying(driver), "Order placed successfully");
	}

	@Test(priority = 51, enabled = true, description = "PestControl-Fogging Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Fogging() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SM_Fogging(driver), "Order placed successfully");
	}

	@Test(priority = 52, enabled = true, description = "PestControl-LarvicideTreatments Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Larvicide() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SM_Larvicide(driver), "Order placed successfully");
	}

	// -----------specialized Insect--------------//

	@Test(priority = 53, enabled = true, description = "PestControl-Ants Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Ants() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SI_Ants(driver), "Order placed successfully");
	}

	@Test(priority = 54, enabled = true, description = "PestControl-Cockroaches Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Cockroaches() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SI_Cockroaches(driver), "Order placed successfully");
	}

	@Test(priority = 55, enabled = true, description = "PestControl-Flies Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Flies() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SI_Flies(driver), "Order placed successfully");
	}

	@Test(priority = 56, enabled = true, description = "PestControl-Spiders Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Spiders() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SI_Spiders(driver), "Order placed successfully");
	}

	@Test(priority = 57, enabled = true, description = "PestControl-OtherInsects Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_OtherInsects() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SI_OtherInsects(driver), "Order placed successfully");
	}

	// -----------specialized Fumigation--------------//

	@Test(priority = 58, enabled = true, description = "PestControl-StructuralFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_structuralFamigation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SF_structuralFamigation(driver), "Order placed successfully");
	}

	@Test(priority = 59, enabled = true, description = "PestControl-ContainerFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_ContainerFamigation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SF_ContainerFamigation(driver), "Order placed successfully");
	}

	@Test(priority = 60, enabled = true, description = "PestControl-CommodityFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_CommodityFamigation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SF_CommodityFamigation(driver), "Order placed successfully");
	}

	@Test(priority = 61, enabled = true, description = "PestControl-SoilFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_SoilFamigation() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_SF_SoilFamigation(driver), "Order placed successfully");
	}

	// -----------Green Pest Control--------------//

	@Test(priority = 62, enabled = true, description = "PestControl-EcoProducts Service End-To-End Booking")
	public void selectPestControlGreenPestControl_EcoFriedly() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_GPC_EcoFriedly(driver), "Order placed successfully");
	}

	@Test(priority = 63, enabled = true, description = "PestControl-IPM Service End-To-End Booking")
	public void selectPestControlGreenPestControl_IPM() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_GPC_IPM(driver), "Order placed successfully");
	}

	@Test(priority = 64, enabled = true, description = "PestControl-BiologicalControl Service End-To-End Booking")
	public void selectPestControlGreenPestControl_BiologicalControl() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_GPC_BiologicalContro(driver), "Order placed successfully");
	}

	@Test(priority = 65, enabled = true, description = "PestControl-BotanicalPesticides Service End-To-End Booking")
	public void selectPestControlGreenPestControl_BotanicalPesticides() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_GPC_BotanicalPesticides(driver), "Order placed successfully");
	}

	// -----------Emergency Pest Control--------------//
	@Test(priority = 66, enabled = true, description = "PestControl-TwentyBySeven Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_AllDayServices() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_EPC_AllDayServices(driver), "Order placed successfully");
	}

	@Test(priority = 67, enabled = true, description = "PestControl-EmergencyResponseTeams Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_ERTeam() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.selectPC_EPC_ERTeam(driver), "Order placed successfully");
	}

	@Test(priority = 68, enabled = true, description = "PestControl-UrgentInfestationTreatments Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_UITtreatment() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.selectPC_EPC_UITtreatment(driver), "Order placed successfully");
	}

	@Test(priority = 69, enabled = true, description = "PestControl-ResidentialInterior-All Services End-To-End Booking")
	public void selectPestControlResidentialInterior_AllServices() throws InterruptedException {
		// fail
		Assert.assertEquals(ServicesLibrary.selectPC_RI_AllServices(driver), "Order placed successfully");
	}

	@Test(priority = 70, enabled = true, description = "PestControl-ResidentialExterior-All Services End-To-End Booking")
	public void selectPestControlResidentialExterior_AllServices() throws InterruptedException {
		// fail
		Assert.assertEquals(ServicesLibrary.selectPC_RE_AllServices(driver), "Order placed successfully");
	}
	/*----------------------Error Validation-------------------------------*/

	@Test(priority = 71, enabled = true, description = "Service Not Available In The Cart") // fail
	public void getErrorMesAssertgeForServiceNotAvailabeInCart() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.getErrorMessageOfServiceNotAvailabeInCart(driver),
				"Oops! No Items In Cart");
	}

	@Test(priority = 72, enabled = true, description = "Timeslot Toaster Error MesAssertge") // pass
	public void getTextTimeSlotToasterMsg() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.getTextTimeSlotToasterMsg(driver), "Please Select Timeslot");
	}

	//// android.view.View[@content-desc"Maximum quantity can be added is 5"]
	@Test(priority = 73, enabled = true, description = "Maximum quantity can be added is 5") // pass
	public void getTextMaximumQuantityAtleast5ToasterMsg() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.getTextMaximumQuantityAtleast5ToasterMsg(driver),
				"Maximum quantity can be added is 5");

	}

	@Test(priority = 74, enabled = true, description = "We can't Add Service from Different categories Toaster Error MesAssertge") // pass
	public void getTextAddServiceDifferentCateboryToasterMsg() throws InterruptedException {

		Assert.assertEquals(ServicesLibrary.getTextAddServiceDifferentCateboryToasterMsg(driver),
				"We're Sorry you cant add Services from different Category");
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

