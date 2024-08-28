package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonEnable {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.in");
	WebElement e1 =	d1.findElement(By.id("twotabsearchtextbox"));
		
		
		if(e1.isDisplayed() && e1.isEnabled()) {
			e1.sendKeys("Mobile" + Keys.ENTER);
		}
		
	}

}
