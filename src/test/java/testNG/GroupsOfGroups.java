package testNG;

import org.testng.annotations.Test;

public class GroupsOfGroups {

		@Test(groups = "Laptop")
		private void Lenova() {
			System.out.println("LENOVA");
		}

		@Test(groups = "Laptop")
		private void hp() {
			System.out.println("HP");
		}

		@Test(groups = "Mobiles")
		private void samsung() {
			System.out.println("SAMSUNG");
		}

		@Test(groups = "Mobiles")
		private void iphone() {
			System.out.println("IPHONE");
		}
		
		@Test(groups = "Bikes")
		private void re() {
			System.out.println("Royal Enfield");
		}
		
		@Test(groups = "Bikes")
		private void rx() {
			System.out.println("RX100");
		}
	}	

