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
import utils.AppiumDriverManager;
import utils.AppiumServerManager;
import utils.Library;
import vehicle.DeepClean;
import vehicle.OnSpotPuntureRemoval;
import vehicle.WashAtHome;
import waterproofing.FloorOrTerrace;
import waterproofing.Walls;

public class Services{

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
	ResidentialInterior residentialInterior ;
	SpecializedBedBug specializedBedBug;
	SpecializedFumigation specializedFumigation; 
	SpecializedInsect specializedInsect;
	SpecializedMosquito specializedMosquito;
	SpecializedRodent specializedRodent;
	SpecializedTermite specializedTermite;
	SpecializedWildlife specializedWildlife;

	SoftAssert sa = new SoftAssert();
	
	@BeforeClass
	public void setUP() throws InterruptedException {
		try {
			AppiumServerManager.startAppiumServer();
			driver = AppiumDriverManager.getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1, enabled = true, description = "Customer SignIn with valid data")
	public void Customer_Signin() throws InterruptedException, IOException {
		Library.customer_SignIn_Details(driver);
	}
	

	/*----------AddressErrorMsg----------------------*/
	@Test(priority = 75, enabled = false, description = "Address Error Toaster MesAssertge")
	public void getAddressErrorMsg() throws InterruptedException, IOException {
		Library.AddressErrorMsg(driver);
		//Assert.assertEquals(, "Please select an address");
	}
/*---------------------------------------------Electricals-----------------------------------------------------*/
	@Test(priority = 2, enabled= true)//pass
	public void selectLightFitting_FanInstallation() throws InterruptedException, IOException {	
		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanInstallation(driver), "Order placed successfully");
		
	}

	@Test(priority = 3,enabled= true)//pass
	public void selectLightFitting_FanRepair() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanRepair(driver), "Order placed successfully");
		
	}
	
	@Test(priority = 4,enabled= true)// pass
	public void selectLightFitting_FanUninstallation() throws InterruptedException {
	
		Assert.assertEquals(ServicesLibrary.selectLightFitting_FanUninstallation(driver), "Order placed successfully");

	}
	
	@Test(priority = 5,enabled= true) //Pass
	public void selectLightFitting_CeilingLampsInstallation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectLightFitting_CeilingLampsInstallation(driver), "Order placed successfully");
	}
	
	@Test(priority = 6,enabled= true)//pass
	public void selectLightFitting_CeilingLampsUninstallation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectLightFitting_CeilingLampsUninstallation(driver), "Order placed successfully");
	}
	
	@Test(priority = 7,enabled= true)// done
	public void selectLightFitting_ConsultationChargeAndQuotation() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.selectLightFitting_ConsultationChargesAndQuotation(driver), "Order placed successfully");
	}
	
	@Test(priority = 8, enabled = true)// done
	public void selectInverterInstallationAndRepair_ConsultationChargeAndQuotation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectInverterInstallationAndRepair_ConsultationChargesAndQuotation(driver), "Order placed successfully");	
	}
	
	@Test(priority = 9,enabled = true)// pass 
	public void selectWiringIssues_NewPoints() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWiringIssues_NewPoints(driver), "Order placed successfully");
		
	}
	/*---------------------------------------------Waterproofing-----------------------------------------------------*/
	@Test(priority = 10,enabled = true)//pass
	public void selectWaterproofing_FloorOrTerrace() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWaterproofing_FloorOrTerrace(driver), "Order placed successfully");		
	}
	
	@Test(priority = 11, enabled=true)
	public void selectWalls_ConsultationChargetAndQuotation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWalls_ConsultationChargesAndQuotation(driver), "Order placed successfully");		
	}
	
	/*---------------------------------------------Vehicles-----------------------------------------------------*/

	@Test(priority = 12,enabled = true)// pass
	public void selectOnspotPunctureRemoval_Tube() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectOnspotPunctureRemoval_Tube(driver), "Order placed successfully");	
	}
	
	@Test(priority = 13,enabled = true)//pass
	public void selectOnspotPunctureRemoval_Tubeless() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectOnspotPunctureRemoval_Tubeless(driver), "Order placed successfully");
	}
	
	@Test(priority = 14,enabled = true)//pass
	public void selectWashAtHome_SUV() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWashAtHome_SUV(driver), "Order placed successfully");
	}
	
	@Test(priority = 15,enabled = true)//pass
	public void selectWashAtHome_Hatchback() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWashAtHome_Hatchback(driver), "Order placed successfully");
	}
	
	@Test(priority = 16,enabled = true)//pass
	public void selectWashAtHome_Sedan() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWashAtHome_Sedan(driver), "Order placed successfully");
	}
	
	@Test(priority = 17,enabled = true)//pass
	public void selectWashAtHome_HeavyDuty() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectWashAtHome_HeavyDuty(driver), "Order placed successfully");
	}
	
	@Test(priority = 18,enabled = true)//pass
	public void selectDeepClean_SUV() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectDeepClean_SUV(driver), "Order placed successfully");
	}
	
	@Test(priority = 19,enabled = true)//pass
	public void selectDeepClean_Hatchback() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectDeepClean_Hatchback(driver), "Order placed successfully");
	}
	
	@Test(priority = 20,enabled = true)//pass
	public void selectDeepClean_Sedan() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectDeepClean_Sedan(driver), "Order placed successfully");
	}
	
	@Test(priority = 21,enabled = true)//pass
	public void selectDeepClean_HeavyDuty() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectDeepClean_HeavyDuty(driver), "Order placed successfully");
	}
	/*---------------------------------------------Water Purifier-----------------------------------------------------*/

	@Test(priority = 22,enabled = true)//pass
	public void selectElectricWaterPurifier_AnnualFilterService() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_AnnualFilterService(driver), "Order placed successfully");
	}
	
	@Test(priority = 23,enabled = true)//pass
	public void selectElectricWaterPurifier_Repair() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_Repair(driver).get(0), "Service Added to Cart");
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_Repair(driver).get(1), "Order placed successfully");
		
	}
	
	
	
	@Test(priority = 24,enabled = true)//pass
	public void selectElectricWaterPurifier_InstallExtraPurifierFilterAndCable() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_InstallExtraPurifierFilterAndCable(driver), "Order placed successfully");
	}
	
	@Test(priority = 25,enabled = true)//pass
	public void selectElectricWaterPurifier_StorageCleaning() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_StorageCleaning(driver), "Order placed successfully");
	}
	
	@Test(priority = 26,enabled = true)//pass
	public void selectElectricWaterPurifier_TabLeaking() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectElectricWaterPurifier_TabLeaking(driver), "Order placed successfully");
	}
	
	@Test(priority = 27,enabled = true,description ="FilterChange End-To-End Booking")//pass
	public void selectNonElectricWaterPurifier_FilterChange() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_FilterChange(driver), "Order placed successfully");
	}
	
	@Test(priority = 28,enabled = true,description = "Tap Leakage End-To-End Booking")//pass
	public void selectNonElectricWaterPurifier_TapLeakage() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_TapLeakage(driver), "Order placed successfully");	
	}
	
	@Test(priority = 29,enabled = true,description = "Candle Change End-To-End Booking")//pass
	public void selectNonElectricWaterPurifier_CandleChange() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectNonElectricWaterPurifier_CandleChange(driver), "Order placed successfully");	
	}
	
	//----------------------------------Pest Control Category---------------------------//

	@Test(priority = 30,enabled = true,description = "Office Services End-To-End Booking")
	public void selectPestControlCommercial_Offices() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Offices(driver), "Order placed successfully");	
	}
	
	@Test(priority = 31,enabled = true,description = "PestControl-Restaurant Service End-To-End Booking")//pass
	public void selectPestControlCommercial_Restaurants() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Restaurants(driver), "Order placed successfully");
	}
	
	@Test(priority = 32,enabled = true,description = "PestControl-Hotel Service End-To-End Booking")//pass
	public void selectPestControlCommercial_Hotels() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Hotels(driver), "Order placed successfully");	
	}
	
	@Test(priority = 33,enabled = true,description = "PestControl-FoodProcessingPlants Service End-To-End Booking")//pass
	public void selectPestControlCommercial_FoodProcessingPlants() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_FoodProcessingPlants(driver), "Order placed successfully");
	}

	@Test(priority = 34,enabled = true,description = "PestControl-Warehouses Service End-To-End Booking")//pass
	public void selectPestControlCommercial_Warehouses() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Warehouses(driver), "Order placed successfully");	
	}
	
	@Test(priority = 35,enabled = true,description = "PestControl-Hotel Service End-To-End Booking")//pass
	public void selectPestControlCommercial_RetailStores() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_RetailStores(driver), "Order placed successfully");	
	}

	@Test(priority = 36,enabled = true,description = "PestControl-HealthCare Service End-To-End Booking")//pass
	public void selectPestControlCommercial_HealthCare() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_HealthCare(driver), "Order placed successfully");	
	}

	@Test(priority = 37,enabled = true, description = "PestControl-Educational Service End-To-End Booking")//pass
	public void selectPestControlCommercial_Educational() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlCommercial_Educational(driver), "Order placed successfully");	
	}


//-------Specialized Termite-----//

	@Test(priority = 38,enabled = true, description = "PestControl-Inspection Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_Inspection() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPestControlSpecializedTermite_Inspection(driver), "Order placed successfully");	
	}
	
	@Test(priority = 39,enabled = true,description = "PestControl-PreconstructionTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_preTreatment() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_ST_PreTreatment(driver), "Order placed successfully");	
	}
	
	@Test(priority = 40,enabled = true,description = "PestControl-PostconstructionTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedTermite_postTreatment() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_ST_PostTreatment(driver), "Order placed successfully");	
	}
	
	
	
//-----------specialized bed bug--------------//
	
	@Test(priority = 41,enabled = true,description = "PestControl-MattressEncasements Service End-To-End Booking")
	public void selectPestControlSpecializedBedBug_MattressEncasements() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SBB_MattressEncasements(driver), "Order placed successfully");	
	}
	
	@Test(priority = 42,enabled = true,description = "PestControl-FurnitureTreatment Service End-To-End Booking")
	public void selectPestControlSpecializedBedBug_FurnitureTreatment() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SBB_FurnitureTreatment(driver), "Order placed successfully");	
	}
	
	
	//-----------specialized Rodent--------------//
	
	
	@Test(priority = 43,enabled = true,description = "PestControl-Mice Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Mice() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SR_Mice(driver), "Order placed successfully");	
	}
	
	@Test(priority = 44,enabled = true,description = "PestControl-Rats Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Rats() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SR_Rats(driver), "Order placed successfully");	
	}
	
	@Test(priority = 45,enabled = true,description = "PestControl-Squirrels Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_Squirrels() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SR_Squirrels(driver), "Order placed successfully");	
	}
	
	@Test(priority = 46,enabled = true, description = "PestControl-Rodents Service End-To-End Booking")
	public void selectPestControlSpecializedRodent_OtherRodents() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SR_OtherRodents(driver), "Order placed successfully");	
	}
	
	//-----------specialized WildLife--------------//
	
	@Test(priority = 47,enabled = true, description = "PestControl-Birds Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Birds() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Birds(driver), "Order placed successfully");	
	}
	
	@Test(priority = 48,enabled = true,description = "PestControl-Bats Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Bats() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Bats(driver), "Order placed successfully");	
	}
	
	@Test(priority = 49,enabled = true,description = "PestControl-Skunks Service End-To-End Booking")
	public void selectPestControlSpecializedWildLife_Skunks() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SWL_Skunks(driver), "Order placed successfully");	
	}
	
	//-----------specialized Mosquito--------------//
	
	@Test(priority = 50,enabled = true,description = "PestControl-Spraying Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Spraying() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SM_Spraying(driver), "Order placed successfully");	
	}
	
	@Test(priority = 51,enabled = true,description = "PestControl-Fogging Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Fogging() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SM_Fogging(driver), "Order placed successfully");	
	}
	
	@Test(priority = 52,enabled = true,description = "PestControl-LarvicideTreatments Service End-To-End Booking")
	public void selectPestControlSpecializedMosquito_Larvicide() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SM_Larvicide(driver), "Order placed successfully");	
	}
	
	//-----------specialized Insect--------------//
	
	@Test(priority = 53,enabled = true ,description = "PestControl-Ants Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Ants() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SI_Ants(driver), "Order placed successfully");	
	}
	
	@Test(priority = 54,enabled = true ,description = "PestControl-Cockroaches Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Cockroaches() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SI_Cockroaches(driver), "Order placed successfully");	
	}
	
	@Test(priority = 55,enabled = true,description = "PestControl-Flies Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Flies() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SI_Flies(driver), "Order placed successfully");	
	}
	
	@Test(priority = 56,enabled = true ,description = "PestControl-Spiders Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_Spiders() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SI_Spiders(driver), "Order placed successfully");	
	}
	
	@Test(priority = 57,enabled = true ,description = "PestControl-OtherInsects Service End-To-End Booking")
	public void selectPestControlSpecializedInsect_OtherInsects() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SI_OtherInsects(driver), "Order placed successfully");	
	}
	
	//-----------specialized Fumigation--------------//
	
	@Test(priority = 58,enabled = true,description = "PestControl-StructuralFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_structuralFamigation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SF_structuralFamigation(driver), "Order placed successfully");	
	}
	
	@Test(priority = 59,enabled = true,description = "PestControl-ContainerFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_ContainerFamigation() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_SF_ContainerFamigation(driver), "Order placed successfully");
	}
	
	@Test(priority = 60,enabled = true,description = "PestControl-CommodityFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_CommodityFamigation() throws InterruptedException {
	
		Assert.assertEquals(ServicesLibrary.selectPC_SF_CommodityFamigation(driver), "Order placed successfully");	
	}
	
	@Test(priority = 61,enabled = true,description = "PestControl-SoilFumigation Service End-To-End Booking")
	public void selectPestControlSpecializedFumigation_SoilFamigation() throws InterruptedException {
	
		Assert.assertEquals(ServicesLibrary.selectPC_SF_SoilFamigation(driver), "Order placed successfully");	
	}
	
	//-----------Green Pest Control--------------//
	
	@Test(priority = 62,enabled = true,description = "PestControl-EcoProducts Service End-To-End Booking")
	public void selectPestControlGreenPestControl_EcoFriedly() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_GPC_EcoFriedly(driver), "Order placed successfully");	
	}
	
	@Test(priority = 63,enabled = true,description = "PestControl-IPM Service End-To-End Booking")
	public void selectPestControlGreenPestControl_IPM() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_GPC_IPM(driver), "Order placed successfully");	
	}
	
	@Test(priority = 64,enabled = true,description = "PestControl-BiologicalControl Service End-To-End Booking")
	public void selectPestControlGreenPestControl_BiologicalControl() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_GPC_BiologicalContro(driver), "Order placed successfully");	
	}
	
	@Test(priority = 65,enabled = true,description = "PestControl-BotanicalPesticides Service End-To-End Booking")
	public void selectPestControlGreenPestControl_BotanicalPesticides() throws InterruptedException {
	
		Assert.assertEquals(ServicesLibrary.selectPC_GPC_BotanicalPesticides(driver), "Order placed successfully");	
	}
	
	//-----------Emergency Pest Control--------------//
	@Test(priority = 66,enabled = true,description = "PestControl-TwentyBySeven Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_AllDayServices() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_EPC_AllDayServices(driver), "Order placed successfully");	
	}
	
	@Test(priority = 67,enabled = true,description = "PestControl-EmergencyResponseTeams Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_ERTeam() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.selectPC_EPC_ERTeam(driver), "Order placed successfully");
	}
	
	@Test(priority = 68,enabled = true,description = "PestControl-UrgentInfestationTreatments Service End-To-End Booking")
	public void selectPestControlEmergencyPestControl_UITtreatment() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.selectPC_EPC_UITtreatment(driver), "Order placed successfully");	
	}
	
	
	@Test(priority = 69,enabled = true,description = "PestControl-ResidentialInterior-All Services End-To-End Booking")
	public void selectPestControlResidentialInterior_AllServices() throws InterruptedException {
		//fail 
		Assert.assertEquals(ServicesLibrary.selectPC_RI_AllServices(driver), "Order placed successfully");	
	}
	
	@Test(priority = 70,enabled = true,description = "PestControl-ResidentialExterior-All Services End-To-End Booking")
	public void selectPestControlResidentialExterior_AllServices() throws InterruptedException {
		//fail
		Assert.assertEquals(ServicesLibrary.selectPC_RE_AllServices(driver), "Order placed successfully");	
	}
	/*----------------------Error Validation-------------------------------*/
	
	@Test(priority = 71,enabled = true, description="Service Not Available In The Cart")// fail
	public void getErrorMesAssertgeForServiceNotAvailabeInCart() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.getErrorMessageOfServiceNotAvailabeInCart(driver), "Oops! No Items In Cart");		
	}
	
	@Test(priority = 72,enabled = true, description= "Timeslot Toaster Error MesAssertge")//pass
	public void getTextTimeSlotToasterMsg() throws InterruptedException {
		Assert.assertEquals(ServicesLibrary.getTextTimeSlotToasterMsg(driver), "Please Select Timeslot");	
	}
	
	////android.view.View[@content-desc"Maximum quantity can be added is 5"]
	@Test(priority = 73,enabled = true, description = "Maximum quantity can be added is 5")//pass
	public void getTextMaximumQuantityAtleast5ToasterMsg() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.getTextMaximumQuantityAtleast5ToasterMsg(driver), "Maximum quantity can be added is 5");
		
	}
	
	@Test(priority = 74,enabled = true,description = "We can't Add Service from Different categories Toaster Error MesAssertge")//pass
	public void getTextAddServiceDifferentCateboryToasterMsg() throws InterruptedException {
		
		Assert.assertEquals(ServicesLibrary.getTextAddServiceDifferentCateboryToasterMsg(driver), "We're Sorry you cant add Services from different Category");
	}
	
	
}
