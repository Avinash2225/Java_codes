package BrowserDay41;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();
		FirefoxDriver driver2 = new 		FirefoxDriver ();
		ChromeDriver driver3 = new ChromeDriver ();

driver.get("https://www.amazon.in");    // launch the browser bydriver.get
driver2.get("https://www.amazon.in");   
driver3.get("https://www.amazon.in");
  
  // driver.close();  // will closse the parent browser/or tab it closes that browser that has the control
   driver.quit();        // will close the parent and child browser tab
   driver2.quit();
   driver3.quit();

   System.out.println();
   
   //Thread.sleep(3000);
		

	
	}
	

}
