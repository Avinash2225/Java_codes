package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleAndOpenGmailUsingLink {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 = new ChromeDriver ();
		d1.get("https://www.google.co.in/");
		d1.manage().window().maximize();
	WebElement E1 =	d1.findElement(By.linkText("Gmail"));
		Thread.sleep(3000);
		E1.click();
		
		
		
		
		
		
	}

}
