package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static org.testng.Assert.assertNotEqualsDeep;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import utils.AppiumDriverManager;
import utils.AppiumServerManager;

public class BasePage {

	protected static AndroidDriver driver;
	protected WebDriverWait wait;
	private static final Logger logger = LogManager.getLogger(BasePage.class);

	public BasePage(AndroidDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	protected WebElement waitForElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected void clickElement(By locator) {
		waitForElement(locator).click();
		logger.info("Clicked element with locator: " + locator.toString());
	}

	public void enterText(By locator, String text) throws InterruptedException {
		WebElement element = waitForElement(locator);
		element.clear();
		element.click();
		waitForElement(locator).sendKeys(text);
		logger.info("Entered text: " + text + " into element with locator: " + locator.toString());
	}

	protected String getElementText(By locator) {
		String Actualtext = waitForElement(locator).getText();
		System.out.println("Actual text : " + Actualtext);
		logger.info("Retrieved text: " + Actualtext + " from element with locator: " + locator.toString());
		return Actualtext;
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

	protected void selectElementByIndex(By locator) {
		waitForElement(locator).click();
		logger.info("from element with locator: " + locator.toString());
	}

	protected void getElementLenth(By locator) throws InterruptedException {
		WebElement element = waitForElement(locator);
		element.click();		
	}
	
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void acceptAlertIfExists() {
	    try {
	        acceptAlert(); 
	    } catch (TimeoutException e) {
	    	logger.debug(e.getMessage());
	    }
	}

	//method overloading concept
	public String getTextByAttribute(By locator) throws InterruptedException {
		WebElement element = waitForElement(locator);
		String errorText=element.getAttribute("content-desc");
		System.out.println("Actual Text: "+ errorText);
		logger.info("Retrived "+errorText+" element with locator: " + locator.toString());
		return errorText;
	}
	public String getTextByAttribute(By locator,By errorLocator, String text) throws InterruptedException {
		WebElement element = waitForElement(locator);
		element.click();
		waitForElement(locator).sendKeys(text);
		WebElement errorElement = waitForElement(errorLocator);
		String errorText=errorElement.getAttribute("content-desc");
		System.out.println("Actual Text: "+ errorText);
		logger.info("Retrived "+errorText+" element with locator: " + errorElement.toString());
		return errorText;
	}
	
	public void clickOnBackButton() {
		WebElement element = waitForElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Back\"]"));
		for(int i=0;i<3;i++) {
			element.click();
		}
		//element.click();
	}
	
	public void scrollDown(String text) {		
//		String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Sign Up\"))";
		String signUpButton = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description("+text+"))";
		 driver.findElement(AppiumBy.androidUIAutomator(signUpButton));
	}
}
