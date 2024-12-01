package javascriptalert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptalert1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	// alert window ok button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
	}

}
