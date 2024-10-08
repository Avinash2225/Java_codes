package handlingdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {

		ChromeDriver d1 =  new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.get("https://testautomationpractice.blogspot.com/");
		d1.manage().window().maximize();
		
		WebElement rest = d1.findElement(By.xpath("//select[@id='country']"));
Select rest = new Select(rest);	

// select option from dropdown
rest.selectByVisibleText("france");


	
	}

}
