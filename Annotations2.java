package testnhannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {

	
	@BeforeClass
	void login() {
		System.out.println("please login");
	}
	
	@AfterClass
	void logout() {
		System.out.println("click on the logout button");

	}
	
	
	@Test
	void Registration() {
		System.out.println("click on the registration");

	}
	@Test
	void search() {
		System.out.println("click on the search");

	}
	@Test
	void addtocart() {
		System.out.println("click on the add to cart");

	}
	
	
	
	
	
	
}