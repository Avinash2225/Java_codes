package keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.manage().window().maximize();
		
		d1.get("https://text-compare.com/");
		
		WebElement e1 = d1.findElement(By.xpath("//textarea[@class='inputText']"));
		
		e1.sendKeys("welcome to selenium");
		
		Actions act = new Actions(d1);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		// ctrl +c   copy the text into clipped

		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		//ctrl+v   past the text

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// ctrl+a   select the text

		Thread.sleep(4000);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

		// if we have 3 keys like ctrl+shift+A
	//	then we can act.keys.down(keys.control).keys.down(keys.shift).sendkeys("A").keyup(keys.shift).keyup(keys.control).perform();	
	// suppose if we want to press enter only act.keydown(keys.enter).keyup(keys.enter).perform();
	}

}
