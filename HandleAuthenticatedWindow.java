package handlingalerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d1 = new ChromeDriver();
	//	d1.get("https://the-internet.herokuapp.com/basic_auth");
		d1.get("http//admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
