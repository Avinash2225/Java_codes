package headlesstestcaserun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HeadLess1 {

	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless=new");    //)
		ChromeDriver d2 =new ChromeDriver();
	
			//EdgeDriver d3 = new EdgeDriver();
			d2.get("https://www.amazon.in/");
			d2.manage().window().maximize();
			WebElement b1 = d2.findElement(By.linkText("Best Sellers"));
			
			b1.click();
			
	}

}
