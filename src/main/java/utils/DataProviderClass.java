package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	static String path = System.getProperty("user.dir") + "\\src\\resorces\\java\\TestData\\VendorTestData.xlsx";
	static ExcelDataProvider sheet = new ExcelDataProvider(path);

//	@DataProvider(name = "CustomerSignupvaliddata")
//	public static String[][] getcustomervalidData() throws IOException {
//		int rownum = sheet.getRowCount("Customer valid Data");
//		String signupData[][] = new String[rownum][5];
//
//		for (int i = 1; i <= rownum; i++) {
//			for (int j = 0; j < 5; j++) {
//				signupData[i - 1][j] = sheet.getCellData("Customer valid Data", i, j);
//
//				System.out.println("Given data: " + signupData[i - 1][j]);
//			}
//		}
//		return signupData;
//	}

//	@DataProvider(name = "CustomerSigninvaliddata")
//	public static String[][] getcustomersignin() throws IOException {
//		int rownum = sheet.getRowCount("Customer valid Data");
//		String[][] emailAndPassword = new String[rownum][2];
//
//		for (int i = 1; i <= rownum; i++) {
//			emailAndPassword[i - 1][0] = sheet.getCellData("Customer valid Data", i, 1);
//			emailAndPassword[i - 1][1] = sheet.getCellData("Customer valid Data", i, 3);
//
//			System.out.println(emailAndPassword[i - 1][0]);
//			System.out.println(emailAndPassword[i - 1][1]);
//		}
//		return emailAndPassword;
//	}

	@DataProvider(name = "emailforforgotpassword")
	public static String[][] getEmailOTP() throws IOException {

		int rownum = sheet.getRowCount("Customer valid Data");
		String emailid[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			emailid[i - 1][0] = sheet.getCellData("Customer valid Data", i, 1);

			System.out.println("Given data: " + emailid[i - 1][0]);
		}
		return emailid;
	}

	@DataProvider(name = "CustomerSignupinvaliddata")
	public static String[][] getcustomerinvalidData() throws IOException {

		int rownum = sheet.getRowCount("Customer invalid Data");
		String signupData[][] = new String[rownum][18];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < 5; j++) {
				signupData[i - 1][j] = sheet.getCellData("Customer invalid Data", i, j);

				System.out.println("Given data: " + signupData[i - 1][j]);
			}
		}
		return signupData;
	}

	@DataProvider(name = "CustomerSignininvaliddata")
	public static Object[][] getcustomersignininvaliddata() throws IOException {
		int rownum = sheet.getRowCount("Customer invalid Data");
		Object[][] emailAndPassword = new Object[rownum - 1][2];

		for (int i = 1; i < rownum; i++) {
			emailAndPassword[i - 1][0] = sheet.getCellData("Customer invalid Data", i, 1);
			emailAndPassword[i - 1][1] = sheet.getCellData("Customer invalid Data", i, 3);

			System.out.println(emailAndPassword[i - 1][0]);
			System.out.println(emailAndPassword[i - 1][1]);
		}
		return emailAndPassword;
	}

	@DataProvider(name = "emailforforgotpassword")
	public static String[][] getEmailOTPinvaliddata() throws IOException {

		int rownum = sheet.getRowCount("Customer invalid Data");
		String emailid[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			emailid[i - 1][0] = sheet.getCellData("Customer invalid Data", i, 1);

			System.out.println("Given data: " + emailid[i - 1][0]);
		}
		return emailid;
	}

	@DataProvider(name = "otpforforgotpassword")
	public static String[][] getOTPinvaliddata() throws IOException {

		int rownum = sheet.getRowCount("Customer invalid Data");
		String otp[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			otp[i - 1][0] = sheet.getCellData("Customer invalid Data", i, 5);

			System.out.println("Given data: " + otp[i - 1][0]);
		}
		return otp;
	}

	@DataProvider(name = "resetpasswordvaliddata")
	public static Object[][] resetPasswordinvaliddata() throws IOException {
		int rownum = sheet.getRowCount("Customer valid Data");
		Object[][] resetPassword = new Object[rownum - 1][2];

		for (int i = 1; i < rownum; i++) {
			resetPassword[i - 1][0] = sheet.getCellData("Customer invalid Data", i, 3);
			resetPassword[i - 1][1] = sheet.getCellData("Customer invalid Data", i, 4);

			System.out.println(resetPassword[i - 1][0]);
			System.out.println(resetPassword[i - 1][1]);
		}
		return resetPassword;
	}

	@DataProvider(name = "otpforforgotpassword")
	public static String[][] getOTP() throws IOException {

		int rownum = sheet.getRowCount("Customer valid Data");
		String otp[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			otp[i - 1][0] = sheet.getCellData("Customer valid Data", i, 5);

			System.out.println("Given data: " + otp[i - 1][0]);
		}
		return otp;
	}

	@DataProvider(name = "resetpasswordvaliddata")
	public static Object[][] resetPassword() throws IOException {
		int rownum = sheet.getRowCount("Customer valid Data");
		Object[][] resetPassword = new Object[rownum - 1][2];

		for (int i = 1; i < rownum; i++) {
			resetPassword[i - 1][0] = sheet.getCellData("Customer valid Data", i, 3);
			resetPassword[i - 1][1] = sheet.getCellData("Customer valid Data", i, 4);

			System.out.println(resetPassword[i - 1][0]);
			System.out.println(resetPassword[i - 1][1]);
		}
		return resetPassword;
	}
	
	//--------------------------------VendorTestData----------------------------------
	
	@DataProvider(name = "VendorSignUpTestData")
	public String[][] getVendorSignUpData() throws IOException {
		int rownum = sheet.getRowCount("VendorTestData");
		String vendorSignUpData[][] = new String[rownum][12];
		
		for(int i=1; i<=rownum; i++) {
			for(int j=0; j<12; j++) {
				vendorSignUpData[i-1][j] = sheet.getCellData("VendorTestData", i, j);
				
				System.out.println("VendorDetails: "+vendorSignUpData[i-1][j]);
			}
		}
		return vendorSignUpData;
	}
	
	@DataProvider(name = "VendorSignInTestData")
	public String[][] getVendorSignInData() throws IOException {
		int rownum = sheet.getRowCount("VendorTestData");
		String vendorSignInData[][] = new String[rownum][2];
		
		for(int i=1; i<=rownum; i++) {
		 vendorSignInData[i-1][0] = sheet.getCellData("VendorTestData", i, 1);
		 vendorSignInData[i-1][1] = sheet.getCellData("VendorTestData", i, 10);
		 
		 System.out.println("VendorUserName: "+vendorSignInData[i-1][0]);
		 System.out.println("VendorPassword: "+vendorSignInData[i-1][1]);
			
		 }
		return vendorSignInData;
	}
	
	//--------------------------------CustomerTestData----------------------------------//
	@DataProvider(name = "CustomerSignupvaliddata")
	public static String[][] getcustomervalidData() throws IOException {
		int rownum = sheet.getRowCount("CustomerTestData");
		String signupData[][] = new String[rownum][5];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < 5; j++) {
				signupData[i - 1][j] = sheet.getCellData("CustomerTestData", i, j);

				System.out.println("Given data: " + signupData[i - 1][j]);
			}
		}
		return signupData;
	}
	
	@DataProvider(name = "CustomerSigninvaliddata")
	public static String[][] getcustomersignin() throws IOException {
		int rownum = sheet.getRowCount("CustomerTestData");
		String[][] emailAndPassword = new String[rownum][2];

		for (int i = 1; i <= rownum; i++) {
			emailAndPassword[i - 1][0] = sheet.getCellData("CustomerTestData", i, 1);
			emailAndPassword[i - 1][1] = sheet.getCellData("CustomerTestData", i, 3);

			System.out.println(emailAndPassword[i - 1][0]);
			System.out.println(emailAndPassword[i - 1][1]);
		}
		return emailAndPassword;
	}
}












