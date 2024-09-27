package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick1 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
	d1.manage().window().maximize();
	
	// switch to the frame
	
	d1.switchTo().frame("iframeResult");
	
	WebElement e1 = d1.findElement(By.xpath("//input[@id='field1']"));
	WebElement e2 = d1.findElement(By.xpath("//input[@id='field2']"));
	WebElement e3 = d1.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	
		e1.clear();   // clear the box 1
		e1.sendKeys("Welcome");
		
		// double action on the button
		
		Actions act = new Actions(d1);
		act.doubleClick(e3).perform();  // perform double click action
		
		
	}

}
