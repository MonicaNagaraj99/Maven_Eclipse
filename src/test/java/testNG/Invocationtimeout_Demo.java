package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class Invocationtimeout_Demo {

public static WebDriver driver = BaseClass_WebElements.browser("chrome");
	
	@Test(priority = -1)
	private void getUrl() {
     driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 0, invocationCount = 2 ,invocationTimeOut = 2000)
	private void refresh() {
      driver.navigate().refresh();
	}
	
	@Test(priority = 1)
	private void credentials() {
       driver.findElement(By.id("email")).sendKeys("ABC");
       driver.findElement(By.id("pass")).sendKeys("ABC");
	}
	
	@Test(priority = 2 , invocationCount = 1 , invocationTimeOut = 1000)
	private void login() {
       driver.findElement(By.name("login")).click();
	}
}
