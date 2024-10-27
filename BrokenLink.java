package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// link href = "https://xyz.com"
// https:// xyz.com-- > server --> status code
// status code < 400 not a broken link
public class BrokenLink {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.get("http://www.deadlinkcity.com/");
		d1.manage().window().maximize();
		// capture all links from webapplication
List<WebElement> e1 =	d1.findElements(By.tagName("a"));
				
		System.out.println("List of the links present:"+ e1.size());
		
		
		int noofbrokenlinks = 0;
		for(WebElement linkElement: e1) {
			String hrefattvalue = linkElement.getAttribute("href");
			if(hrefattvalue== null || hrefattvalue.isEmpty()) {
				System.out.println("href attribute value is null or empty so not possible to check");
				continue;
				try {
				@SuppressWarnings("deprecation")
				URL linkURL = new URL ("hrefattvalue") // converted href value from string to URL formet
			HttpURLConnection conn =  (HttpURLConnection) linkURL.openConnection(); // open connection to server
			conn.connect(); // connect to server and sent request to server
				if(conn.getResponseCode()>=400) {
				System.out.println("link is broken link");
			}else {
				System.out.println("Not a broken link");
			}
			
			}
				catch(Exception e) {
					
				}
			}
		}
		System.out.println("No of the broken links:"+ noofbrokenlinks );
	}	
}	
		
		
		
	

