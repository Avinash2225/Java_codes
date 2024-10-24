package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotofspecificsection1 {

	public static void main(String[] args) {

ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.manage().window().maximize();
		d1.get("https://www.makemytrip.com/");
		
WebElement	smallpart =	d1.findElement(By.xpath("//div[@class='minContainer']"));

 File Src = smallpart.getScreenshotAs(OutputType.FILE);
 
 File target = new File (System.getProperty("user.dlr")+ "\\C:\\Users\\avina\\OneDrive\\Desktop\\screen.png");
		
		Src.renameTo(target); // copy source file to target file
		
		
		
		
		
		
		
	}

}
