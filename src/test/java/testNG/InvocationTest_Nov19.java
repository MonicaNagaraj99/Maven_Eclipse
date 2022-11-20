package testNG;

import org.testng.annotations.Test;

public class InvocationTest_Nov19 {

	@Test(priority = 0, invocationCount = 2)
	private void refresh() {
		String a = "testNG";
	    a.charAt(6);
      System.out.println("Success");
	}
	
}
