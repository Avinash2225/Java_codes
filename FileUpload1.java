package fileupload1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) {

		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		// single upload
		
		d1.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\avina\\OneDrive\\Desktop\\Github_for_Java\\Java_codes\\Day9");
		
		// now after uploading how you can validate
		if(d1.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Day9"))
		
		{
			System.out.println("file is uploaded successfully");
		}
		else
		{
			
			System.out.println("upload failed");
		}
		
	
	}

}
