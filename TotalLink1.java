package BrowserDay41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink1 {

	public static void main(String[] args) {

	//	Webdriver driver = new ChromeDriver();
		
	ChromeDriver d2 = new ChromeDriver();	
		d2.get("https://www.makemytrip.com/");
	List	<WebElement> e1 = d2.findElements(By.tagName("a"));
	System.out.println("Number of the webelements available:" + e1.size());
		
		
		
		
		
	}

}
