package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.time.Duration;
import utils.AppiumDriverManager;
import utils.AppiumServerManager;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        AppiumServerManager.startAppiumServer();
        driver = AppiumDriverManager.getDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        AppiumServerManager.stopAppiumServer();
        logger.info("Appium server stopped.");
    }

    protected WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clickElement(By locator) {
        waitForElement(locator).click();
        logger.info("Clicked element with locator: " + locator.toString());
    }

    protected void enterText(By locator, String text) {
        WebElement element = waitForElement(locator);
        element.clear();
        element.sendKeys(text);
        logger.info("Entered text: " + text + " into element with locator: " + locator.toString());
    }

    protected String getElementText(By locator) {
        String text = waitForElement(locator).getText();
        logger.info("Retrieved text: " + text + " from element with locator: " + locator.toString());
        return text;
    }

    protected boolean isElementDisplayed(By locator) {
        try {
            boolean isDisplayed = waitForElement(locator).isDisplayed();
            logger.info("Element with locator: " + locator.toString() + " is displayed: " + isDisplayed);
            return isDisplayed;
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException e) {
            logger.info("Element with locator: " + locator.toString() + " is not displayed.");
            return false;
        }
    }
}
