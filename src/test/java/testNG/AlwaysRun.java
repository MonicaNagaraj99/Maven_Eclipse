package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class AlwaysRun {
		 
		public static WebDriver driver = BaseClass_WebElements.browser("chrome");
		
		@Test(priority = 0)
		private void getUrl() {
	     driver.get("https://www.facebook.com/");
		}
		
		@Test(priority = 1)
		private void username() {
	       driver.findElement(By.id("emaail")).sendKeys("ABC");
		}
		
		@Test(dependsOnMethods = "username" , alwaysRun = true )
		private void password() {
		     driver.findElement(By.id("pass")).sendKeys("ABC");
		}
		
		@Test(dependsOnMethods = "username" , alwaysRun = false)
		private void login() {
		     driver.findElement(By.name("login")).click();
		}
}
