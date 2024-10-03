package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		d1.manage().window().maximize();
		
		// is displayed()

	//	WebElement logo = d1.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
//		System.out.println("Display status of logo:" + logo.isDisplayed());
		
	//boolean logo = 	d1.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//	System.out.println(logo);
	
//	boolean status = d1.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//	System.out.println(status);
	
// isDisplayed() - we can check display status of the element
// is enabled () we can check enable/disable status of the element/ operational element
// isSelected () we can use to check the element 
	
		System.out.println("Before selection-...");
	WebElement male = d1.findElement(By.xpath("//input[@id='gender-male']")); // false
	System.out.println(male.isSelected());
	WebElement female = d1.findElement(By.xpath("//input[@id='gender-female']"));// False
	System.out.println(female.isSelected());
		
		
		System.out.println("after selection-...");	
           male.click();
           System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		  female.click();
          System.out.println(female.isSelected());
		System.out.println(male.isSelected());
		
		boolean newsls = d1.findElement(By.xpath("//input[@id='Newsletter']")).isSelected() ;   // //input[@id='Newsletter']
		
		System.out.println(newsls);
		
		
		
		
		
	}

}
