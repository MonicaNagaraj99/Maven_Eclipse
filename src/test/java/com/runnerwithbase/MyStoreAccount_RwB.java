package com.runnerwithbase;

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

import com.utilityfiles.BaseClass_WebElements;

import org.openqa.selenium.WebElement;

public class MyStoreAccount_RwB extends BaseClass_WebElements {
	
	public static WebDriver driver;

   
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe" );
	    
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sigin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		click_method(sigin);
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email_create']"));
        sendKeys_method(emailId, "trail1@gmail.com");

		WebElement create_Btn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        click_method(create_Btn);

		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        click_method(gender);

		WebElement firstName = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
        sendKeys_method(firstName, "Sample");

		WebElement lastName = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
        sendKeys_method(lastName, "name");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		sendKeys_method(password, "012345");
		
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
        sendKeys_method(frstName, "Sample");

		WebElement lstName = driver.findElement(By.xpath("//input[@id='lastname']"));
        sendKeys_method(lstName, "name");

		WebElement cmpny = driver.findElement(By.xpath("//input[@id='company']"));
        sendKeys_method(cmpny, "ABC.co");
        
		WebElement address1 = driver.findElement(By.xpath("//input[@name='address1']"));
        sendKeys_method(address1, "Wall Street, 25A, ABC.co");

		WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
        sendKeys_method(address2, "Lake view Appartment,10th Floor");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        sendKeys_method(city, "New York");

		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	
		Select d = new Select(state);
		d.selectByVisibleText("New York");
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
        sendKeys_method(postcode, "10005");
        
		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
        sendKeys_method(mobile, "9087654321");

		WebElement alias = driver.findElement(By.xpath("//input[@value='My address']"));
        sendKeys_method(alias, "Wall Street ,New York");

		WebElement register_Btn = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		click_method(register_Btn);
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\Accountcreation.png");
		FileUtils.copyFile(source, des);
	}
}