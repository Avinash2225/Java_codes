package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	
	public Logger logger;
	 @BeforeClass public	void setup() {
		 
		 logger = LogManager.getLogger(this.getClass());
		 
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://tutorialsninja.com/demo/");
		 
		 driver.manage().window().maximize();
		 	 
		}
		
	@AfterClass	public void tearDown() {
			driver.quit();
		}
	
	@SuppressWarnings("deprecation")
	public String randomeString() // we are creating this for passing random email id in the run time
	{
		
	String  generatedstring =	RandomStringUtils.randomAlphabetic(5);
	return generatedstring;
	}
	
	public String randomeNumber()  // we are passing the random phone number
	{
		
	@SuppressWarnings("deprecation")
	String  generatenumber =	RandomStringUtils.randomNumeric(10);
	
	return generatenumber;
	}
	public String randomeAlphaNumeric()  // we are passing the random password combination of the alphanumeric
	{
		
	@SuppressWarnings("deprecation")
	String  generatestring =	RandomStringUtils.randomNumeric(10);

	@SuppressWarnings("deprecation")
	String  generatenumber =	RandomStringUtils.randomNumeric(3);
	
	return (generatestring+"@"+generatenumber);  // here returing both alpha+numeric and also adding @ for special character this is most important for first time when we are automation registartion page
	
	}
	

}
