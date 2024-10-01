package handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver d1 = new ChromeDriver();
d1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d1.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
	Alert a2 =	d1.switchTo().alert();
		
		a2.sendKeys("welcome");
		a2.accept();
		
		
		
	}

}
