package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Selenium_Programs\\\\Drive\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement single_frame = driver.findElement(By.linkText("Single Iframe"));
		single_frame.click();
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Single Frame");
		
		driver.switchTo().defaultContent();
		
		WebElement iframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
        iframe.click();
        
        WebElement nested_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
        driver.switchTo().frame(nested_frame);
        
        WebElement inner_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
        driver.switchTo().frame(inner_frame);
        
        WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
        text2.sendKeys("Nested Frame");
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().defaultContent();  
		single_frame.click();
	}

}
