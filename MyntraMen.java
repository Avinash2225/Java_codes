package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraMen {

	public static void main(String[] args) {

	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.myntra.com/");
	
	WebElement e1 = d1.findElement(By.linkText("Men"));
	
	e1.click();
		
		
		
		
		
		
		
		
		
		
	}

}
