package commonPackage;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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

public class ServicesLibrary {
	// AndroidDriver driver;
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
