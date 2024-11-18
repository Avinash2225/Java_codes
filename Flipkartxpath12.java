package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartxpath12 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.flipkart.com");
		d1.manage().window().maximize();
	//	d1.findElement(By.xpath("//div[normalize-space()='Best Selling Mobile Speakers']")).click();
	  //   d1.findElement(By.xpath("//div[normalize-space()='Best of Shavers']")).click();
	     d1.findElement(By.xpath("//div[normalize-space()='Top Mirrorless Cameras']")).click();
        
	   
		
	}

}
