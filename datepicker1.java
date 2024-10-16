package datepickersandcalenders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker1 {

	public static void main(String[] args) throws InterruptedException {
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
		String month = "10";
		String day = "12";   // always take string because in the web application everything is in string
		d1.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
		
		// select month and year 
		while(true) {
	String cm =		d1.findElement(By.xpath("//input[id='datepicker']")).getText();   // actual  month from datepicker
			String year1 = d1.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual month from datepicker
			
			if(cm.equals(month) && cm.equals(year));
			{
				break; 
			}
		
		Thread.sleep(4000);
	//	d1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    // Next 			
		d1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w]")).click();  // previous
	
		}
	
	//select date 
	
	
	
			
}


}
