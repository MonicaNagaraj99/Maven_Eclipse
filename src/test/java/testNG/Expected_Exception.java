package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class Expected_Exception {
public static WebDriver driver = BaseClass_WebElements.browser("chrome");
	
	@Test(priority = -1)
	private void getUrl() {
     driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 0)
	private void refresh() {
      driver.navigate().refresh();
	}
	
	@Test(priority = 1 ,expectedExceptions = NoSuchElementException.class)
	private void credentials()  {
		
       driver.findElement(By.id("emaail")).sendKeys("ABC");
       driver.findElement(By.id("pass")).sendKeys("ABC");
	}
}
