package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticate_Alert {

	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
	
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 
	driver.manage().window().maximize();
	 
	 }
}
