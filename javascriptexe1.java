package javascriptexecuator12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexe1 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://www.amazon.in/");
		
	WebElement e1 =	d1.findElement(null);
	
//	JavascriptExecuter js = (JavascriptExecuter)d1
//JavaScriptExecuter js = d1;

//	js.executescript(arguments[0].setAttribute(value, john));
	
	// click on the element - alternate of click
//	js.executeScript("argument[0]".click()"", radiobtn);
	
	
		
		
		// whenever you are getting element intercepted exception
		
		
		
		
	}

}
