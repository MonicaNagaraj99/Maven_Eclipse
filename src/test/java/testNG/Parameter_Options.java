package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Options {

	@Parameters({ "name", "agEEe" })
	@Test
	public void studentProfile(String name , String age ) {
		System.out.println("Student name :" + name);
		System.out.println("Student age :" + age);
	}

	@Parameters({ "spooort" })
	@Test
	public void sports(@Optional("Volley")String sport) {
		System.out.println("Sport :" + sport);
	}
}
