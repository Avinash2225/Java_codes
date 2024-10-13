package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonxpathByText {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.findElements(By.xpath("//h2[text()=[' Shopping Cart'  ]"));
		
		
		
		
		
		
	}

}
