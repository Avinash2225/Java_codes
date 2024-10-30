package readingdatafromexcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataSpecificRowAndCell {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfilerandom.xlsx"); //create an file 

		XSSFWorkbook w1 = new XSSFWorkbook();
		
		XSSFSheet s1 = w1.createSheet("data");
		
		XSSFRow row3 =s1.createRow(3);
		
	XSSFCell cell =	row3.createCell(4);
		
		cell.setCellValue("Welcome");
		
		
		
		
		w1.write(file);   // attach workbook to the file
		  w1.close();
		  file.close();
		  System.out.println("file is created");
		
		
		
		
		
		
		
		
		
	}

}
