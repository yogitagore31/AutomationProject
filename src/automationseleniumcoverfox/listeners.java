package automationseleniumcoverfox;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(automationseleniumcoverfox.Listenerclass.class)

public class listeners {
	
  @Test
  public void f() {
	  
	  //Assert.fail();
	  Reporter.log("skip print", true);
	  
//	  
//	  WebDriver driver = new ChromeDriver();
//		driver.get("https://www.coverfox.com/");
//		
//		boolean Male = driver.findElement(By.xpath("//button[text()='Get Started']")).isDisplayed();
//		//boolean Male = driver.findElement(By.
//				System.out.println(Male);
	  
  }
  

}
