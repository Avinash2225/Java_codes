package Day45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KLaunchGoogleAndTypeIndiaUsingTagName {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com");
		d1.manage().window().maximize();
		WebElement e1 = d1.findElement(By.className("gLFyf"));
		e1.click(); // for clicking 
		Thread.sleep(3000);
		e1.sendKeys("india" + Keys.ENTER);  // for typing and enter
		

		
		
		
		
		
		
		
	}

}
