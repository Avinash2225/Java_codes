package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
ChromeDriver d2 = new ChromeDriver();
d2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

d2.get("https://testautomationpractice.blogspot.com/");
d2.manage().window().maximize();


 // int rows = d2.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // if multiple tables are present on the webpage
//int rows = d2.findElements(By.tagName("tr")).size(); // if single table present on the table

//System.out.println("no of the rows:"+ rows); // 
// //table[@name='BookTable']//tr

// 2 find total number of the columns in the table

int col = d2.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // if multiple table present on the webpage

System.out.println("no of the col:"+ col);

	}

}
