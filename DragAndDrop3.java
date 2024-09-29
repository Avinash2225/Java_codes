package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		d1.manage().window().maximize();
		
		WebElement stockhome  = d1.findElement(By.xpath("//div[@id='box2']"));
		WebElement  Denmark = d1.findElement(By.xpath("//div[@id='box104']"));

		Actions a1 = new Actions(d1);
		a1.dragAndDrop(stockhome, Denmark).perform();
		
		
	}

}
