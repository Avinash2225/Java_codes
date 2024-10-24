package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public  class screenshots {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.manage().window().maximize();
		d1.get("https://www.makemytrip.com/");
		
		// full page screenshots
		
		TakesScreenshot ts = d1;
	File sourcefile=	ts.getScreenshotAs(OutputType.FILE);
		
		
		File targetfile = new File(System.getProperty("user.dir")+"\\SeleniumProject\\ScreenShots\\store.png");
		sourcefile.renameTo(targetfile); // copy source file
		
		// this is approach is not useful in the real times projects
		
		
	}

}
