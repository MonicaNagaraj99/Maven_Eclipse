package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	   WebElement mail = driver.findElement(By.id("email"));
	   mail.sendKeys("abc@gmail.com");
	   WebElement password = driver.findElement(By.name("pass"));
	   password.sendKeys("010101");
	   WebElement login = driver.findElement(By.name("login"));
	   
	   boolean displayed = mail.isDisplayed();
	   System.out.println(displayed);
	   
	   boolean enabled = mail.isEnabled();
	   System.out.println(enabled);
	   
	   String attribute_value = password.getAttribute("value");
	   System.out.println(attribute_value);
	   
	   String attribute_mail = mail.getAttribute("type");
	   System.out.println(attribute_mail);
	   
	   String tagName = login.getTagName();
	   System.out.println(tagName);
	   
	   String text = login.getText();
	   System.out.println(text);
	 
	   Point location = mail.getLocation();
	   System.out.println(location);
	   
	   Dimension size = mail.getSize();
	   System.out.println(size);
		
	   String cssValue = mail.getCssValue("width");
	   System.out.println(cssValue);
	   
	   Rectangle rect = mail.getRect();
	   System.out.println(rect.height);
	   System.out.println(rect.width);
	   System.out.println(rect.x);
	   System.out.println(rect.y); // has the properties of both getLocation an getSize()
	   
	   WebElement forget_password = driver.findElement(By.linkText("Forgotten password?"));
	   forget_password.click();
	   driver.navigate().back(); 
	   
	  
	
	
	}

}
