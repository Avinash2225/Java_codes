package handlingcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://testautomationpractice.blogspot.com/");
		d1.manage().window().maximize();
		
		// select specific locator
		
	//	d1.findElement(By.xpath("//input[@id='male']")).click();
	//	d1.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// 2 select all checkboxes
		
		List<WebElement> checkboxes= d1.findElements(By.xpath("//input[@class='form-check-inout' and @type ='checkbox']"));
		/*	for(int i=0; i<checkboxes.size();i++) {
			checkboxes.get(i).click();
	}*/
		
		
	for(WebElement checkbox:checkboxes) {
		checkbox.click();
	}
		
		
		
		
		
	}

}
