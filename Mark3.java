package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Mark3 extends Mark2 {

	@AfterTest
	public void Searching() {
		WebElement e1 = d1.findElement(By.id("twotabsearchtextbox"));
				e1.sendKeys("mobile" + Keys.ENTER);
		WebElement e2 = d1.findElement(By.xpath("[//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"));
	e2.click();
	}
	
	
	
}
