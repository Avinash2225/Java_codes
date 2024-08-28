package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry {

	public static void main(String[] args) {

		ChromeDriver d3 = new ChromeDriver();
		d3.get("https://www.firstcry.com");
		d3.manage().window().maximize();
		
		WebElement e1 = d3.findElement(By.partialLinkText("GIRL"));
		
		e1.click();
		
		
		
		
	}

}
