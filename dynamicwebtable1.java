package dynamicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable1 {


public static void main (String args[]) throws InterruptedException {

	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://demo.opencart.com/admin/");
	d1.manage().window().maximize();
WebElement login =	d1.findElement(By.xpath("//input[@id='input-username']"));
	login.clear();
	login.sendKeys("demo");
	WebElement pwd =	d1.findElement(By.xpath("//input[@id='input-password']"));
	pwd.clear();
	pwd.sendKeys("demo");	
	
	WebElement btn =	d1.findElement(By.xpath("//button[@type='submit']"));
	
	//pwd.clear();
	
Thread.sleep(5000);
	btn.click();	
	
	d1.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	d1.findElement(By.xpath("//a[@class= 'parent collapsed']")).click();
	// s.substring(s.indexof("()+1, s.indexof("Pages")-1) --> 1909  p give the first index -1 it will return the last digit
	// this type of logic you have to apply in your automation scripts
	
	
	
    }
}
