package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("(//input[contains(@data-message,'city')])[1]"));
		from.sendKeys("Coimbatore");
		
		Thread.sleep(2000);
		
		WebElement city1 = driver.findElement(By.xpath("//li[@select-id='results[0]']"));
		city1.click();		
		
		WebElement To = driver.findElement(By.xpath("(//input[contains(@data-message,'city')])[2]"));
		To.sendKeys("Chennai");
		
		Thread.sleep(2000);
		
		WebElement city2 = driver.findElement(By.xpath("//li[@select-id='results[0]']"));
		city2.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@readonly='readonly']"));
	    date.click();
	    
	    Thread.sleep(2000);	
	    
	    WebElement ride_Date = driver.findElement(By.xpath("//td [text()='29']"));
		ride_Date.click();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
		
		Thread.sleep(5000);
		
		WebElement close = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		close.click();
		
		Thread.sleep(2000);
		
		WebElement bus_Found = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		String no_bus_found = bus_Found.getText();
		System.out.println(no_bus_found);
		
		Thread.sleep(2000);
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\redbus.png");
		FileUtils.copyFile(source, des);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		

}
}
