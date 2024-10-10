package testngdependency;

import org.testng.annotations.Test;

public class PaymentMethod1 {
	
	@Test(priority=1, groups= {"regression","Sanity"})
	
	void Payemntinrupees() {
		System.out.println("this accepts payments in rupees");
	}
	@Test(priority=2 , groups= {"regression","Sanity"})

	void Payemntinusd() {
		System.out.println("this accepts payments in usd");
	}
	
	
	
}
