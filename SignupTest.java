package testngdependency;

import org.testng.annotations.Test;

public class SignupTest {

	@Test (priority=1, groups= {"regression"})
	
	void signubyemail() {
		System.out.println("this is signup by email");
	}
	@Test (priority=2 , groups= {"regression"})

	void signubyfacebook() {
		System.out.println("this is signup by email");
	}
	@Test (priority=3,  groups= {"regression"})

	void signubygmail() {
		System.out.println("this is signup by email");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
