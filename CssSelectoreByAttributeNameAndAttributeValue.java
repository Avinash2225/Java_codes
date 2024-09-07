package Day49;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectoreByAttributeNameAndAttributeValue {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.booking.com/");
		d1.manage().window().maximize();
		
		WebElement e1 = d1.findElement(By.cssSelector("[class = 'eb46370fe1']"));
		e1.sendKeys("new york" + Keys.ENTER);
		
		
	}

}
