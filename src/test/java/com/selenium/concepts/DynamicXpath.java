package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

		ChromeOptions a = new ChromeOptions();
	    a.addArguments("disable-notifications");
	    
		WebDriver driver = new ChromeDriver(a);
		driver.get("https://economictimes.indiatimes.com/markets");
		
		driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
		
		WebElement nifty = driver.findElement(By.xpath("(//span[@class='price']//following::span[@class='price'])[1]"));
		System.out.println("nifty count: " + nifty.getText());
		
		WebElement sensex = driver.findElement(By.xpath("(//span[@class='price']//preceding::span[@class='price'])[1]"));
		System.out.println("sensex count: " +sensex.getText());
		
}
}
