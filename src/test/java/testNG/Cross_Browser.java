package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class Cross_Browser {

	public static WebDriver driver;
	
	@Test
	private void fb() {
		driver= BaseClass_WebElements.browser("chrome");
    driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void ig() {
		driver= BaseClass_WebElements.browser("edge");
   driver.get("https://www.instagram.com/");
	}
}
