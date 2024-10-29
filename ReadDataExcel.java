package readingdatafromexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File ---->---workbook-->--- sheets--->--Rows---cells

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
// open excel file  in reading mode
		FileInputStream f1 = new FileInputStream("C:\\Resume\\Testingdata.xlsx");
		// extract workbook from from this particular file
		XSSFWorkbook w1 = new XSSFWorkbook(f1);
		
		// how to extract sheet from workbook
		
	XSSFSheet s1 =	w1.getSheet("Sheet1");
		
// 	XSSFSheet s2 =	w1.getSheetIndex(0); optional method
int totalrows =	s1.getLastRowNum();
	// now we are going to extract rows
	//XSSFRow r1 = new XSSFRow();

int totalnocells =		s1.getRow(1).getLastCellNum();
		
		System.out.println("no of the rows :" + totalrows);
		System.out.println("no of the rows :" + totalnocells);

		for (int r=0; r<=totalrows; r++) {  // this is important
			
		XSSFRow	currentrow = s1.getRow(r);
			for(int c=0; c<=totalnocells; c++) {
			
			XSSFCell cell =	currentrow.getCell(c)	;
			System.out.println(cell.toString());
			
			}
		}
		w1.close();
		f1.close();
		
	}

}
