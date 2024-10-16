package automationseleniumcoverfox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void g()
	
{String a="Velocity";
String b="Velocity";

Assert.assertNotEquals(a, b, "If both matches, test fail's");
}
	
	@Test
	public void k() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		
		boolean Male = driver.findElement(By.xpath("//button[text()='Get Started']")).isDisplayed();
		//boolean Male = driver.findElement(By.
				System.out.println(Male);
		
				
	  Assert.assertFalse(Male, "If button displayed, test failed");
	}
//  @Test
//  public void f() {
//	  
//	  System.out.println("try it");
//	  Reporter.log("try it 1");;
//	  Reporter.log("try it 12");
//	  
//  }
//  
//  //@Test
//  public void newTestf() {
//	  
//	  WebDriver driver=new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://www.google.co.in/");
	  
  }
  

