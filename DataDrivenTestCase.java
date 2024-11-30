package readingdatafromexcel;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {

	//	1. Functionality (test case)
//      2. Prepare test data in excel 
//      3. develop automation script
		
	// i have some fixed deposit calculator
		
		WebDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.manage().window().maximize();
		d1.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		
		//String filepath = System.getProperty("user.dir") + "\"C:\\Users\\avina\\OneDrive\\Desktop\\Testing Notes\\Pictures\\DataDrivenExcel1.xlsx";
		String filepath =  "C:\\Users\\avina\\OneDrive\\Desktop\\Testing Notes\\Pictures\\DataDrivenExcel1.xlsx";

		// here we are Creating String because of we need to pass file path in every utility method
		
	int rows =	ExcelUtility2.getRowCount(filepath, "Sheet1");
	       
	for(int i=1; i<=rows; i++) {
		// read data from excel
		// pass above data into application
		// validation
		// these three will repeat every time
		
		// 1 Read data from Excel sheet
	String pric =	ExcelUtility2.getCellData(filepath, "Sheet1", i, 0);
	String rateofinterest =	ExcelUtility2.getCellData(filepath, "Sheet1", i, 1);
	String period =	ExcelUtility2.getCellData(filepath, "Sheet1", i, 2);
	String per2 =	ExcelUtility2.getCellData(filepath, "Sheet1", i, 3);
	String fre =	ExcelUtility2.getCellData(filepath, "Sheet1", i, 4);

	String expmatvalue = ExcelUtility2.getCellData(filepath, "Sheet1", i, 5);
	
	// 2 pass the above data into application
	
	d1.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
	d1.findElement(By.xpath("//input[@id='interest']")).sendKeys("rateofinterest");
	d1.findElement(By.xpath("//input[@id='tenure']")).sendKeys("period");
	
	Select perdrp = new Select(d1.findElement(By.xpath("//select[@id='tenurePeriod']")));
		
	perdrp.deselectByVisibleText(per2);
	
	Select fredrp = new Select(d1.findElement(By.xpath("//select[@id='frequency']")));
	
	fredrp.deselectByVisibleText(fre);
	d1.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
	
	// validation
	String actmvalue =d1.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
	Thread.sleep(5000);
	if(Double.parseDouble(expmatvalue)==Double.parseDouble(actmvalue)) 
	{
	System.out.println("Test is passed");
	ExcelUtility2.setCellData(filepath, "Sheet1", i, 7, "Passed");
	
	ExcelUtility2.fillGreenColor(filepath, "Sheet1", i, 7);
	
	Thread.sleep(5000);

	}else {
		System.out.println("Test is Failed");
		ExcelUtility2.setCellData(filepath, "Sheet1", i, 7, "Failed");
		
		ExcelUtility2.filledRedColore(filepath, "Sheet1", i, 7);
		
		
	}
	d1.findElement(By.xpath("//img[@class='PL5']")).click();
	
	}

d1.quit();

	}
	
}




