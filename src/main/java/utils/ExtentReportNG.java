package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ExtentReportNG  implements ITestListener {

	
	ExtentSparkReporter htmlReporter;//user interface
	ExtentReports reports;//environmental info
	static ExtentTest  test;//entries for test
	static AndroidDriver driver; 
	private static final Logger logger = LogManager.getLogger(BasePage.class);
	
	public static void setDriver(AndroidDriver driver) {
        ExtentReportNG.driver = driver;
	} 
	
	public void configureReport()
	{
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
				String reportName = "MobileAutomationTestReport "+ timestamp +".html";
				htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//" + reportName);
				reports = new ExtentReports();
				reports.attachReporter(htmlReporter);
				
				//add system information/environment info to reports
				reports.setSystemInfo("Machine", "DELL");
				reports.setSystemInfo("OS", "windows 11");
				reports.setSystemInfo("user name:", "Onkar");
				
				//configuration to change look and feel of report
				htmlReporter.config().setDocumentTitle("Extent Report");
				htmlReporter.config().setReportName("This is HomeLyf_Mobile_UI Report");
				htmlReporter.config().setTheme(Theme.DARK);
		
	   }
	//Onstart method is called when any test starts
	@Override
	public void onStart(ITestContext context) {
		configureReport();
		System.out.println("On start method invoked....");
		
	}
	//when test case get started this method is called.
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Name of test method started:" + result.getName());
		}

	
	
	//when test case get failed this method is called.
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of test method failed:" +result.getName());
		System.out.println(Status.FAIL+"Test Case Failed Description: " + result.getThrowable());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: "+ result.getName(), ExtentColor.RED));
		
		String capturescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		 test.addScreenCaptureFromBase64String(capturescreenshot, "Failed Test Screenshot");
		    test.log(Status.FAIL, MarkupHelper.createLabel("Screenshot of the failure:", ExtentColor.PINK));
	}
	
	//when test case get skipped this method is called
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of test method skipped:" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + result.getName(),ExtentColor.YELLOW));
	}

	
	
	//when test case get passed this method is called
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of test method successfully executed:" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + result.getName(), ExtentColor.GREEN));
	
	}
	@Override
	public void onFinish(ITestContext context) {
	System.out.println("On Finished method invoked....");
	reports.flush();//it is mandatory to call flush method to ensure information is written to started reporter.
	}
}
