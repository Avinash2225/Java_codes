package Day49;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorByClassName1 {

	public static void main(String[] args) {

		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.google.com/");
		d2.manage().window().maximize();
		
	WebElement e1 = d2.findElement(By.cssSelector(".gLFyf"));  // css selector by class name and value (.classname and value)
	e1.sendKeys("best places to visit in lonavala" + Keys.ENTER);
		
	
	}

}
