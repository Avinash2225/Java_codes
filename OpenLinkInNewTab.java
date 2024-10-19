package keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.manage().window().maximize();
		
		d1.get("https://demo.nopcommerce.com/");
	WebElement reglink	=d1.findElement(By.xpath("//a[normalize-space()='Register']"));
	
	Actions act = new Actions(d1);
	act.keyDown(Keys.CONTROL).click(reglink).keyDown(Keys.CONTROL).perform();
	
	// switch into registration page
	// driver.getwindowhandles
//Set<String>	ids =d1.getWindowHandles(); // convert entire things into arrayslist
List<String>	ids =new ArrayList(d1.getWindowHandles());

d1.switchTo().window(ids.get(1));  // switch to registration page
d1.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Avinash");
// by this you will go to the home page
d1.switchTo().window(ids.get(0));	
	}

}
