package statusofelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementstatus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement  search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//System.out.println("displayed status:"+ search.isDisplayed());
		System.out.println("Enabled status:"+ search.isEnabled());
		
		// //label[@for='apb-browse-refinements-checkbox_3']//i[@class='a-icon a-icon-checkbox']
		
	}

}
