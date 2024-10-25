package sslhandling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ssl1 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//options.addArguments("--headless=new");    //
		
		
			ChromeDriver d2 =new ChromeDriver(options);
		
		d2.get("https://expired.badssl.com/");
		System.out.println(d2.getTitle());  // privacy error
		
		
		
		
		
		
	}

}
