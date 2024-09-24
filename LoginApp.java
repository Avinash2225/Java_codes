package TestNgPrograms;

import org.testng.annotations.Test;

public class LoginApp {

	@Test (priority=1)
public void homepage() {
		System.out.println("User is redirects to homepage");
	}
	@Test (priority=2)
	public void login() {
		System.out.println("user is login in the application");
	
	
}
	@Test (priority=3)
	public void logout() {
		System.out.println("user is login in the application");
	
	
}	

}