package BrowserDay41;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGoogle2 {

	public static void main(String[] args) {

		
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();		
		d1.get("https://www.google.in");
		
		d1.findElement(By.name("q")).sendKeys("india");
		d1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		
		
	}

}
