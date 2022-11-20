package com.selenium.concepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");

	    WebElement mail = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	    mail.sendKeys("abc@gmail.com");
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("010ab101");
	    
	    WebElement logon_btn = driver.findElement(By.xpath("//button[@type='submit']"));
	    logon_btn.click();
	    
	    driver.manage().deleteAllCookies();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    driver.navigate().refresh();
	    
	    driver.navigate().back();
	    
	    driver.navigate().refresh();
	    
	    Dimension a = new Dimension(450, 400);
	    
	    driver.manage().window().setSize(a);
	    
	    //driver.close();
	    
	    
	}

}
