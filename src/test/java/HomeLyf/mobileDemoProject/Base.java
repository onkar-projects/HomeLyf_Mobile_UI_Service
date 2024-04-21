package HomeLyf.mobileDemoProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
	
	@Test
	public void StartServer() throws MalformedURLException {
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\DELL-PC\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				 .withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		try {
			UiAutomator2Options option = new UiAutomator2Options()
					.setDeviceName("Pixel_samsung")
					.setApp(System.getProperty(("user.dir")+"\\src\\resorces\\java\\Homelyf.apk"));
			
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),option);
//			AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), option);
		} catch (Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
		
	}
}
