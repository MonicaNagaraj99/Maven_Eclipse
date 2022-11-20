package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Utility {

	@DataProvider
	private String[][] Values() {
		String values[][] = {
				{ "monica", "12345" }, 
				{ "indhu", "09876" } };
		return values;
	}

	@DataProvider
	private Object[][] value_student() {
		Object values[][] = { 
				{ 15, "biology" }, 
				{ 16, "maths" } };
		return values;
	}

	@Test(dataProvider = "Values")
	private void login(String username, String Password) {
		System.out.println("username :" + username);
		System.out.println("password :" + Password);
	}
	
	@DataProvider
	@Test
	private String[][] Adactindate() {
		
			String values[][] = {
					{ "01/01/2023", "03/01/2023" }, 
					{ "03/01/2023", "05/01/2023" } };
			return values;
	}
}
