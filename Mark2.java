package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Mark2 {

	ChromeDriver d1;
	@BeforeMethod
	public void launch() {
		
		 d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dmobile%26crid%3DPQ285SUX4005%26sprefix%3Dmobile%252Caps%252C189%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().window().maximize();
		WebElement un  =	d1.findElement(By.name("email"));

	un.sendKeys("avinash@gmail.com");
		
		WebElement con_butn = d1.findElement(By.id("continue"));  // click on the continue button
		
con_butn.click();		// click on the button
		
WebElement Password  =	d1.findElement(By.name("password"));

Password.sendKeys("Arth@#428374");  // Enter the password

WebElement signin  =	d1.findElement(By.id("signInSubmit"));  // Click on thesign in button

signin.click();
		
	}
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		
		d1.quit();
		
		
	}
}
