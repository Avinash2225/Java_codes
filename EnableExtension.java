package headlesstestcaserun;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {

	public static void main(String[] args) {

		// 1. Add CRX Extractor/downloader to chrome browser (manually)
		// 2. Add selectorhub plugin to chrome browser (manually)
		// 3. Capture crx file for selectorhub extension
		// 4. press crx file path in automation script in Chrome options
		
		ChromeOptions options = new ChromeOptions();

		ChromeDriver d2 =new ChromeDriver(options);
		File file = new File("C:\\Users\\avina\\OneDrive\\Desktop\\SeleniumScreenShots\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
				//EdgeDriver d3 = new EdgeDriver();
		options.addExtensions(file);
		
		d2.get("https://text-compare.com/");
		// Enable browser extensions in the run time
		//  		ChromeDriver d2 =new ChromeDriver(options);
// how to block adds on the page
		//  u-Blocker-Origin
		// AdBlocker
		
		
	}

}
