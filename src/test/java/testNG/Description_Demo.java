package testNG;


import org.testng.annotations.Test;

public class Description_Demo {
	
	@Test(description = "NAME")
	private void name() {
		System.out.println("Nila");
	}
	@Test(description = "AGE")
	private void age() {
		System.out.println("30");
	}
}
