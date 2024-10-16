package automationseleniumcoverfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coverfoxpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		//driver.get("https://test.salesforce.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text='Male']")).click();
			
	}
	
	

}
