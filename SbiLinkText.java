package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiLinkText {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		
		e1.click();
WebElement e2 = driver.findElement(By.name("userName"));
		
		e2.sendKeys("avinash@gmaha5d7");
		
WebElement e3 = driver.findElement(By.name("password"));
		
		e3.sendKeys("WEsdjhfh@#875");
WebElement e4 = driver.findElement(By.id("loginCaptchaValue"));
		
		e4.sendKeys("34792hsfdbvjs");
		
WebElement e5 = driver.findElement(By.id("Button2"));
		
		e5.click();
		
		
		
	}

}
