package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage  extends BasePage{

	public  MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement msgHeading;
	
	public boolean isMyAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		}
	catch (Exception e1) {
		return false;
	}
		
	}
	
	
	
	
	
	
	
}
