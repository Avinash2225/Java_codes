package Day44;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathForLogin {

	public static void main(String[] args) {

		ChromeDriver d2 = new ChromeDriver();
		
		d2.get("https://www.facebook.com/");
		d2.manage().window().maximize();
		
		WebElement e1 = d2.findElement(By.xpath("(//input)[3]"));
		
		//e1.click();
		e1.sendKeys("Avinash899" );
		
		WebElement e2 = d2.findElement(By.xpath("(//input)[4]"));

		e2.sendKeys("674173@#dcjh" );
		
		WebElement e3 = d2.findElement(By.xpath("(//button)"));
		e3.click();


		
		
		
	}

}
