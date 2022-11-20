package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
 
	 public static WebDriver driver;
	 
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

	 
	 driver = new ChromeDriver();
	 	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.amazon.com/");
	 
	 WebElement search_box = driver.findElement(By.xpath("//input[@type='text']"));
	 search_box.sendKeys("iphone");
	 
	 WebElement search_btn = driver.findElement(By.xpath("//input[@type='submit']"));
	 search_btn.click();
	 
     WebElement location = driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/span/a/div/img"));
     location.click();
     
}
}