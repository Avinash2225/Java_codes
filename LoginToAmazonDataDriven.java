package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToAmazonDataDriven {
@Test(dataProvider= "data1")
public void logintoamazon(String username, String pws) {
	
	ChromeDriver d2 = new ChromeDriver();
	// open the amazon sign in URL
	d2.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D2247952890937529308%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301536%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d2.manage().window().maximize();
	
	// Enter the Email id of the User
WebElement un  =	d2.findElement(By.name("email"));
	
	un.sendKeys("avinash@gmail.com");
	
	WebElement con_butn = d2.findElement(By.id("continue"));  // click on the continue button
	
con_butn.click();		// click on the button
	
WebElement Password  =	d2.findElement(By.name("password"));

Password.sendKeys("Arth@#428374");  // Enter the password

WebElement signin  =	d2.findElement(By.id("signInSubmit"));  // Click on thesign in button

signin.click();
}
@DataProvider(name= "data")
public Object [] [] method1()
{
	
	
Object [] [] d1 = new Object[2][2];
	
	d1[0][0] = "9082574421"; // mobbile number 
   d1[0][1]  =  "WES@#6868";  // password 
	
   // for  login to amazon two test data is ready now we have to import return statement
   
   d1[1][0] = "7905373276";   // mobile number
  d1[1][1] =   "Weft4567";    // password
return d1;
	
	
}
}
