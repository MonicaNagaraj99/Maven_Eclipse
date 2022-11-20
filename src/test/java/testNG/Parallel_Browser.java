package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class Parallel_Browser {
  
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser() {
      driver= BaseClass_WebElements.browser("Chrome");
	}
	
	@Test
	private void fb() {
      driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void ig() {
      driver.get("https://www.instagram.com/");
	}
}
