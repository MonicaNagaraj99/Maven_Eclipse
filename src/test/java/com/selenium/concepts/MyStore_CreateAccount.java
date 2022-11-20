package com.selenium.concepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class MyStore_CreateAccount {
   
	public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sigin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		sigin.click();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailId.sendKeys("trail1@gmail.com");
		
		WebElement create_Btn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create_Btn.click();
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']"));
		gender.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstName.sendKeys("Sample");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastName.sendKeys("name");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("012345");
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		
		Select a = new Select(days);
		a.selectByIndex(27);
		
        WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		
		Select b = new Select(months);
		b.selectByValue("12");
		
         WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		
		Select c = new Select(years);
		c.selectByVisibleText("1999  ");
		
		WebElement frstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		frstName.sendKeys("Sample");
		
		WebElement lstName = driver.findElement(By.xpath("//input[@id='lastname']"));
		lstName.sendKeys("name");
		
		WebElement cmpny = driver.findElement(By.xpath("//input[@id='company']"));
		cmpny.sendKeys("ABC.co");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@name='address1']"));
		address1.sendKeys("Wall Street, 25A, ABC.co");
		
		WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
		address2.sendKeys("Lake view Appartment,10th Floor");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("New York");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	
		Select d = new Select(state);
		d.selectByVisibleText("New York");
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("10005");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobile.sendKeys("9087654321");
		
		WebElement alias = driver.findElement(By.xpath("//input[@value='My address']"));
		alias.sendKeys("Wall Street ,New York");
		
		WebElement register_Btn = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register_Btn.click();
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\MyStore_Acctncreated.png");
		FileUtils.copyFile(source, des);
	}
}