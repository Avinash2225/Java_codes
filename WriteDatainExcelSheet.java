package readingdatafromexcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcelSheet {

	public static void main(String[] args) throws IOException {

		//FileOutputStream file = new FileOutputStream("C:\\Users\\avina\\OneDrive\\Desktop\\SeleniumScreenShots\\writinginFile.xlsx");

		
		
		XSSFWorkbook w1 = new XSSFWorkbook();
		
XSSFSheet s1	=	w1.createSheet("data1");  // create an writing mode file
		
		XSSFRow row1 = s1.createRow(0);      
		
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("to the");
		row1.createCell(2).setCellValue("Automation course");

XSSFRow row2 = s1.createRow(0);
		
		row2.createCell(0).setCellValue("Welcome");
		row2.createCell(2).setCellValue("to the");
		row2.createCell(3).setCellValue("Automation Testng");

	//	XSSFCell cell = w1.createCellStyle()
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx"); //create an file 

		w1.write(file);
		
		w1.close();
		
		file.close();
		
		System.out.println("file is created");
		
		
	}

}
