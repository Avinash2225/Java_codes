package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsExample {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver d1 = new ChromeDriver();

d1.get("https://www.amazon.in/");
d1.manage().window().maximize();
Thread.sleep(4000);
d1.findElement(By.xpath("//a[@class='a-button-text']")).click();
Thread.sleep(5000);
//d1.close();
d1.quit();


	}

}
