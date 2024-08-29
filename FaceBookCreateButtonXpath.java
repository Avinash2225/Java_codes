package Day44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCreateButtonXpath {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");
		
		WebElement e1 = d1.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		e1.click();
		
		
		
		
	}

}
