package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// first frame
	WebElement e1 =	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(e1); // pass frame as a web element // switch to frame 1
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
// go to default frame
	driver.switchTo().defaultContent();
	// second frame
	
	WebElement e2 =	driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

	driver.switchTo().frame(e2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Avinash yadav");
	
	//frame3
	
	WebElement e3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(e3);
	
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
	
	// inner iframe 
	
	driver.switchTo().frame(0);  // switching to the frame using index
	
	driver.findElement(By.xpath("//div[@id='i8']//div[@class='rseUEf nQOrEb']")).click();
	
	driver.switchTo().defaultContent();
	
	
	}

}
