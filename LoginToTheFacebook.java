package Day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToTheFacebook {

	public static void main(String[] args) {

		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		WebElement name = d2.findElement(By.name("email"));   // facebook login email field
		
		name.sendKeys("avinashyadav");
		
WebElement name2 = d2.findElement(By.name("pass"));   // facebook password field
		
		name2.sendKeys("Wrtv2#66@nn");
		
		WebElement name3 = d2.findElement(By.name("login"));  // facebook click on the login button

		
		name3.click();
		
		
	}

}
