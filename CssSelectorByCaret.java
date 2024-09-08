package Day49;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorByCaret {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");	
		d1.manage().window().maximize();
		WebElement e1 = d1.findElement(By.cssSelector("input[class^=inputtext ]"));
		e1.sendKeys("avinashyadav3278@gmail.com" + Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}
