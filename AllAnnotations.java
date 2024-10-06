import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void lg() {
		System.out.println("this is before suite1");

	}

	@AfterSuite
	void lg1() {
		System.out.println("this is after suite2");

	}
		
		@BeforeTest
		void lg3 () {
			System.out.println("this is before test1");

		}
		
		@AfterTest
		void lg4 () {
			System.out.println("this is after test2");

		}

@BeforeClass
void lg5() {
	System.out.println("this is before class1");

}

@AfterClass
void lg6() {
	System.out.println("this is after class2");
}

@BeforeMethod
void lg8 () {
	System.out.println("this is before method1");
}

@AfterMethod
void lg9() {
	System.out.println("this is after method2");
}


@Test(priority=1)
void test1() {
	System.out.println("this is test 1");
	
}

@Test (priority=2)
void test2() {
	System.out.println("this is test2");
}

}

