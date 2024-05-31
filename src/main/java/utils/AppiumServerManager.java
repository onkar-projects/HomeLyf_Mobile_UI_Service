package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class AppiumServerManager {

    private static final Logger logger = LogManager.getLogger(AppiumServerManager.class);
    private static AppiumDriverLocalService service;
   
    public static void startAppiumServer() {
        
        service = new AppiumServiceBuilder()
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
        logger.info("Appium server started successfully.");
    }

    public static void stopAppiumServer() {
        if (service != null && service.isRunning()) {
            service.stop();
            logger.info("Appium server stopped successfully.");
        }
    }
}
