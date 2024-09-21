package TestNgPrograms;

import org.testng.annotations.Test;

public class TestngGrouping {

	@Test (groups= {"smoke"})
	public void Test1() {
		
	}
	
	@Test (groups= {"smoke"})
	public void Tes21() {
		
	}
	
	@Test (groups= {"smoke"})
	public void Test3() {
		
	}
	
	@Test (groups= {"system"})
	public void Test4() {
		
	}
	
	@Test (groups= {"unit"})
	public void Test5() {
		
	}

	@Test(groups= {"integration"})
	public void Test6() {
		
	}
	
}
