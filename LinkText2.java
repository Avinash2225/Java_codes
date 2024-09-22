package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText2 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.opencart.com/");
		d1.manage().window().maximize();
		WebElement e1 = d1.findElement(By.linkText("Demo"));
		e1.sendKeys(Keys.ENTER);
		
		
		
	}

}
