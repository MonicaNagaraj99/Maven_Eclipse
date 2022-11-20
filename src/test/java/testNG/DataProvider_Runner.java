package testNG;

import org.testng.annotations.Test;

public class DataProvider_Runner {

	@Test(dataProvider = "value_student" , 
			dataProviderClass = DataProvider_Utility.class)
	
	private void StudentData(int age , String subject) {
      System.out.println("Age :"+ age);
      System.out.println("Subject :"+subject);
	}
}
