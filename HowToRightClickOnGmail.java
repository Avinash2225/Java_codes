package Day46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToRightClickOnGmail {

	public static void main(String[] args) {
ChromeDriver d2 = new ChromeDriver();
d2.get("https://www.google.com");
d2.manage().window().maximize();
WebElement e1 = d2.findElement(By.linkText("Gmail"));

Actions a1 = new Actions(d2);
a1.contextClick(e1).perform();
	}

}
