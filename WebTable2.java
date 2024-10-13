package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
	
		d1.get("https://testautomationpractice.blogspot.com/");
		
	//	d1.findElements(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		// System.out.println(bookname);   // Master in the selenium
		
		// read data from all the rows and columns
		// for this we will use for loop one inner for loop and one outer for loop
		System.out.println("BookName"+ "\t"+ "Author"+ "\t"+ "Subject"+ "\t"+ "Price");
	//	for(int r=2; r<=rows; r++) {
	//		for(int c=1 ; c<=colms; c++){
				//	d1.findElements(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
				// for dynamic  x path we can write like this way 
				// 				//	d1.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"])).getText();
//                   System.out.println(value"\t");
	//		}
		// print book author name
	//for (int r=2; r<=rows; r++) {
		// 				// String aurhor name =	d1.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"])).getText();
//       System.out.println(Authorname);  this is not our requriment
		// if(Authorname ="Mukesh"){
		// 				// String Bookname =	d1.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1])).getText();
		//          System.out.println(bookname+"\t" +authorname);
		// \t is representing tab space
// find total price of the book
		// get text method always returns string formet
	//	int total = 0;
	//	for (int r=2; r<=rows; r++) {
			// 				// String Bookname =	d1.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1])).getText();
//	total = total +Integer.parseInt(null, 0)p	
	
	
	}
	}
		
		
		
	

