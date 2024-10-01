package handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlertwithOkbutton {

	public static void main(String[] args) throws InterruptedException {

	ChromeDriver d1 = new ChromeDriver();
	
		d1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d1.manage().window().maximize();
		// normal alert with ok button
		d1.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
Alert a1 =  d1.switchTo().alert();
		// switch to alert and then calling accept method
		System.out.println(a1.getText());
		a1.accept();
		
	}

}
