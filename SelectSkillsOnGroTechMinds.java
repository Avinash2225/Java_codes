package Day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSkillsOnGroTechMinds {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://grotechminds.com/registration/");
		d1.manage().window().maximize();
		WebElement e1 = d1.findElement(By.name("Skills"));
		
		Select s1 = new Select(e1);  // iska use kar ke we can select any option from the dropdown
		//s1.selectByIndex(1);
		s1.selectByValue("select2");
	}

}
