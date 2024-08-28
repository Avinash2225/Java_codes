package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickSbi {

	public static void main(String[] args) {

		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d1.manage().window().maximize();		
	
		
	//	d1.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook" + Keys.ENTER);
		d1.findElement(By.partialLinkText("CONTINUE")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
	}

}
