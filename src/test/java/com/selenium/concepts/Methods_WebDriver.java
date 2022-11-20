package com.selenium.concepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_WebDriver {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	
	
	WebDriver driver = new ChromeDriver();
	
	System.out.println("Web driver methods");
	
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	System.out.println("Webpage title: " + title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL:" + currentUrl);
	
	String pageSource = driver.getPageSource();
	System.out.println("Page Source: "+ pageSource);
	
	System.out.println("");
    System.out.println("Navigation Commands");
	driver.navigate().to("https://byjus.com/");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	System.out.println("Manage commands");
	
	driver.manage().window().fullscreen();
	
	Dimension size = driver.manage().window().getSize();
	System.out.println("Before maximize:" + size);
	
	driver.manage().window().maximize();
	
	Dimension size1 = driver.manage().window().getSize();
	System.out.println("After Image:" + size1); 
	
	Dimension a = new Dimension(600, 600);
	
	driver.manage().window().setSize(a);
	
	driver.manage().deleteAllCookies();
	
	driver.close();

	//driver.quit();
	}
}
