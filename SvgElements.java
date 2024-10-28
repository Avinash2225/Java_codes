package shadowdom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElements {

	public static void main(String[] args) {
// name is the method we can access svg elements
		// spath is not for svg elements
		
// name is the only by which we can locate svg elements
		
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		d1.findElement(By.xpath("//button[@type='submit']")).click();
		
		//abs xpath
		d1.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();

		
		
		
		
		
		
		
	}

}
