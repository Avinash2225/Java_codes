package waitcommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(d1,Duration.ofSeconds(5));  // declaration
		d1.manage().window().maximize();
		
		d1.get("https://opensource-demo.orangehrmlive.com/auth/login");
		
		WebElement textuser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
		textuser.sendKeys("Admin");
		
		WebElement textpass = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='password']")));
		textpass.sendKeys("admin123");
		
		WebElement loginbtn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		loginbtn.click();
		
		
		
	}

}
