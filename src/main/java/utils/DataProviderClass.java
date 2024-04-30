package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	static String path = System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\VendorTestData.xlsx";
	static ExcelDataProvider sheet = new ExcelDataProvider(path);

	@DataProvider(name = "CustomerSignupvaliddata")
	public static String[][] getcustomervalidData() throws IOException {
		int rownum = sheet.getRowCount("CustomervalidTestData");
		String signupData[][] = new String[rownum][5];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < 5; j++) {
				signupData[i - 1][j] = sheet.getCellData("CustomervalidTestData", i, j);

				System.out.println("Given data: " + signupData[i - 1][j]);
			}
		}
		return signupData;
	}
	
	@DataProvider(name = "CustomerSigninvaliddata")
	public static String[][] getcustomersignin() throws IOException {
		int rownum = sheet.getRowCount("CustomervalidTestData");
		String[][] emailAndPassword = new String[rownum][2];

		for (int i = 1; i <= rownum; i++) {
			emailAndPassword[i - 1][0] = sheet.getCellData("CustomervalidTestData", i, 1);
			emailAndPassword[i - 1][1] = sheet.getCellData("CustomervalidTestData", i, 3);

			System.out.println(emailAndPassword[i - 1][0]);
			System.out.println(emailAndPassword[i - 1][1]);
		}
		return emailAndPassword;
	}

	@DataProvider(name = "emailforforgotpassword")
	public static String[][] getEmailOTP() throws IOException {

		int rownum = sheet.getRowCount("CustomervalidTestData");
		String emailid[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			emailid[i - 1][0] = sheet.getCellData("CustomervalidTestData", i, 1);

			System.out.println("Given data: " + emailid[i - 1][0]);
		}
		return emailid;
	}

	@DataProvider(name = "CustomerSignupinvaliddata")
	public static String[][] getcustomerinvalidData() throws IOException {

		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		String signupData[][] = new String[rownum][5];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < 5; j++) {
				signupData[i - 1][j] = sheet.getCellData("CustomerinvalidTestData", i, j);

				System.out.println("Given data: " + signupData[i - 1][j]);
			}
		}
		return signupData;
	}

	@DataProvider(name = "CustomerSignininvaliddata")
	public static String[][] getcustomerinvalidsignin() throws IOException {
		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		String[][] emailAndPassword = new String[rownum][2];

		for (int i = 1; i <= rownum; i++) {
			emailAndPassword[i - 1][0] = sheet.getCellData("CustomerinvalidTestData", i, 1);
			emailAndPassword[i - 1][1] = sheet.getCellData("CustomerinvalidTestData", i, 3);

			System.out.println(emailAndPassword[i - 1][0]);
			System.out.println(emailAndPassword[i - 1][1]);
		}
		return emailAndPassword;
	}
	@DataProvider(name = "emailforforgotpassword")
	public static String[][] getEmailOTPinvaliddata() throws IOException {

		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		String emailid[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			emailid[i - 1][0] = sheet.getCellData("CustomerinvalidTestData", i, 1);

			System.out.println("Given data: " + emailid[i - 1][0]);
		}
		return emailid;
	}

	
	//--------------------------------------- not in use ----------------------------------------------
	
	
	
	
	@DataProvider(name = "otpforforgotpassword")
	public static String[][] getOTPinvaliddata() throws IOException {

		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		String otp[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			otp[i - 1][0] = sheet.getCellData("CustomerinvalidTestData", i, 5);

			System.out.println("Given data: " + otp[i - 1][0]);
		}
		return otp;
	}

	@DataProvider(name = "resetpasswordvaliddata")
	public static Object[][] resetPasswordinvaliddata() throws IOException {
		int rownum = sheet.getRowCount("CustomervalidTestData");
		Object[][] resetPassword = new Object[rownum - 1][2];

		for (int i = 1; i < rownum; i++) {
			resetPassword[i - 1][0] = sheet.getCellData("CustomervalidTestData", i, 3);
			resetPassword[i - 1][1] = sheet.getCellData("CustomervalidTestData", i, 4);

			System.out.println(resetPassword[i - 1][0]);
			System.out.println(resetPassword[i - 1][1]);
		}
		return resetPassword;
	}

	@DataProvider(name = "otpforforgotpassword")
	public static String[][] getOTP() throws IOException {

		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		String otp[][] = new String[rownum][1];

		for (int i = 1; i <= rownum; i++) {
			otp[i - 1][0] = sheet.getCellData("CustomerinvalidTestData", i, 5);

			System.out.println("Given data: " + otp[i - 1][0]);
		}
		return otp;
	}

	@DataProvider(name = "resetpasswordvaliddata")
	public static Object[][] resetPassword() throws IOException {
		int rownum = sheet.getRowCount("CustomerinvalidTestData");
		Object[][] resetPassword = new Object[rownum - 1][2];

		for (int i = 1; i < rownum; i++) {
			resetPassword[i - 1][0] = sheet.getCellData("CustomerinvalidTestData", i, 3);
			resetPassword[i - 1][1] = sheet.getCellData("CustomerinvalidTestData", i, 4);

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
	
}













