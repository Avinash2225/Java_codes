package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath1 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://demo.opencart.com/");
		
		d1.manage().window().maximize();
		
	d1.findElements(By.xpath("//img[@title='MacBook']"));
		
	
		
		
		
		
		
	}

}
