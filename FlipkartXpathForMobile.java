package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathForMobile {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver d1 = new ChromeDriver();

		d1.get("https://www.flipkart.com/");
	WebElement e1 =	(WebElement) d1.findElements(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
	
		e1.click();
	}

}
