package nevigationalcommands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevgation2 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://opensource-demo.orangehrmlive.com/auth/login");
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	Set<String>	wndowid = d1.getWindowHandles();
	
	// approach 1 better to convet set into list if you have 1 or 2 browser window
	
/*	List<String> windowlist = new ArrayList(wndowid);
	String parentId = windowlist.get(0);
	String childId = windowlist.get(1);

//	System.out.println(d1.getTitle());
	
	d1.switchTo().window(childId);
	System.out.println(d1.getTitle());
	*/
	
	// approach 2 by looping statements if multiple windows then go with this approach
	
	for(String winId:wndowid) {
		String title = d1.switchTo().window(winId).getTitle();
		if(title.equals("OrangeHRM")) {
			System.out.println(d1.getCurrentUrl());
			// some validations on the parent window
			
		}else {
			System.out.println(d1.getCurrentUrl());
			
			
			
			
		}
	}
	
	
	
	
	
	
	
	
		
	}

}
