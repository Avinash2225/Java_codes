package testngdependency;

import org.testng.annotations.Test;

public class LoginTests {

	
	@Test (priority=1)
	void loginbyemail() {
		System.out.println("this is login by email");
	}

@Test (priority=2)
void loginbyfacebook() {
	System.out.println("this is login by facebook");

}

@Test (priority=3)
void loginbygmail() {
	System.out.println("this is login by gmail");

}
}