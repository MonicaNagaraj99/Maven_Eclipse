package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		WebElement mail = driver.findElement(By.xpath("//input[contains(@data-testid,'royal')]"));
//		mail.sendKeys("abc@gmail");
//		
//		WebElement password = driver.findElement(By.xpath("//input[contains(@data-testid,'royal')]"));
//		password.sendKeys("01abc10");
//		
		
		// Xpath- XML path (Extensible Markup Language)
		
		Thread.sleep(10000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		Thread.sleep(5000);
		
		WebElement gender_male = driver.findElement(By.xpath("(//input[@type='radio'])"));
		
	    boolean selected = gender_male.isSelected();
    	System.out.println(selected);
	
}
}