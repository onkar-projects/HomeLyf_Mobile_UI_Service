package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppiumServerManager {

    private static final Logger logger = LogManager.getLogger(AppiumServerManager.class);
    private static AppiumDriverLocalService service;

    public static void startAppiumServer() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingAnyFreePort();
        service = AppiumDriverLocalService.buildService(builder);
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
