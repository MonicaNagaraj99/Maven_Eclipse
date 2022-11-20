package testNG;

import org.testng.annotations.Test;

public class Retry_Runner {
 
	@Test
	private void IOOB() {
       String a ="TestNG";
        a.charAt(6);
	}
	
	@Test(alwaysRun = true ,
			expectedExceptions = IndexOutOfBoundsException.class )
	private void exception() {
		   String a ="TestNG";
	        a.charAt(3);
	}
}
