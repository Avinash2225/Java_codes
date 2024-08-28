package day43;

import org.openqa.selenium.chrome.ChromeDriver;

public class NevigationMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 = new ChromeDriver();
	d1.navigate().to("https://www.google.com");
	d1.navigate().back();	
		d1.navigate().forward();
		Thread.sleep(3000);


	d1.navigate().refresh();
		
		
		
		
		
	}

}
