package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("moni098@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("2345ab67");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		WebElement mail1 = driver.findElement(By.id("email"));
		mail1.clear();
		mail1.sendKeys("zyc@gmail.com");
		
		WebElement password1 = driver.findElement(By.name("pass"));
		password1.clear();
		password1.sendKeys("098765");
		
		}

}
