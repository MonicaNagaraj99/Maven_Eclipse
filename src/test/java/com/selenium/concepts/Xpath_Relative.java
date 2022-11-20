package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement login_Btn = driver.findElement(By.xpath("//button[text()='Log in']"));
		String text = login_Btn.getText();
		System.out.println(text);
		
		login_Btn.click();
		
		WebElement pageForCeleb = driver.findElement(By.xpath("//div[contains(text(),'celebrity')]"));
		String text2 = pageForCeleb.getText();
		System.out.println(text2);
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		String tag = create.getTagName();
		System.out.println(tag);
		create.click();
		
			
	}

}
