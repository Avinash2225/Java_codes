package Day46;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunchTypeMobile {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.amazon.in");
		d2.manage().window().maximize();
		WebElement e2 = d2.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("mobile");
		Thread.sleep(4000);
		e2.sendKeys(Keys.ENTER);
		List <WebElement> li = d2.findElements(By.xpath(		"//div[@class ='autocomplete-results-container']"));
		
 		
		int count = li.size();
		System.out.println(count);
		
		li.get(count-3).click();
		
		
		
		
		
		
	}

}
