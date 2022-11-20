package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.BaseClass_WebElements;

public class Assert {

	public static WebDriver driver = BaseClass_WebElements.browser("chrome");

	@Test
	private void HardAssert() throws InterruptedException {
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		String expected_title = "Facebook – log in or  up";
		String currentUrl = driver.getCurrentUrl();
		String URL= "https://www.facebook.com/";
		
		org.testng.Assert.assertEquals(title, expected_title);
		org.testng.Assert.assertEquals(currentUrl, URL);
		
		System.out.println("Validation Success");
	}
	
	@Test
	private void SoftAssert() {
       int a = 10;
       int b = 2*7;
       
       org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
	 
       sa.assertEquals(a, b);
       
       System.out.println("Verification Success");
	
	  sa.assertAll();
	}
}
