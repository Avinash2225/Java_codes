package handlingdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDowns {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/189");
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath(null));
		// how to select single option from a dropdown
		
		
		
		
		
		
		
		
		
		
		
	}

}
