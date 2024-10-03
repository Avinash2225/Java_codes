package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.makemytrip.com/");
		d1.manage().window().maximize();
		
		// get()  method is used to launch the web application
		
	// get title
		
		System.out.println(d1.getTitle()); //returns title of the webpage
		
		// get current url
		
		System.out.println(d1.getCurrentUrl());
		
		// get page source () - returns source code of the page
	//	System.out.println(d1.getPageSource());
		
		// get window handle returns id of the single window
	//	id every time changes
		//String e2 = d1.getWindowHandle();
	//	System.out.println(e2);
		
		// het windowhandles returns multiple id
		Thread.sleep(5000);
		d1.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']"));	// this will open new browser window	
	Set<String> s2=  d1.getWindowHandles();
	System.out.println(s2);
		
	}

}
