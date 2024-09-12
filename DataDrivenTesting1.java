package TestNgPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting1 {

	@Test(dataProvider= "data1")
	public void Method2(int input) {
		System.out.println(input);
	}
	
	
	@DataProvider(name="data1")
	public Object[ ][] datainput(){
		
		return new Object [] []  {{12},{23},{33},{89},{90}};
	}
}
