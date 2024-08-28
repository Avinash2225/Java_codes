package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBestSeller {

	public static void main(String[] args) {

		ChromeDriver d2 =new ChromeDriver();
		d2.get("https://www.amazon.in/");
		d2.manage().window().maximize();
		WebElement b1 = d2.findElement(By.linkText("Best Sellers"));
		
		b1.click();
		
		
		
		
		
	}

}
