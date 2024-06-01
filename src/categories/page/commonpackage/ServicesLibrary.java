package commonpackage;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import WaterPurifier.ElectricWaterPurifier;
import WaterPurifier.NonElectricWaterPurifier;
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
import utils.ExtentReportNG;
import vehicle.DeepClean;
import vehicle.OnSpotPuntureRemoval;
import vehicle.WashAtHome;
import waterproofing.FloorOrTerrace;
import waterproofing.Walls;
import Carpentry.NewFurnitureEstimate;
import Carpentry.OldFurnitureRepair;
import Carpentry.PolishWoodenFurniture;
import Cleaning.Bathroom;
import Cleaning.Home;
import Cleaning.Office_Commercial;
import Electronics.AC;
import Electronics.Fridge;
import Electronics.TV;
import Electronics.WashingMachine;
import io.appium.java_client.android.AndroidDriver;
import Painting.CommercialBuilding;
import Painting.Home_Flats;
import Painting.Office;
import Plumbing.Basin_Sink;
import Plumbing.Drain_WastePipe;
import Plumbing.FaucetInstallation;
import Plumbing.Tap_Mixer;
import Plumbing.Toilet;
import Plumbing.WaterStorage;

public class ServicesLibrary  {

	public static AndroidDriver driver;
	public static LightFitting lightFitting;
	public static InverterInstallationAndRepair inverterIAndR;
	public static WiringIssues wiringissues;
	public static FloorOrTerrace floorOrterrace;
	public static Walls walls;
	public static OnSpotPuntureRemoval onSpot;
	public static WashAtHome washathome;
	public static DeepClean deepclean;
	public static ElectricWaterPurifier electricwp;
	public static NonElectricWaterPurifier nonelectricwp;
	public static Commercial commercial;
	public static EmergencyPestControl Emergency;
	public static GreenPestControl greenPestControl;
	public static ResidentialExterior residentialExterior;
	public static ResidentialInterior residentialInterior;
	public static SpecializedBedBug specializedBedBug;
	public static SpecializedFumigation specializedFumigation;
	public static SpecializedInsect specializedInsect;
	public static SpecializedMosquito specializedMosquito;
	public static SpecializedRodent specializedRodent;
	public static SpecializedTermite specializedTermite;
	public static SpecializedWildlife specializedWildlife;
	public static CommonLocators commonlocator;
	public static CommercialBuilding building;
	public static Home_Flats homeflat;
	public static Office office;
	public static Basin_Sink basinsink;
	public static Drain_WastePipe drainpipe;
	public static FaucetInstallation faucet;
	public static Tap_Mixer tapmixer;
	public static Toilet toilet;
	public static WaterStorage waterstorage;
	public static AC ac;
	public static Fridge fridge;
	public static TV tv;
	public static WashingMachine washingmachine;
	public static NewFurnitureEstimate newfurniture;
	public static OldFurnitureRepair oldfurniture;
	public static PolishWoodenFurniture polishfurniture;
	public static Bathroom bathroom;
	public static Home home;
	public static Office_Commercial officecommercial;
	
	public static ExtentReportNG test;

	public static String selectLightFitting_FanInstallation(AndroidDriver driver) throws InterruptedException {
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanInstallation();
		lightFitting.clickOnAddToCartTab();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = lightFitting.getOrderPlacedSuccessfulMsg();
		lightFitting.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectLightFitting_FanRepair(AndroidDriver driver) throws InterruptedException {
		lightFitting = new LightFitting(driver);
		electricwp = new ElectricWaterPurifier(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanRepair();
		lightFitting.clickOnAddToCartTab();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = lightFitting.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		lightFitting.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectLightFitting_FanUninstallation(AndroidDriver driver) throws InterruptedException {
		lightFitting = new LightFitting(driver);
		electricwp = new ElectricWaterPurifier(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnFanUninstallation();
		lightFitting.clickOnAddToCartTab();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = lightFitting.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		lightFitting.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectLightFitting_CeilingLampsInstallation(AndroidDriver driver) throws InterruptedException {
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		
		lightFitting.clickOnCeilingLampsInstallation();
		lightFitting.clickOnAddToCartTab();
		Thread.sleep(2000);
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		Thread.sleep(2000);
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = lightFitting.getOrderPlacedSuccessfulMsg();
		lightFitting.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectLightFitting_CeilingLampsUninstallation(AndroidDriver driver)
			throws InterruptedException {
		lightFitting = new LightFitting(driver);
		electricwp = new ElectricWaterPurifier(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		lightFitting.clickOnCeilingLampsUninstallation();
		lightFitting.clickOnAddToCartTab();
		Thread.sleep(2000);
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectLightFitting_ConsultationChargesAndQuotation(AndroidDriver driver)
			throws InterruptedException {
		lightFitting = new LightFitting(driver);
		lightFitting.clickOnElectricals();
		lightFitting.clickOnLightFitting();
		Thread.sleep(2000);
		//lightFitting.scrollableElement();
		//Thread.sleep(2000);
		lightFitting.clickOnConsultaionChargesAndThenQuotation();
		lightFitting.clickOnAddToCartTab();
		//lightFitting.clickOnBookNow();
		Thread.sleep(2000);
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnSelectDate();
		lightFitting.clickOnSelectTime();
		lightFitting.clickOnProcedButton();
		lightFitting.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = lightFitting.getOrderPlacedSuccessfulMsg();
		lightFitting.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectInverterInstallationAndRepair_ConsultationChargesAndQuotation(AndroidDriver driver)
			throws InterruptedException {
		inverterIAndR = new InverterInstallationAndRepair(driver);
		inverterIAndR.clickOnElectricals();
		inverterIAndR.clickOnInverterInstallationAndRepair();
		inverterIAndR.clickOnAddButton();
		inverterIAndR.clickOnAddToCartTab();
		inverterIAndR.clickOnProceedButton();
		inverterIAndR.clickOnSelectDate();
		inverterIAndR.clickOnSelectTime();
		inverterIAndR.clickOnProceedButton();
		inverterIAndR.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = inverterIAndR.getOrderPlacedSuccessfulMsg();
		inverterIAndR.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWiringIssues_NewPoints(AndroidDriver driver) throws InterruptedException {
		wiringissues = new WiringIssues(driver);
		wiringissues.clickOnElectricals();
		wiringissues.clickOnWiringIssues();
		wiringissues.clickOnAddBtn();
		wiringissues.clickOnAddToCartTab();
		Thread.sleep(2000);
		wiringissues.clickOnProceedButton();
		wiringissues.clickOnSelectDate();
		wiringissues.clickOnSelectTime();
		wiringissues.clickOnProceedButton();
		wiringissues.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = wiringissues.getOrderPlacedSuccessfulMsg();
		wiringissues.clickOnContinueBookingBtn();
		return successBookingMessage;

	}

	public static String selectWaterproofing_FloorOrTerrace(AndroidDriver driver) throws InterruptedException {
		floorOrterrace = new FloorOrTerrace(driver);
		floorOrterrace.clickOnWaterproofing();
		floorOrterrace.clickOnFloorOrTerrace();
		floorOrterrace.clickOnAddBtn();
		floorOrterrace.clickOnAddToCartTab();
		Thread.sleep(2000);
		floorOrterrace.clickOnProceedButton();
		floorOrterrace.clickOnSelectDate();
		floorOrterrace.clickOnSelectTime();
		floorOrterrace.clickOnProceedButton();
		floorOrterrace.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = floorOrterrace.getOrderPlacedSuccessfulMsg();
		floorOrterrace.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWalls_ConsultationChargesAndQuotation(AndroidDriver driver) throws InterruptedException {
		walls = new Walls(driver);
		Thread.sleep(2000);	
		walls.clickOnWaterproofing();
		walls.clickOnWalls();
		walls.clickOnConsultationChargesAndThenQuotation();
		Thread.sleep(2000);
		walls.clickOnAddToCartTabb();
		walls.clickOnProcedButton();
		walls.clickOnSelectDate();
		walls.clickOnSelectTime();
		walls.clickOnProcedButton();
		walls.clickOnProcedButton();
		Thread.sleep(2000);
		String successBookingMessage = walls.getOrderPlacedSuccessfulMsg();
		walls.clickOnContinueBookingBtn();
		return successBookingMessage;

	}

	public static String selectOnspotPunctureRemoval_Tube(AndroidDriver driver) throws InterruptedException {
		onSpot = new OnSpotPuntureRemoval(driver);
		onSpot.clickOnVehicle();
		onSpot.clickOnSpotPunctureRemoval();
		onSpot.clickOnTube();
		onSpot.clickOnAddToCartTab();
		Thread.sleep(2000);
		onSpot.clickOnProceedButton();
		onSpot.clickOnSelectDate();
		onSpot.clickOnSelectTime();
		onSpot.clickOnProceedButton();
		onSpot.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = onSpot.getOrderPlacedSuccessfulMsg();
		onSpot.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectOnspotPunctureRemoval_Tubeless(AndroidDriver driver) throws InterruptedException {
		onSpot = new OnSpotPuntureRemoval(driver);
		onSpot.clickOnVehicle();
		onSpot.clickOnSpotPunctureRemoval();
		onSpot.clickOnTubeless();
		onSpot.clickOnAddToCartTab();
		Thread.sleep(2000);
		onSpot.clickOnProceedButton();
		onSpot.clickOnSelectDate();
		onSpot.clickOnSelectTime();
		onSpot.clickOnProceedButton();
		onSpot.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = onSpot.getOrderPlacedSuccessfulMsg();
		onSpot.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWashAtHome_SUV(AndroidDriver driver) throws InterruptedException {
		washathome = new WashAtHome(driver);
		washathome.clickOnVehicle();
		washathome.clickOnWashAtHome();
		washathome.clickOnSUV();
		washathome.clickOnAddToCartTab();
		Thread.sleep(2000);
		washathome.clickOnProceedButton();
		washathome.clickOnSelectDate();
		washathome.clickOnSelectTime();
		washathome.clickOnProceedButton();
		washathome.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = washathome.getOrderPlacedSuccessfulMsg();
		washathome.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWashAtHome_Hatchback(AndroidDriver driver) throws InterruptedException {
		washathome = new WashAtHome(driver);
		washathome.clickOnVehicle();
		washathome.clickOnWashAtHome();
		washathome.clickOnHatchback();
		washathome.clickOnAddToCartTab();
		Thread.sleep(2000);
		washathome.clickOnProceedButton();
		washathome.clickOnSelectDate();
		washathome.clickOnSelectTime();
		washathome.clickOnProceedButton();
		washathome.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = washathome.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		washathome.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWashAtHome_Sedan(AndroidDriver driver) throws InterruptedException {
		washathome = new WashAtHome(driver);
		washathome.clickOnVehicle();
		washathome.clickOnWashAtHome();
		washathome.clickOnSedan();
		washathome.clickOnAddToCartTab();
		Thread.sleep(2000);
		washathome.clickOnProceedButton();
		washathome.clickOnSelectDate();
		washathome.clickOnSelectTime();
		washathome.clickOnProceedButton();
		washathome.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = washathome.getOrderPlacedSuccessfulMsg();
		washathome.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectWashAtHome_HeavyDuty(AndroidDriver driver) throws InterruptedException {
		washathome = new WashAtHome(driver);
		washathome.clickOnVehicle();
		washathome.clickOnWashAtHome();
		washathome.clickOnHeavyDuty();
		washathome.clickOnAddToCartTab();
		Thread.sleep(2000);
		washathome.clickOnProceedButton();
		washathome.clickOnSelectDate();
		washathome.clickOnSelectTime();
		washathome.clickOnProceedButton();
		washathome.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = washathome.getOrderPlacedSuccessfulMsg();
		washathome.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectDeepClean_SUV(AndroidDriver driver) throws InterruptedException {
		deepclean = new DeepClean(driver);
		deepclean.clickOnVehicle();
		deepclean.clickOnDeepClean();
		deepclean.clickOnSUV();
		deepclean.clickOnAddToCartTab();
		Thread.sleep(2000);
		deepclean.clickOnProceedButton();
		deepclean.clickOnSelectDate();
		deepclean.clickOnSelectTime();
		deepclean.clickOnProceedButton();
		deepclean.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = deepclean.getOrderPlacedSuccessfulMsg();
		deepclean.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectDeepClean_Hatchback(AndroidDriver driver) throws InterruptedException {
		deepclean = new DeepClean(driver);
		deepclean.clickOnVehicle();
		deepclean.clickOnDeepClean();
		deepclean.clickOnHatchback();
		deepclean.clickOnAddToCartTab();
		Thread.sleep(2000);
		deepclean.clickOnProceedButton();
		deepclean.clickOnSelectDate();
		deepclean.clickOnSelectTime();
		deepclean.clickOnProceedButton();
		deepclean.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = deepclean.getOrderPlacedSuccessfulMsg();
		deepclean.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectDeepClean_Sedan(AndroidDriver driver) throws InterruptedException {
		deepclean = new DeepClean(driver);
		deepclean.clickOnVehicle();
		deepclean.clickOnDeepClean();
		deepclean.clickOnSedan();
		deepclean.clickOnAddToCartTab();
		Thread.sleep(2000);
		deepclean.clickOnProceedButton();
		deepclean.clickOnSelectDate();
		deepclean.clickOnSelectTime();
		deepclean.clickOnProceedButton();
		deepclean.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = deepclean.getOrderPlacedSuccessfulMsg();
		deepclean.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectDeepClean_HeavyDuty(AndroidDriver driver) throws InterruptedException {
		deepclean = new DeepClean(driver);
		deepclean.clickOnVehicle();
		deepclean.clickOnDeepClean();
		deepclean.clickOnHeavyDuty();
		deepclean.clickOnAddToCartTab();
		Thread.sleep(2000);
		deepclean.clickOnProceedButton();
		deepclean.clickOnSelectDate();
		deepclean.clickOnSelectTime();
		deepclean.clickOnProceedButton();
		deepclean.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = deepclean.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		deepclean.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectElectricWaterPurifier_AnnualFilterService(AndroidDriver driver)
			throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnAnnualFilterService();
		electricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		electricwp.clickOnProceedButton();
		electricwp.clickOnSelectDate();
		electricwp.clickOnSelectTime();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static List<String> selectElectricWaterPurifier_Repair(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnRepair();
		String addedServiceCartMsg = electricwp.getTextAddedServiceToCart();
		electricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		electricwp.clickOnProceedButton();
		electricwp.clickOnSelectDate();
		electricwp.clickOnSelectTime();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		List<String> messages = new ArrayList<>();
		messages.add(addedServiceCartMsg);
		messages.add(successBookingMessage);
		return messages;
		//return successBookingMessage;

	}

	public static String selectElectricWaterPurifier_InstallExtraPurifierFilterAndCable(AndroidDriver driver)
			throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnInstallExtraPurifierFilterAndCable();
		electricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		electricwp.clickOnProceedButton();
		electricwp.clickOnSelectDate();
		electricwp.clickOnSelectTime();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectElectricWaterPurifier_StorageCleaning(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnStorageCleaningStorage();
		electricwp.clickOnAddToCartTab();
		electricwp.clickOnProceedButton();
		electricwp.clickOnSelectDate();
		electricwp.clickOnSelectTime();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectElectricWaterPurifier_TabLeaking(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnTabLeaking();
		electricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		electricwp.clickOnProceedButton();
		electricwp.clickOnSelectDate();
		electricwp.clickOnSelectTime();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = electricwp.getOrderPlacedSuccessfulMsg();
		electricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectNonElectricWaterPurifier_FilterChange(AndroidDriver driver) throws InterruptedException {
		nonelectricwp = new NonElectricWaterPurifier(driver);
		nonelectricwp.clickOnWaterPurifier();
		nonelectricwp.clickOnNonElectricWaterPurifier();
		nonelectricwp.clickOnFilterChangeService();
		nonelectricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnSelectDate();
		nonelectricwp.clickOnSelectTime();
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = nonelectricwp.getOrderPlacedSuccessfulMsg();
		nonelectricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectNonElectricWaterPurifier_TapLeakage(AndroidDriver driver) throws InterruptedException {
		nonelectricwp = new NonElectricWaterPurifier(driver);
		nonelectricwp.clickOnWaterPurifier();
		nonelectricwp.clickOnNonElectricWaterPurifier();
		nonelectricwp.clickOnTapLeakageService();
		nonelectricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnSelectDate();
		nonelectricwp.clickOnSelectTime();
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = nonelectricwp.getOrderPlacedSuccessfulMsg();
		nonelectricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectNonElectricWaterPurifier_CandleChange(AndroidDriver driver) throws InterruptedException {
		nonelectricwp = new NonElectricWaterPurifier(driver);
		nonelectricwp.clickOnWaterPurifier();
		nonelectricwp.clickOnNonElectricWaterPurifier();
		nonelectricwp.clickOnCandleChangeService();
		nonelectricwp.clickOnAddToCartTab();
		Thread.sleep(2000);
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnSelectDate();
		nonelectricwp.clickOnSelectTime();
		nonelectricwp.clickOnProceedButton();
		nonelectricwp.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = nonelectricwp.getOrderPlacedSuccessfulMsg();
		nonelectricwp.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_Offices(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnOfficesService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_Restaurants(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnRestaurantsService();
		commercial.clickOnAddToCartTab();
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_Hotels(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnHotelsService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_FoodProcessingPlants(AndroidDriver driver)
			throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnFoodProcessingPlantsService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_Warehouses(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnWarehousesService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_RetailStores(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnRetailStoresService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_HealthCare(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnHealthcareFacilitiesService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlCommercial_Educational(AndroidDriver driver) throws InterruptedException {
		commercial = new Commercial(driver);
		commercial.clickOnPestControl();
		commercial.clickOnCommercial();
		commercial.clickOnEducationalFacilitiesService();
		commercial.clickOnAddToCartTab();
		Thread.sleep(2000);
		commercial.clickOnProceedButton();
		commercial.clickOnSelectDate();
		commercial.clickOnSelectTime();
		commercial.clickOnProceedButton();
		commercial.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = commercial.getOrderPlacedSuccessfulMsg();
		commercial.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPestControlSpecializedTermite_Inspection(AndroidDriver driver)
			throws InterruptedException {
		specializedTermite = new SpecializedTermite(driver);
		specializedTermite.clickOnPestControl();
		specializedTermite.clickOnSpecializedTermite();
		specializedTermite.clickOnInspectionService();
		specializedTermite.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnSelectDate();
		specializedTermite.clickOnSelectTime();
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedTermite.getOrderPlacedSuccessfulMsg();
		specializedTermite.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_ST_PreTreatment(AndroidDriver driver) throws InterruptedException {
		specializedTermite = new SpecializedTermite(driver);
		specializedTermite.clickOnPestControl();
		specializedTermite.clickOnSpecializedTermite();
		specializedTermite.clickOnPreContructionTreatmentService();
		specializedTermite.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnSelectDate();
		specializedTermite.clickOnSelectTime();
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedTermite.getOrderPlacedSuccessfulMsg();
		specializedTermite.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_ST_PostTreatment(AndroidDriver driver) throws InterruptedException {
		specializedTermite = new SpecializedTermite(driver);
		specializedTermite.clickOnPestControl();
		specializedTermite.clickOnSpecializedTermite();
		specializedTermite.clickOnPostConstructionTreatmentService();
		specializedTermite.clickOnAddToCartTab();
		Thread.sleep(2000);
		
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnSelectDate();
		specializedTermite.clickOnSelectTime();
		specializedTermite.clickOnProceedButton();
		specializedTermite.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedTermite.getOrderPlacedSuccessfulMsg();
		specializedTermite.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SBB_MattressEncasements(AndroidDriver driver) throws InterruptedException {
		specializedBedBug = new SpecializedBedBug(driver);

		specializedBedBug.clickOnPestControl();
		specializedBedBug.clickOnSpecializedBedBug();
		specializedBedBug.clickOnMattressEncasementsService();
		specializedBedBug.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedBedBug.clickOnProceedButton();
		specializedBedBug.clickOnSelectDate();
		specializedBedBug.clickOnSelectTime();
		specializedBedBug.clickOnProceedButton();
		specializedBedBug.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedBedBug.getOrderPlacedSuccessfulMsg();
		specializedBedBug.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SBB_FurnitureTreatment(AndroidDriver driver) throws InterruptedException {
		specializedBedBug = new SpecializedBedBug(driver);

		specializedBedBug.clickOnPestControl();
		specializedBedBug.clickOnSpecializedBedBug();
		specializedBedBug.clickOnFurnitureTreatmentService();
		specializedBedBug.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedBedBug.clickOnProceedButton();
		specializedBedBug.clickOnSelectDate();
		specializedBedBug.clickOnSelectTime();
		specializedBedBug.clickOnProceedButton();
		specializedBedBug.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedBedBug.getOrderPlacedSuccessfulMsg();
		specializedBedBug.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SR_Mice(AndroidDriver driver) throws InterruptedException {
		specializedRodent = new SpecializedRodent(driver);
		specializedRodent.clickOnPestControl();
		specializedRodent.clickOnSpecializedRodent();
		specializedRodent.clickOnMiceService();
		specializedRodent.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnSelectDate();
		specializedRodent.clickOnSelectTime();
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedRodent.getOrderPlacedSuccessfulMsg();
		specializedRodent.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SR_Rats(AndroidDriver driver) throws InterruptedException {
		specializedRodent = new SpecializedRodent(driver);
		specializedRodent.clickOnPestControl();
		specializedRodent.clickOnSpecializedRodent();
		specializedRodent.clickOnRatsService();
		specializedRodent.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnSelectDate();
		specializedRodent.clickOnSelectTime();
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedRodent.getOrderPlacedSuccessfulMsg();
		specializedRodent.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SR_Squirrels(AndroidDriver driver) throws InterruptedException {
		specializedRodent = new SpecializedRodent(driver);

		specializedRodent.clickOnPestControl();
		specializedRodent.clickOnSpecializedRodent();
		specializedRodent.clickOnSquirelsService();
		specializedRodent.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnSelectDate();
		specializedRodent.clickOnSelectTime();
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedRodent.getOrderPlacedSuccessfulMsg();
		specializedRodent.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SR_OtherRodents(AndroidDriver driver) throws InterruptedException {
		specializedRodent = new SpecializedRodent(driver);

		specializedRodent.clickOnPestControl();
		specializedRodent.clickOnSpecializedRodent();
		specializedRodent.clickOnOtherRodentsService();
		specializedRodent.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnSelectDate();
		specializedRodent.clickOnSelectTime();
		specializedRodent.clickOnProceedButton();
		specializedRodent.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedRodent.getOrderPlacedSuccessfulMsg();
		specializedRodent.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SWL_Birds(AndroidDriver driver) throws InterruptedException {
		specializedWildlife = new SpecializedWildlife(driver);

		specializedWildlife.clickOnPestControl();
		specializedWildlife.clickOnSpecializedWildlife();
		specializedWildlife.clickOnBirdsService();
		specializedWildlife.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnSelectDate();
		specializedWildlife.clickOnSelectTime();
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedWildlife.getOrderPlacedSuccessfulMsg();
		specializedWildlife.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SWL_Bats(AndroidDriver driver) throws InterruptedException {
		specializedWildlife = new SpecializedWildlife(driver);

		specializedWildlife.clickOnPestControl();
		specializedWildlife.clickOnSpecializedWildlife();
		specializedWildlife.clickOnBatsService();
		specializedWildlife.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnSelectDate();
		specializedWildlife.clickOnSelectTime();
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedWildlife.getOrderPlacedSuccessfulMsg();
		specializedWildlife.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SWL_Skunks(AndroidDriver driver) throws InterruptedException {
		specializedWildlife = new SpecializedWildlife(driver);

		specializedWildlife.clickOnPestControl();
		specializedWildlife.clickOnSpecializedWildlife();
		specializedWildlife.clickOnSkunksService();
		specializedWildlife.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnSelectDate();
		specializedWildlife.clickOnSelectTime();
		specializedWildlife.clickOnProceedButton();
		specializedWildlife.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedWildlife.getOrderPlacedSuccessfulMsg();
		specializedWildlife.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SM_Spraying(AndroidDriver driver) throws InterruptedException {
		specializedMosquito = new SpecializedMosquito(driver);

		specializedMosquito.clickOnPestControl();
		specializedMosquito.clickOnSpecializedMosquito();
		specializedMosquito.clickOnSprayingService();
		specializedMosquito.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnSelectDate();
		specializedMosquito.clickOnSelectTime();
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedMosquito.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedMosquito.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SM_Fogging(AndroidDriver driver) throws InterruptedException {
		specializedMosquito = new SpecializedMosquito(driver);

		specializedMosquito.clickOnPestControl();
		specializedMosquito.clickOnSpecializedMosquito();
		specializedMosquito.clickOnFoggingService();
		specializedMosquito.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnSelectDate();
		specializedMosquito.clickOnSelectTime();
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedMosquito.getOrderPlacedSuccessfulMsg();
		specializedMosquito.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SM_Larvicide(AndroidDriver driver) throws InterruptedException {
		specializedMosquito = new SpecializedMosquito(driver);
		specializedMosquito.clickOnPestControl();
		specializedMosquito.clickOnSpecializedMosquito();
		specializedMosquito.clickOnLarvicideTreatmentsService();
		specializedMosquito.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnSelectDate();
		specializedMosquito.clickOnSelectTime();
		specializedMosquito.clickOnProceedButton();
		specializedMosquito.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedMosquito.getOrderPlacedSuccessfulMsg();
		specializedMosquito.clickOnContinueBookingBtn();
		return successBookingMessage;
	}

	public static String selectPC_SI_Ants(AndroidDriver driver) throws InterruptedException {
		specializedInsect = new SpecializedInsect(driver);
		specializedInsect.clickOnPestControl();
		specializedInsect.clickOnSpecializedInsect();
		specializedInsect.clickOnAntsService();
		specializedInsect.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnSelectDate();
		specializedInsect.clickOnSelectTime();
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedInsect.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedInsect.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SI_Cockroaches(AndroidDriver driver) throws InterruptedException {
		specializedInsect = new SpecializedInsect(driver);
		specializedInsect.clickOnPestControl();
		specializedInsect.clickOnSpecializedInsect();
		specializedInsect.clickOnCockroachesService();
		specializedInsect.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnSelectDate();
		specializedInsect.clickOnSelectTime();
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedInsect.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedInsect.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SI_Flies(AndroidDriver driver) throws InterruptedException {
		specializedInsect = new SpecializedInsect(driver);
		specializedInsect.clickOnPestControl();
		specializedInsect.clickOnSpecializedInsect();
		specializedInsect.clickOnFliesService();
		specializedInsect.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnSelectDate();
		specializedInsect.clickOnSelectTime();
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedInsect.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedInsect.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SI_Spiders(AndroidDriver driver) throws InterruptedException {
		specializedInsect = new SpecializedInsect(driver);
		specializedInsect.clickOnPestControl();
		specializedInsect.clickOnSpecializedInsect();
		specializedInsect.clickOnSpidersService();
		specializedInsect.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnSelectDate();
		specializedInsect.clickOnSelectTime();
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedInsect.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedInsect.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SI_OtherInsects(AndroidDriver driver) throws InterruptedException {
		specializedInsect = new SpecializedInsect(driver);
		specializedInsect.clickOnPestControl();
		specializedInsect.clickOnSpecializedInsect();
		specializedInsect.clickOnOtherInsectsService();
		specializedInsect.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnSelectDate();
		specializedInsect.clickOnSelectTime();
		specializedInsect.clickOnProceedButton();
		specializedInsect.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedInsect.getOrderPlacedSuccessfulMsg();
		System.out.println("------------------" + successBookingMessage + "--------------------");
		specializedInsect.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_SF_structuralFamigation(AndroidDriver driver) throws InterruptedException {
		specializedFumigation = new SpecializedFumigation(driver);
		specializedFumigation.clickOnPestControl();
		specializedFumigation.clickOnSpecializedFumigation();
		specializedFumigation.clickOnStructuralFumigationService();
		specializedFumigation.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnSelectDate();
		specializedFumigation.clickOnSelectTime();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedFumigation.getOrderPlacedSuccessfulMsg(); 
		specializedFumigation.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_SF_ContainerFamigation(AndroidDriver driver) throws InterruptedException {
		specializedFumigation = new SpecializedFumigation(driver);
		specializedFumigation.clickOnPestControl();
		specializedFumigation.clickOnSpecializedFumigation();
		specializedFumigation.clickOnContainerFumigationService();
		specializedFumigation.clickOnAddToCartTab();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnSelectDate();
		specializedFumigation.clickOnSelectTime();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedFumigation.getOrderPlacedSuccessfulMsg(); 
		specializedFumigation.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	public static String selectPC_SF_CommodityFamigation(AndroidDriver driver) throws InterruptedException {
		specializedFumigation = new SpecializedFumigation(driver);
		specializedFumigation.clickOnPestControl();
		specializedFumigation.clickOnSpecializedFumigation();
		specializedFumigation.clickOnCommodityFumigationService();
		specializedFumigation.clickOnAddToCartTab();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnSelectDate();
		specializedFumigation.clickOnSelectTime();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedFumigation.getOrderPlacedSuccessfulMsg(); 
		specializedFumigation.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_SF_SoilFamigation(AndroidDriver driver) throws InterruptedException {
		specializedFumigation = new SpecializedFumigation(driver);
		specializedFumigation.clickOnPestControl();
		specializedFumigation.clickOnSpecializedFumigation();
		specializedFumigation.clickOnSoilFumigationService();
		specializedFumigation.clickOnAddToCartTab();
		Thread.sleep(2000);
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnSelectDate();
		specializedFumigation.clickOnSelectTime();
		specializedFumigation.clickOnProceedButton();
		specializedFumigation.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = specializedFumigation.getOrderPlacedSuccessfulMsg(); 
		specializedFumigation.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_GPC_EcoFriedly(AndroidDriver driver) throws InterruptedException {
		greenPestControl = new GreenPestControl(driver);
		
		greenPestControl.clickOnPestControl();
		greenPestControl.clickOnGreenPestControl();
		greenPestControl.clickOnEcoProductsService();
		greenPestControl.clickOnAddToCartTab();
		Thread.sleep(2000);
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnSelectDate();
		greenPestControl.clickOnSelectTime();
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = greenPestControl.getOrderPlacedSuccessfulMsg(); 
		greenPestControl.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_GPC_IPM(AndroidDriver driver) throws InterruptedException {
		greenPestControl = new GreenPestControl(driver);
		
		greenPestControl.clickOnPestControl();
		greenPestControl.clickOnGreenPestControl();
		greenPestControl.clickOnIPMService();
		greenPestControl.clickOnAddToCartTab();
		Thread.sleep(2000);
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnSelectDate();
		greenPestControl.clickOnSelectTime();
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = greenPestControl.getOrderPlacedSuccessfulMsg(); 
		greenPestControl.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_GPC_BiologicalContro(AndroidDriver driver) throws InterruptedException {
		greenPestControl = new GreenPestControl(driver);
		
		greenPestControl.clickOnPestControl();
		greenPestControl.clickOnGreenPestControl();
		greenPestControl.clickOnBiologicalControlService();
		greenPestControl.clickOnAddToCartTab();
		Thread.sleep(2000);
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnSelectDate();
		greenPestControl.clickOnSelectTime();
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = greenPestControl.getOrderPlacedSuccessfulMsg(); 
		greenPestControl.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_GPC_BotanicalPesticides(AndroidDriver driver) throws InterruptedException {
		greenPestControl = new GreenPestControl(driver);
		
		greenPestControl.clickOnPestControl();
		greenPestControl.clickOnGreenPestControl();
		greenPestControl.clickOnBotanicalPesticidesService();
		greenPestControl.clickOnAddToCartTab();
		Thread.sleep(2000);
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnSelectDate();
		greenPestControl.clickOnSelectTime();
		greenPestControl.clickOnProceedButton();
		greenPestControl.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = greenPestControl.getOrderPlacedSuccessfulMsg(); 
		greenPestControl.clickOnContinueBookingBtn();
		return successBookingMessage;
	}
	
	public static String selectPC_EPC_AllDayServices(AndroidDriver driver) throws InterruptedException {
		Emergency = new EmergencyPestControl(driver);
		
		Emergency.clickOnPestControl();
		Emergency.clickOnEmergencyPestControl();
		Emergency.clickOnTweentyBySevenService();
		Emergency.clickOnAddToCartTab();
		Thread.sleep(2000);
		Emergency.clickOnProceedButton();
		Emergency.clickOnSelectDate();
		Emergency.clickOnSelectTime();
		Emergency.clickOnProceedButton();
		Emergency.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = Emergency.getOrderPlacedSuccessfulMsg(); 
		Emergency.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_EPC_ERTeam(AndroidDriver driver) throws InterruptedException {
		Emergency = new EmergencyPestControl(driver);
		
		Emergency.clickOnPestControl();
		Emergency.clickOnEmergencyPestControl();
		Emergency.clickOnEmergencyResponseTeamsService();
		Emergency.clickOnAddToCartTab();
		Thread.sleep(2000);
		Emergency.clickOnProceedButton();
		Emergency.clickOnSelectDate();
		Emergency.clickOnSelectTime();
		Emergency.clickOnProceedButton();
		Emergency.clickOnProceedButton();
		Thread.sleep(2000);
		String successBookingMessage = Emergency.getOrderPlacedSuccessfulMsg(); 
		Emergency.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_EPC_UITtreatment(AndroidDriver driver) throws InterruptedException {
		Emergency = new EmergencyPestControl(driver);
		
		Emergency.clickOnPestControl();
		Emergency.clickOnEmergencyPestControl();
		Emergency.clickOnUrgentInfestationTreatmentsService();
		Emergency.clickOnAddToCartTab();
		Thread.sleep(2000);
		Emergency.clickOnProceedButton();
		Emergency.clickOnSelectDate();
		Emergency.clickOnSelectTime();
		Emergency.clickOnProceedButton();
		Emergency.clickOnProceedButton();
		String successBookingMessage = Emergency.getOrderPlacedSuccessfulMsg(); 
		Emergency.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	public static String selectPC_RI_AllServices(AndroidDriver driver) throws InterruptedException {
		residentialInterior = new ResidentialInterior(driver);
		residentialInterior.clickOnPestControl();
		residentialInterior.clickOnResidentialInterior();
		residentialInterior.clickOnKitchenService();
		residentialInterior.clickOnBathroomService();
		Thread.sleep(3000);
		residentialInterior.clickOnBedroomService();
		residentialInterior.clickOnLivingRoomService();
		residentialInterior.clickOnDiningRoomService();
		residentialInterior.clickOnBasementService();
		Thread.sleep(2000);
		residentialInterior.clickOnAtticService();
		residentialInterior.clickOnAddToCartTab();
		Thread.sleep(15000);
		residentialInterior.clickOnProceedButton();
		residentialInterior.clickOnSelectDate();
		residentialInterior.clickOnSelectTime();
		residentialInterior.clickOnProceedButton();
		residentialInterior.clickOnProceedButton();
		String successBookingMessage = residentialInterior.getOrderPlacedSuccessfulMsg(); 
		residentialInterior.clickOnContinueBookingBtn();
		return successBookingMessage;	
	}
	
	
	public static String selectPC_RE_AllServices(AndroidDriver driver) throws InterruptedException {
		residentialExterior = new ResidentialExterior(driver);
		residentialExterior.clickOnPestControl();
		residentialExterior.clickOnResidentialExterior();
		residentialExterior.clickOnYardService();
		residentialExterior.clickOnGardenService();
		Thread.sleep(3000);
		residentialExterior.clickOnPatioOrDeckService();
		residentialExterior.clickOnGarageService();
		Thread.sleep(2000);
		residentialExterior.clickOnFenceService();
		residentialExterior.clickOnAddToCartTab();
		Thread.sleep(6000);
		residentialExterior.clickOnProceedButton();
		residentialExterior.clickOnSelectDate();
		residentialExterior.clickOnSelectTime();
		residentialExterior.clickOnProceedButton();
		Thread.sleep(3000);
		residentialExterior.clickOnProceedButton();
		String successBookingMessage = residentialExterior.getOrderPlacedSuccessfulMsg(); 
		residentialExterior.clickOnContinueBookingBtn();
		return successBookingMessage;
	
	
	}
	
	public static String getErrorMessageOfServiceNotAvailabeInCart(AndroidDriver driver) throws InterruptedException {
		wiringissues = new WiringIssues(driver);
		wiringissues.clickOnElectricals();
		wiringissues.clickOnWiringIssues();
		wiringissues.clickOnAddToCartTab();
		String serviceCartMsg = wiringissues.getTextNoServiceInCartMsg();
		wiringissues.clickOnHomeTab();
		return  serviceCartMsg;
	}
	
	public static String getTextTimeSlotToasterMsg(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnRepair();
		electricwp.clickOnAddToCartTab();
		electricwp.clickOnProceedButton();
		electricwp.clickOnProceedButton();
		String timeslottoastermsg =  electricwp.getTextSelectTimeSlotToasterMsg();
		electricwp.clickOnHomeTab();
		return timeslottoastermsg;
		
	}
	
	public static String  getTextMaximumQuantityAtleast5ToasterMsg(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnRepair();
		electricwp.ClickOnPlusButton();

		String maximumquantitycanbe_5 =electricwp.getMaximumQuantityAtleast5ToasterMsg();
		electricwp.clickOnHomeTab();
		return maximumquantitycanbe_5;
		
	}
	
	public static String getTextAddServiceDifferentCateboryToasterMsg(AndroidDriver driver) throws InterruptedException {
		electricwp = new ElectricWaterPurifier(driver);
		onSpot = new OnSpotPuntureRemoval(driver);
		electricwp.clickOnWaterPurifier();
		electricwp.clickOnElectricWaterPurifier();
		electricwp.clickOnRepair();
		electricwp.clickOnHomeTab();
		onSpot.clickOnVehicle();
		onSpot.clickOnSpotPunctureRemoval();
		onSpot.clickOnTube();

		String servicecantadd_diffcategories_toastermsg = onSpot.getTextServiceCantAddDiffCategoriesMsg();
		electricwp.clickOnHomeTab();
		return servicecantadd_diffcategories_toastermsg;
		
	}
	
	public static Home_Flats HomeFlats1to4bhk(AndroidDriver driver) throws InterruptedException {
		try {
			homeflat = new Home_Flats(driver);
			commonlocator = new CommonLocators(driver);
			homeflat.clickCustomerPaintingOption();
			homeflat.clickCustomerHomeFlatsOption();
			homeflat.clickCustomerHomeFlats1to4bhkOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return homeflat;
	}

	public static Home_Flats HomeFlatsConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			homeflat = new Home_Flats(driver);
			commonlocator = new CommonLocators(driver);
			homeflat.clickCustomerPaintingOption();
			homeflat.clickCustomerHomeFlatsOption();
			homeflat.clickCustomerHomeFlatsConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);
			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return homeflat;
	}

	public static CommercialBuilding CommercialApartment11floor(AndroidDriver driver) throws InterruptedException {
		try {
			building = new CommercialBuilding(driver);
			commonlocator = new CommonLocators(driver);
			// commonlocator.clickHometab();
			building.clickCustomerPaintingOption();
			building.clickCustomerCommercialBuildingOption();
			building.clickCustomerCommercialApartment11floorOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return building;
	}

	public static CommercialBuilding CommercialBuildingConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			building = new CommercialBuilding(driver);
			commonlocator = new CommonLocators(driver);
			building.clickCustomerPaintingOption();
			building.clickCustomerCommercialBuildingOption();
			building.clickCustomerCommercialBuildingConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return building;
	}

	public static Office Officelessthan5k(AndroidDriver driver) throws InterruptedException {
		try {
			commonlocator = new CommonLocators(driver);
			office = new Office(driver);
			office.clickCustomerPaintingOption();
			office.clickCustomerOfficeOption();
			office.clickCustomerOfficelessthan5kOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return office;
	}

	public static Office OfficeConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			commonlocator = new CommonLocators(driver);
			office = new Office(driver);
			office.clickCustomerPaintingOption();
			office.clickCustomerOfficeOption();
			office.clickCustomerOfficeConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return office;
	}

	public static FaucetInstallation FaucetInstallationJetSprayInstall(AndroidDriver driver)
			throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationJetSprayInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationShowerHeadInstall(AndroidDriver driver)
			throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationShowerHeadInstallOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationTapsInstall(AndroidDriver driver) throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationTapsInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationMixerInstall(AndroidDriver driver) throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationMixerInstallOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationjetSprayRepair(AndroidDriver driver)
			throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationjetSprayRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationShowerHeadRepair(AndroidDriver driver)
			throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();

			faucet.clickCustomerFaucetInstallationShowerHeadRepairOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationTapsRepair(AndroidDriver driver) throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();
			faucet.clickCustomerFaucetInstallationTapsRepairOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static FaucetInstallation FaucetInstallationMixerRepair(AndroidDriver driver) throws InterruptedException {
		try {
			faucet = new FaucetInstallation(driver);
			commonlocator = new CommonLocators(driver);
			faucet.clickCustomerPlumbingOption();
			faucet.clickCustomerFaucetInstallationOption();

			faucet.clickCustomerFaucetInstallationMixerRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return faucet;
	}

	public static Tap_Mixer TapandMixerTapInstall(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();

			tapmixer.clickCustomerTapandMixerTapInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerMixerInstall(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerMixerInstallOption();
			// commonlocator.clickBookNowtab();// clickCarttab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerTapsRepair(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerTapsRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (

		InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerMixerRepair(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerMixerRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerTapsUninstall(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerTapsUninstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerMixerUninstall(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerMixerUninstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Tap_Mixer TapandMixerConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			tapmixer = new Tap_Mixer(driver);
			commonlocator = new CommonLocators(driver);
			tapmixer.clickCustomerPlumbingOption();
			tapmixer.clickCustomerTapandMixerOption();
			tapmixer.clickCustomerTapandMixerConsultationOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tapmixer;
	}

	public static Toilet ToiletCommodeInstall(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();

			toilet.clickCustomerToiletCommodeInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletCommodeRepair(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();

			toilet.clickCustomerToiletCommodeRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletCommodeUninstall(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();
			toilet.clickCustomerToiletCommodeUninstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletIndianToiletsInstall(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();
			toilet.clickCustomerToiletIndianToiletsInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletIndianToiletsRepair(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();
			toilet.clickCustomerToiletIndianToiletsRepairOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletIndianToiletsUninstall(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();
			// toilet.scrollToText();

			toilet.clickCustomerToiletIndianToiletsUninstallOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletFlushIssues(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();

			toilet.clickCustomerToiletFlushIssuesOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Toilet ToiletConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			toilet = new Toilet(driver);
			commonlocator = new CommonLocators(driver);
			toilet.clickCustomerPlumbingOption();
			toilet.clickCustomerToiletOption();

			toilet.clickCustomerToiletConsultationOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return toilet;
	}

	public static Basin_Sink BasinandSinkInstall(AndroidDriver driver) throws InterruptedException {
		try {
			basinsink = new Basin_Sink(driver);
			commonlocator = new CommonLocators(driver);
			basinsink.clickCustomerPlumbingOption();
			basinsink.clickCustomerBasinandSinkOption();
			basinsink.clickCustomerBasinandSinkInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return basinsink;
	}

	public static Basin_Sink BasinandSinkRepair(AndroidDriver driver) throws InterruptedException {
		try {
			basinsink = new Basin_Sink(driver);
			commonlocator = new CommonLocators(driver);
			basinsink.clickCustomerPlumbingOption();
			basinsink.clickCustomerBasinandSinkOption();
			basinsink.clickCustomerBasinandSinkRepairOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return basinsink;
	}

	public static Basin_Sink BasinandSinkUninstall(AndroidDriver driver) throws InterruptedException {
		try {
			basinsink = new Basin_Sink(driver);
			commonlocator = new CommonLocators(driver);
			basinsink.clickCustomerPlumbingOption();
			basinsink.clickCustomerBasinandSinkOption();
			basinsink.clickCustomerBasinandSinkUninstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return basinsink;
	}

	public static Basin_Sink BasinandSinkConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			basinsink = new Basin_Sink(driver);
			commonlocator = new CommonLocators(driver);
			basinsink.clickCustomerPlumbingOption();
			basinsink.clickCustomerBasinandSinkOption();
			basinsink.clickCustomerBasinandSinkConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return basinsink;
	}

	public static Drain_WastePipe DrainWastePipeRemoval(AndroidDriver driver) throws InterruptedException {
		try {
			drainpipe = new Drain_WastePipe(driver);
			commonlocator = new CommonLocators(driver);
			drainpipe.clickCustomerPlumbingOption();
			drainpipe.clickCustomerDrainWastePipeOption();
			drainpipe.clickCustomerDrainWastePipeRemovalOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return drainpipe;
	}

	public static Drain_WastePipe DrainWastePipeConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			drainpipe = new Drain_WastePipe(driver);
			commonlocator = new CommonLocators(driver);
			drainpipe.clickCustomerPlumbingOption();
			drainpipe.clickCustomerDrainWastePipeOption();
			drainpipe.clickCustomerDrainWastePipeConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return drainpipe;
	}

	public static WaterStorage WaterStorageInstall(AndroidDriver driver) throws InterruptedException {
		try {
			waterstorage = new WaterStorage(driver);
			commonlocator = new CommonLocators(driver);
			waterstorage.clickCustomerPlumbingOption();
			waterstorage.clickCustomerWaterStorageOption();
			waterstorage.clickCustomerWaterStorageInstallOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return waterstorage;
	}

	public static WaterStorage WaterStorageConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			waterstorage = new WaterStorage(driver);
			commonlocator = new CommonLocators(driver);
			waterstorage.clickCustomerPlumbingOption();
			waterstorage.clickCustomerWaterStorageOption();
			waterstorage.clickCustomerWaterStorageConsultationOption();
			commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return waterstorage;
	}

	public static AC ACMaintatinance(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACMaintatinanceOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACInstallation(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);

			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACInstallationOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACUninstallation(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACUninstallationOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACCleaningwithBlower(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACCleaningwithBlowerOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACCleaningwithFoam(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACCleaningwithFoamOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACLeakage(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACLeakageOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static AC ACConsulatation(AndroidDriver driver) throws InterruptedException {
		try {
			ac = new AC(driver);
			commonlocator = new CommonLocators(driver);
			ac.clickCustomerElectronicsOption();
			ac.clickCustomerACOption();
			ac.clickCustomerACConsulatationOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ac;
	}

	public static TV TVDisplayIssue(AndroidDriver driver) throws InterruptedException {
		try {
			tv = new TV(driver);
			commonlocator = new CommonLocators(driver);
			tv.clickCustomerElectronicsOption();
			tv.clickCustomerTVOption();
			tv.clickCustomerTVDisplayIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tv;
	}

	public static TV TVPCBIssue(AndroidDriver driver) throws InterruptedException {
		try {
			tv = new TV(driver);
			commonlocator = new CommonLocators(driver);
			tv.clickCustomerElectronicsOption();
			tv.clickCustomerTVOption();
			tv.clickCustomerTVPCBIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tv;
	}

	public static TV TVConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			tv = new TV(driver);
			commonlocator = new CommonLocators(driver);
			tv.clickCustomerElectronicsOption();
			tv.clickCustomerTVOption();
			tv.clickCustomerTVConsultationOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tv;
	}

	public static Fridge FridgeFrosting(AndroidDriver driver) throws InterruptedException {
		try {
			fridge = new Fridge(driver);
			commonlocator = new CommonLocators(driver);
			fridge.clickCustomerElectronicsOption();
			fridge.clickCustomerFridgeOption();
			fridge.clickCustomerFridgeFrostingOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fridge;
	}

	public static Fridge FridgeSmellIssue(AndroidDriver driver) throws InterruptedException {
		try {
			fridge = new Fridge(driver);
			commonlocator = new CommonLocators(driver);
			fridge.clickCustomerElectronicsOption();
			fridge.clickCustomerFridgeOption();
			fridge.clickCustomerFridgeSmellIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fridge;
	}

	public static Fridge FridgeCompressor(AndroidDriver driver) throws InterruptedException {
		try {
			fridge = new Fridge(driver);
			commonlocator = new CommonLocators(driver);
			fridge.clickCustomerElectronicsOption();
			fridge.clickCustomerFridgeOption();
			fridge.clickCustomerFridgeCompressorOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fridge;
	}

	public static Fridge FridgeInsufficientCooling(AndroidDriver driver) throws InterruptedException {
		try {
			fridge = new Fridge(driver);
			commonlocator = new CommonLocators(driver);
			fridge.clickCustomerElectronicsOption();
			fridge.clickCustomerFridgeOption();
			fridge.clickCustomerFridgeInsufficientCoolingOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return fridge;
	}

	public static WashingMachine WashingMachinePCBIssue(AndroidDriver driver) throws InterruptedException {
		try {
			washingmachine = new WashingMachine(driver);
			commonlocator = new CommonLocators(driver);
			washingmachine.clickCustomerElectronicsOption();
			washingmachine.clickCustomerWashingMachineOption();
			washingmachine.clickCustomerWashingMachinePCBIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return washingmachine;
	}

	public static WashingMachine WashingMachineMotorIssue(AndroidDriver driver) throws InterruptedException {
		try {
			washingmachine = new WashingMachine(driver);
			commonlocator = new CommonLocators(driver);
			washingmachine.clickCustomerElectronicsOption();
			washingmachine.clickCustomerWashingMachineOption();
			washingmachine.clickCustomerWashingMachineMotorIssueOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return washingmachine;
	}

	public static WashingMachine WashingMachineDrumIssue(AndroidDriver driver) throws InterruptedException {
		try {
			washingmachine = new WashingMachine(driver);
			commonlocator = new CommonLocators(driver);
			washingmachine.clickCustomerElectronicsOption();
			washingmachine.clickCustomerWashingMachineOption();
			washingmachine.clickCustomerWashingMachineDrumIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return washingmachine;
	}

	public static NewFurnitureEstimate selectNewFurnitureEstimate(AndroidDriver driver) throws InterruptedException {
		try {
			newfurniture = new NewFurnitureEstimate(driver);
			commonlocator = new CommonLocators(driver);
			newfurniture.clickCustomerCarpentryOption();
			newfurniture.clickCustomerNewFurnitureEstimateOption();
			newfurniture.clickCustomerNewFurnitureEstimateConsultationOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return newfurniture;
	}

	public static OldFurnitureRepair selectOldFurnitureRepair(AndroidDriver driver) throws InterruptedException {
		try {
			oldfurniture = new OldFurnitureRepair(driver);
			commonlocator = new CommonLocators(driver);
			oldfurniture.clickCustomerCarpentryOption();
			oldfurniture.clickCustomerOldFurnitureRepairOption();
			oldfurniture.clickCustomerOldFurnitureRepairConsultationOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return oldfurniture;

	}

	public static PolishWoodenFurniture selectPolishWoodenFurniture(AndroidDriver driver) throws InterruptedException {
		try {
			polishfurniture = new PolishWoodenFurniture(driver);
			commonlocator = new CommonLocators(driver);
			polishfurniture.clickCustomerCarpentryOption();
			polishfurniture.clickCustomerPolishWoodenFurnitureOption();
			polishfurniture.clickCustomerPolishWoodenFurnitureConsultationOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return polishfurniture;
	}

	public static Bathroom BathroomCompletewash(AndroidDriver driver) throws InterruptedException {
		try {
			bathroom = new Bathroom(driver);
			commonlocator = new CommonLocators(driver);
			bathroom.clickCustomerCleaningOption();
			bathroom.clickCustomerBathroomOption();
			bathroom.clickCustomerBathroomCompleteWashOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return bathroom;
	}

	public static Bathroom BathroomChemicalwash(AndroidDriver driver) throws InterruptedException {
		try {
			bathroom = new Bathroom(driver);
			commonlocator = new CommonLocators(driver);
			bathroom.clickCustomerCleaningOption();
			bathroom.clickCustomerBathroomOption();
			bathroom.clickCustomerBathroomChemicalwashOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return bathroom;
	}

	public static Home HomeRoomsClean(AndroidDriver driver) throws InterruptedException {
		try {
			home = new Home(driver);
			commonlocator = new CommonLocators(driver);
			home.clickCustomerCleaningOption();
			home.clickCustomerHomeOption();
			home.clickCustomerHomeRoomsOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return home;
	}

	public static Home HomeCompleteClean(AndroidDriver driver) throws InterruptedException {
		try {
			home = new Home(driver);
			commonlocator = new CommonLocators(driver);
			home.clickCustomerCleaningOption();
			home.clickCustomerHomeOption();
			home.clickCustomerHomeCompleteOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return home;
	}

	public static Office_Commercial OfficeCommercialConsultation(AndroidDriver driver) throws InterruptedException {
		try {
			officecommercial = new Office_Commercial(driver);
			commonlocator = new CommonLocators(driver);
			officecommercial.clickCustomerCleaningOption();
			officecommercial.clickCustomerOfficeCommercialSpaceOption();
			officecommercial.clickCustomerOfficeCommercialSpaceConsultationOption();
			// commonlocator.clickBookNowtab();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();

			commonlocator.clickDatetab();
			Thread.sleep(2000);

			commonlocator.clickTimetab();
			commonlocator.clickProceedtab();
			commonlocator.clickPaymentOptiontab();
			commonlocator.clickProceedtab();
			String successMsg = commonlocator.getOrdersuccessMessage();
			sa.assertEquals(successMsg, "Order placed successfully");
			commonlocator.clickHomeAfterordertab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return officecommercial;
	}

	public static String ErrorforMaxQuantity(AndroidDriver driver) throws InterruptedException {
		String Errormsg = "";
		try {
			homeflat = new Home_Flats(driver);
			commonlocator = new CommonLocators(driver);
			homeflat.clickCustomerPaintingOption();
			homeflat.clickCustomerHomeFlatsOption();
			homeflat.clickCustomerHomeFlats1to4bhkOption();
			for (int i = 0; i <= 4; i++) {
				commonlocator.clickaddquantitytab();
			}

			Errormsg = commonlocator.getMaxquanityMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(Errormsg, "Maximum 5 quantity can be added");
			Thread.sleep(5000);
			commonlocator.clickCarttab();
			for (int i = 0; i <= 4; i++) {
				commonlocator.clickminusquantitytab();
			}

			commonlocator.clickHometab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Errormsg;
	}

	public static Home ErrorforMultipleCategeryServices(AndroidDriver driver) throws InterruptedException {
		try {
			polishfurniture = new PolishWoodenFurniture(driver);
			home = new Home(driver);
			commonlocator = new CommonLocators(driver);
			polishfurniture.clickCustomerCarpentryOption();
			polishfurniture.clickCustomerPolishWoodenFurnitureOption();
			polishfurniture.clickCustomerPolishWoodenFurnitureConsultationOption();
			commonlocator.clickCarttab();
			commonlocator.clickHometab();
			home.clickCustomerCleaningOption();
			home.clickCustomerHomeOption();
			home.clickCustomerHomeCompleteOption();
			String Categoryerrormsg = commonlocator.getMultipleCategorySelectErrorMessage();
			System.out.println(Categoryerrormsg);
			commonlocator.clickCarttab();
			commonlocator.clickminusquantitytab();
			commonlocator.clickHometab();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return home;
	}

	public static String ErrorforNotselectingTime(AndroidDriver driver) throws InterruptedException {
		String timesloterrormsg = "";
		try {
			washingmachine = new WashingMachine(driver);
			commonlocator = new CommonLocators(driver);
			washingmachine.clickCustomerElectronicsOption();
			washingmachine.clickCustomerWashingMachineOption();
			washingmachine.clickCustomerWashingMachineDrumIssueOption();
			String cartmsg = commonlocator.getAddtoCartMessage();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(cartmsg, "Service Added to Cart");
			System.out.println(cartmsg);
			commonlocator.clickCarttab();
			commonlocator.clickProceedtab();
			Thread.sleep(4000);
			commonlocator.clickProceedtab();
			timesloterrormsg = commonlocator.getTimeslotErrorMessage();
			Assert.assertEquals(timesloterrormsg, "Please Select Timeslot");
			System.out.println(timesloterrormsg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return timesloterrormsg;
	}
}
