package automationseleniumcoverfox;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		
		boolean Male = driver.findElement(By.xpath("//button[text()='Get Started']")).isDisplayed();
		//boolean Male = driver.findElement(By.
				System.out.println(Male);
		
				
	  Assert.assertTrue(Male, "If button displayed, test failed");
		
		
	}                          
}
