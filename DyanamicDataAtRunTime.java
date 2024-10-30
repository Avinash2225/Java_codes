package readingdatafromexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DyanamicDataAtRunTime {

	public static void main(String[] args) throws IOException {
// writing dynamic data into Excel
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile1.xlsx"); //create an file 

		XSSFWorkbook w1 = new XSSFWorkbook();
		
		XSSFSheet s1 = w1.createSheet("dynamic sheet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows dynamically");
		int noofrows = sc.nextInt();
		
		System.out.println("Enter the how many cells");
		
		int noofcells = sc.nextInt();
		
		for(int r=0; r<=noofrows; r++) {                    // creating rows outer for loop
		XSSFRow r1= s1.createRow(r);
			for(int c=0; c<= noofcells; c++)
			{
			XSSFCell c1 = r1.createCell(c);	
			c1.setCellValue(sc.next());  // user can enter anything no, boolean, string
			
			w1.write(file);   // attach workbook to the file
			  w1.close();
			  file.close();
			  System.out.println("file is created");
			
			}
	}

	}
}
