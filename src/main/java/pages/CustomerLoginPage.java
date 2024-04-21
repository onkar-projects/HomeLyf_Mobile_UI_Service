package pages;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CustomerLoginPage extends BasePage  {
	
	 public CustomerLoginPage(AndroidDriver driver) {
	        super(driver);
	    }

	    public void clickContiueAsCustomerButton() {
	        clickElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Continue as a Customer']"));
	    }
	    
	    public void customer_EmailId_Text() {
	    	enterText(AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[1]"),"onkar41@gmail.com");
	    }
}
