package utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import config.AppConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverManager {

    private static final Logger logger = LogManager.getLogger(AppiumDriverManager.class);

    public static AndroidDriver getDriver() throws MalformedURLException {
        try {
            // Set desired capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", AppConfig.PLATFORM_NAME);
            caps.setCapability("app", AppConfig.APP_PATH);
            caps.setCapability("deviceName", AppConfig.DEVICE_NAME);
            caps.setCapability("automationName", AppConfig.AUTO_NAME);
            caps.setCapability("unicodeKeyboard", true);

            // Initialize Appium driver
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
            logger.info("Appium driver initialized successfully.");
            return driver;
        } catch (MalformedURLException e) {
            logger.error("Failed to initialize Appium driver: " + e.getMessage());
            throw e; // Re-throw the exception for handling at a higher level
        }
    }
}
