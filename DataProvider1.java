package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	// DataProvider 1
	
	@DataProvider (name= "LoginData")
	public String[][] getData() throws IOException{
		String path = ".\\Opencart121\\testdata\\datadrivenopencart.xlsx"; // taking excel file from test data
		
		ExcelUtility xlutil = new ExcelUtility(path); // creating an object for xl utility
		
		int totalrows = xlutil.getRowCount("sheet1");
		int totalcols = xlutil.getCellCount("sheet1", 1);
		
		String logindata [] [] = new String [totalrows] [totalcols]; // created for two dimension array which can store 
		for(int i=0; i<=totalrows; i++) // 1 // read data from xl storing in two dimensional array
		{
			for (int j=0; j<totalcols; j++)  // 0 i is rows j is column
			{
				logindata[i-1] [j] = xlutil.getCellData("sheet1", i, j);  // 1,0
			}
		}
		return logindata; // returning  two dimensional array
	}
	
	
	
	
	
	
	

}
