package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
    
	public static WebDriver driver;
	
	public void moveToElement(WebDriver d , WebElement e) {
      Actions a =  new Actions(d);  
      a.moveToElement(e).build().perform();
	}
	public void click(WebDriver d, WebElement e) {
		Actions a =  new Actions(d);
	      
	      a.click(e).build().perform();
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a[.='COURSES']"));
		WebElement oracle = driver.findElement(By.xpath("//span[.='Oracle Training']"));
		WebElement SQL_certify = driver.findElement(By.xpath("//span[.='SQL Certification']"));
		
		
		Actions_Mouse y = new Actions_Mouse();
		
		y.moveToElement(driver, courses);
		y.moveToElement(driver, oracle);
		y.click(driver, SQL_certify);
	
		
	}
}
