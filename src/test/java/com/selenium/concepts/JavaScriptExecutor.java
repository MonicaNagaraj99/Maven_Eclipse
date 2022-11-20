package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	
    WebElement mail = driver.findElement(By.name("username"));
	
	WebElement forgot_pw = driver.findElement(By.linkText("Forgot password?"));
	
	WebElement food = driver.findElement(By.linkText("Food & Drink"));
	
	Thread.sleep(2000);
	
	JavascriptExecutor m = (JavascriptExecutor) driver;
	m.executeScript("arguments[0].value='abc@gmail.com'", mail);
    
	m.executeScript("arguments[0].setAttribute('style','color:yellow')", forgot_pw);
	
	Thread.sleep(5000);
	
	m.executeScript("arguments[0].scrollIntoView()", food);
	
	m.executeScript("arguments[0].click()",food);
	
	}	
}
