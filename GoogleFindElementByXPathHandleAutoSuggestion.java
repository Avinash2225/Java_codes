package Day46;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFindElementByXPathHandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver d1 =new ChromeDriver();
d1.get("https://www.google.co.in");
d1.manage().window().maximize();
WebElement e1 = d1.findElement(By.name("q"));

e1.sendKeys("pune");
Thread.sleep(5000);
// e1.sendKeys(Keys.ENTER);
List<WebElement> li = d1.findElements(By.xpath("//div[@class = 'lnnVSe']"));
 int count = li.size();
li.get(count-10).click();
	}

}
