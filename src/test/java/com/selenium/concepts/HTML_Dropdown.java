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
import org.openqa.selenium.support.ui.Select;

public class HTML_Dropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	WebElement create_newacc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	create_newacc.click();
	
	Thread.sleep(5000);
	
	WebElement date = driver.findElement(By.name("birthday_day"));
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	
	WebElement year = driver.findElement(By.name("birthday_year"));
		
	Select s = new Select(date);
	s.selectByIndex(26);
	
	Select m = new Select(month);
	m.selectByValue("12");
	
	Select y = new Select(year);
	y.selectByVisibleText("1999");
	
	boolean multiple_date = s.isMultiple();
	System.out.println("Is date mutiple dropdown: " + multiple_date);
	
	TakesScreenshot ss =  (TakesScreenshot) driver;
	File source = ss.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\dropdown.png");
	FileUtils.copyFile(source, des);
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://letcode.in/dropdowns");
	
	driver.navigate().refresh();
	
	WebElement fruits = driver.findElement(By.id("fruits"));
	
	WebElement superheros = driver.findElement(By.id("superheros"));
	
	Select f = new Select(fruits);
	f.selectByValue("2");
	
	Select sh = new Select(superheros);
	sh.selectByIndex(5);
	sh.selectByValue("am");
	sh.selectByVisibleText("Batwoman");
	
	boolean multiple_Superhero = sh.isMultiple();
	System.out.println("Is superhero mutiple dropdown: " +multiple_Superhero);
	
	Thread.sleep(5000);
	
	sh.deselectByVisibleText("Black Panther");
	sh.deselectByIndex(0);
	sh.deselectByValue("bw");
	
	WebElement lang = driver.findElement(By.id("lang"));
	
	WebElement country = driver.findElement(By.id("country"));
	
	Select l = new Select(lang);
	
	Select c =  new Select(country);
	
	l.selectByValue("sharp");
	
	c.selectByVisibleText("India");
	
	sh.selectByIndex(2);
	sh.selectByValue("ca");
	sh.selectByVisibleText("Captain Marvel");
	Thread.sleep(3000);

	sh.deselectAll();
	
	}

}
