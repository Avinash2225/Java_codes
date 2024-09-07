package Day49;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorUsingAttributeNameAndAttributeValueUsingTagName {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		
		WebElement e1 = d1.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		
		
		
		
		// "input[id="twotabsearchtextbox"]"
		
		
		
		
		
		
	}

}
