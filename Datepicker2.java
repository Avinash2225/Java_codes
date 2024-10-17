package datepickersandcalenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {
	// select month and year 
	static void selectmonthandyear(ChromeDriver d1, String month, String year) {
		while(true) {
			String cm =		d1.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();   // actual  month from datepicker
					String year1 = d1.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual month from datepicker
					
					if(cm.equals(month) && year1.equals(year))
					{
						break; 
					}
	}
	}
		 // select the one date	
		static void selectdate(ChromeDriver d1, String day) {
		List<WebElement> alldate  = d1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
				// "//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"
				for(WebElement dt:alldate) {
					if(dt.getText().equals(day)) {
						dt.click();
						break;
		}
				}			
//		d1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    // Next 			
				d1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w]")).click();  // previous
		}
	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();

		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://jqueryui.com/datepicker/");
		
		d1.manage().window().maximize();
		// switch to frame
		d1.switchTo().frame(0);
		// using send keys method
	//	d1.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("17/10/2024");   // mm/yy/yyyy
		
		// method 2 using datepicker element
		// expected data
		String year = "2023";
		String month = "April";
		String day = "12";   // always take string because in the web application everything is in string
		d1.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
		
		selectmonthandyear( );
		
	
	}
}
