package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmApp {
	ChromeDriver driver;
	@Test (priority=1)
	
	public void openapp() {
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void testlogo() throws InterruptedException {
	Thread.sleep(3000);
	boolean b1 = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed:" +b1);
		
	}
	@Test (priority=3)
	public void login() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
	}
	@Test (priority=4)
	public void close() {
		
		driver.quit();
		
		
	}
}
