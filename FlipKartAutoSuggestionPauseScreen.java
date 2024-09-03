package Day46;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutoSuggestionPauseScreen {

	public static void main(String[] args) throws InterruptedException {
		//div[@class'_2rslOn header-form-search OpXDaO']
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.flipkart.com/");
		d2.manage().window().maximize();
		WebElement e2 = d2.findElement(By.name("q"));
		e2.sendKeys("shoes");
		Thread.sleep(4000);
		e2.sendKeys(Keys.ENTER);
		List <WebElement> li = d2.findElements(By.xpath("	//form[@class'_2rslOn header-form-search OpXDaO']ul/li"));
	int count = li.size();
		System.out.println(count);
		li.get(count -3);
	}

}
