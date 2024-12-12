package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver(); // if we create chromedriver class then we no need to typecast
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// full page screen shot
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		
		ts.getScreenshotAs(OutputType.FILE);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("C:\\Users\\avina\\OneDrive\\Desktop\\Work space\\Seleniumproject1\\screenshot2.png");
		
		FileUtils.copyFile(src, trg);
		
		driver.close();
		//img[@alt='nopCommerce demo store']
	}

}
