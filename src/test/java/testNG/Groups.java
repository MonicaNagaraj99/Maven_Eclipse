package testNG;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "Laptop")
	private void Lenova() {
		System.out.println("LENOVA");
	}

	@Test(groups = "Laptop")
	private void hp() {
		System.out.println("HP");
	}

	@Test(groups = "Laptop")
	private void acer() {
		System.out.println("ACER");
	}

	@Test(groups = "Mobiles")
	private void samsung() {
		System.out.println("SAMSUNG");
	}

	@Test(groups = "Mobiles")
	private void iphone() {
		System.out.println("IPHONE");
	}
}
