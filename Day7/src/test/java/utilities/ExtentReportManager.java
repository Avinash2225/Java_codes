package utilities;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	
	
	String repName;
	public void onStart(ITestContext testContext) {
		
		SimpleDateFormet df = new SimpleDateFormet("yyyy.MM.dd.HH.mm.ss");
		 * Date dt = new date();
		 * String currentdatestamp = df.formet(dt);
		 
	String timeStamp = new SimpleDateFormet("yyyy.MM.dd.HH.mm.ss").formet(new Date()); 
		
	repName = "Test-Report-" + timeStamp + ".html";
	sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);  // specify location of the
	
		sparkReporter.config().setDocumentTitle("Opencart Automation Report");  // Test title of the Report
		sparkReporter.config().setDocumentTitle("Opencart Functional Testing Report"); 
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter("sparkReporter");
		extent.setSystemInfo("Application" , "opencart");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystem.info("Sub Module" , "Customers");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
