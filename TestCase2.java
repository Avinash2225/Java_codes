package Seleniumpackage1.Seleniumproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {

		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.opencart.com/");
		d1.manage().window().maximize();
		
		String title= d1.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
	d1.quit();
		}
	}
	
		
	}


