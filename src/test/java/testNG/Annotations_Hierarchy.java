package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Hierarchy {
 
	@BeforeSuite
	private void beforeSuite() {
      System.out.println("order 1");
	}
	@BeforeTest
	private void beforeTest() {
      System.out.println("order 2");
	}
	@BeforeClass
	private void beforeClass() {
      System.out.println("order 3");
	}
	@BeforeMethod
	private void beforeMethod() {
      System.out.println("order 4");
	}
	@Test
	private void test() {
	      System.out.println("order 5");
		}
	@AfterMethod
	private void afterMethod() {
      System.out.println("order 6");
	}
	@AfterClass
	private void afterClass() {
      System.out.println("order 7");
	}
	@AfterTest
	private void afterTest() {
      System.out.println("order 8");
	}
	@AfterSuite
	private void afterSuite() {
	      System.out.println("order 9");
		}
	
	
}
