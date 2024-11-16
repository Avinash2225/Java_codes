package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazonlogin {
	@Test public static void login() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("	//span[@id='nav-link-accountList-nav-line-1']\r\n")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("avinashyadav@");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Ershf@#12");
		 driver.findElement(By.id("signInSubmit")).click();
	}
	
	
	
	//span[@id='nav-link-accountList-nav-line-1']
	
	
	
	
}
