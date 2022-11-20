package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;


public class DependsOnMethods{
 
	public static WebDriver driver = BaseClass_WebElements.browser("chrome");
	
	@Test(priority = 0)
	private void getUrl() {
     driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1)
	private void username() {
       driver.findElement(By.id("emaail")).sendKeys("ABC");
	}
	
	@Test(dependsOnMethods = "username")
	private void password() {
	     driver.findElement(By.id("pass")).sendKeys("ABC");
	}
}
