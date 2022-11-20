package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class KeyboardActions {

public static WebDriver driver;
	
     public static void contexClick(WebDriver d , WebElement element) {
    	 Actions a = new Actions(d);	 
 		 a.contextClick(element).build().perform();
	}
     
     public static void down() throws AWTException {
    	 Robot b = new Robot();
 		b.keyPress(KeyEvent.VK_DOWN);
 		b.keyRelease(KeyEvent.VK_DOWN);		
}
     public static void enter() throws AWTException {
    	 Robot b = new Robot();
    	 b.keyPress(KeyEvent.VK_ENTER);
    	 b.keyRelease(KeyEvent.VK_ENTER);
     }
	
     public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		WebElement role = driver.findElement(By.tagName("role"));
		contexClick(driver, gmail);
		down();
		enter();
	}
}
