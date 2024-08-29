package Day44;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonxpathForSearch {

	public static void main(String[] args) {
		
ChromeDriver d1 = new ChromeDriver();
d1.get("https://www.amazon.in");
d1.manage().window().maximize();

WebElement a1 = d1.findElement(By.xpath("(//input)[5]"));

a1.click();
a1.sendKeys("mobile"+ Keys.ENTER);	
	}

}
