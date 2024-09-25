package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveroveraction {

	public static void main(String[] args) {

		WebDriver n1 = new ChromeDriver();
		n1.get("https://www.amazon.in/");
		n1.manage().window().maximize();
		
		// mouse over action is mouse action
		WebElement e1 = n1.findElement(By.xpath("//a[normalize-space()='Best Sellers']"));
	//	WebElement e2 = n1.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions ac = new Actions(n1);
		
		ac.moveToElement(e1).build().perform();
		
		// build is perform action you have to mention build.perform use other wise it will not work
		// return action class
			
	}

}
