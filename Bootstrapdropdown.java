package bootstrapdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		// product type
		
	List<WebElement> productTypes =	driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	System.out.println("no of options:" + productTypes.size());
	selectOptionFromDropDown(productTypes, "Accounts");
	
		
	}

}
