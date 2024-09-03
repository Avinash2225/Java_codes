package Day46;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunchTypeShoeAndSelectFourthOption {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 =new ChromeDriver();
		d1.get("https://www.amazon.in");
		d1.manage().window().maximize();
		WebElement e1 = d1.findElement(By.id("twotabsearchtextbox"));

		e1.sendKeys("Shoe");
		Thread.sleep(5000);
		 e1.sendKeys(Keys.ENTER);
		List<WebElement> li = d1.findElements(By.xpath("//div[@class='two-pane-results-container']div/div"));
		 int count = li.size();
		 System.out.println(count);
		 
		li.get(count-3).click();
			
		
		
		
		
		
		
		
		
	}

}
