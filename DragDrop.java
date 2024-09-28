package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {

	ChromeDriver d1 = new ChromeDriver();	
		d1.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		d1.manage().window().maximize();
		
		// WebElement e1  = d1.findElement(By.)
		
				
				Actions Act = new Actions(d1);
		WebElement rome= d1.findElement(By.xpath("//div[@id='box6']"));   // this is a source element 
		WebElement italy =	d1.findElement(By.xpath("//div[@id='box106']"));
		// drag and drop
	Act.dragAndDrop(rome, italy).perform();
	
	}

}
