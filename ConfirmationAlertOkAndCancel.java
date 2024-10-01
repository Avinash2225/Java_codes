package handlingalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertOkAndCancel {

	public static void main(String[] args) throws InterruptedException {
// cofirmationalert ok and cancel button
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); // after x path write .click to open alert
		
		Thread.sleep(5000);
		// using ok button
		//d1.switchTo().alert().accept();
		
		// using cancel button
		d1.switchTo().alert().dismiss();
		
	}

}
