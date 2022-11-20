package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
	 
	 ChromeOptions a = new ChromeOptions();
	 
	 a.addArguments("disable-notifications");
	 
	 WebDriver driver = new ChromeDriver(a);
	 
	 driver.get("https://www.tomorrow.io/weather/");
	 
	 driver.manage().window().maximize();
	 
	 //sweetAlert
	 driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline")).click();
	 
	}
}
