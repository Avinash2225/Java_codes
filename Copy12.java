package TestNgPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copy12 {

	
	
	/*public void Method1() {
		System.out.println("test cases1");
	}
	@Test
	public void Method2() {
		System.out.println("test cases31");

	}*/
	@BeforeSuite
public void Method334() {
		System.out.println("test af cases16");
	}
		@BeforeTest
		public void Method23() {
				System.out.println("test af cases16");
		}
				@BeforeClass
				public void Method43() {
						System.out.println("test af cases16");
				}
						@BeforeMethod
						public void Method33() {
								System.out.println("test af cases16");
						}
								
								@Test
								
								@AfterSuite
								public void Method34() {
										System.out.println("test cases16");
									}
										@AfterTest
										public void Method233() {
												System.out.println("test cases16");
										}
												@AfterClass
												public void Method433() {
														System.out.println("test cases16");
												}
														@AfterMethod
														public void Method333() {
																System.out.println("test cases16");



	}
	
	}
