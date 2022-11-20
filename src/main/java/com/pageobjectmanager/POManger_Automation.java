package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.automation.Casualdress;
import com.pom.automation.Confirmation;
import com.pom.automation.Eveningdress;
import com.pom.automation.Home_page;
import com.pom.automation.Login;
import com.pom.automation.Order;
import com.pom.automation.SummerDress;

public class POManger_Automation {
  
	public WebDriver driver;
	
	public POManger_Automation(WebDriver driver) {
		this.driver = driver;
		
	}
	private Login login;
	private Home_page home;
	private Eveningdress evedress; 
	private Order order;
	private Confirmation confirm;
	private Casualdress casualdress;
    private SummerDress summerdress;
    
	public Login getLogin() {
		
		if (login== null) {
			login = new Login(driver);
		}
		return login;
	}

	public Home_page getHome() {
		
		if (home == null) {
			home = new Home_page(driver);
		}
		return home;
	}
	public Eveningdress getEveningdress() {
		
		if (evedress== null) {
			evedress = new Eveningdress(driver);
	}
		return evedress;

	}
     public Casualdress getCasualdress() {
		
		if (casualdress== null) {
			casualdress = new Casualdress(driver);
	}
		return casualdress;

	}
     
     public SummerDress getSummerDress() {
 		
 		if (summerdress== null) {
 			summerdress = new SummerDress(driver);
 	}
 		return summerdress;

 	}
	
	public Order getOrder() {
		
		if (order== null) {
			order = new Order(driver);
	}
		return order;
	}

	public Confirmation getConfirmation() {
		
		if (confirm== null) {
			confirm = new Confirmation(driver);
	}
		return confirm;
	}

}

