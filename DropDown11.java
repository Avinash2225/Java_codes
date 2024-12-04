package seleniumdropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown11 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement drpdownEle = driver.findElement(By.id("searchDropdownBox"));
		
		Select drpdown = new Select(drpdownEle);
		Thread.sleep(3000);
		drpdown.selectByVisibleText("Amazon Fresh");
	}

}
