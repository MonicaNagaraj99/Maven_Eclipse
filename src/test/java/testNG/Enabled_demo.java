package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled_demo {
 
	@Test
	private void Lenova() {
  System.out.println("LENOVA");
	}
	
	@Test(enabled = false)
	private void hp() {
  System.out.println("HP");
	}
	
	@Test
	private void acer() {
  System.out.println("ACER");
	}
	
	@Ignore
	@Test
	private void samsung() {
  System.out.println("SAMSUNG");
	}
	
}
