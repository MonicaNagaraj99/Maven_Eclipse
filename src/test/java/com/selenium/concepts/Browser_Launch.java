package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilityfiles.BaseClass_WebElements;

public class Browser_Launch extends BaseClass_WebElements {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/");
	
	}

}
