package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mark1 extends Mark2 {
	@Test
	public void login_searching() {
		
	WebElement e1 = d1.findElement(By.id("twotabsearchtextbox"))	;
		
	e1.sendKeys("Mobile" + Keys.ENTER);
	
	
	}

}
