package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Utility implements IRetryAnalyzer{

	int startingPoint = 1;
	int endingPoint = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (startingPoint<=endingPoint) {
			 startingPoint++;
			 return true;
		}
		return false;
	}
     
	
}
