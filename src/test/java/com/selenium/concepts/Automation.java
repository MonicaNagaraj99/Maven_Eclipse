package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	
	public static void rightClick(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
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
	
 public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[contains(@title,'Log in')]"));
		
		rightClick(driver, login);
		down();
		enter();
		
       Thread.sleep(3000);
		
 		String parent = driver.getWindowHandle();
		Set<String> allwindows_ID = driver.getWindowHandles();

		for (String id : allwindows_ID) {
			if (id.equals(parent)) {
				continue;
			}else {
				driver.switchTo().window(id);
			}
		}
		
		WebElement  email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("Bangtan13@gmail.com");
		
		WebElement create_btn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create_btn.click();
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Raj");
		
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("Y");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("abc123");
		
		WebElement day = driver.findElement(By.name("days"));
		WebElement date = driver.findElement(By.name("months"));
        WebElement year = driver.findElement(By.name("years"));
        
        Select a = new Select(day);
        a.selectByIndex(17);
        Select b = new Select(date);
        b.selectByValue("9");
        Select c = new Select(year);
        c.selectByVisibleText("2000  ");
        
        WebElement firstname1 = driver.findElement(By.name("firstname"));
		firstname1.sendKeys("Raj");
		
		WebElement lastname1 = driver.findElement(By.name("lastname"));
		lastname1.sendKeys("Y");
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("A90, Crossstreet");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Hilo");
		
		WebElement id_state = driver.findElement(By.name("id_state"));
		
		Select d = new Select(id_state); 
		d.selectByVisibleText("Hawaii");
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("96720");
		
		WebElement phone = driver.findElement(By.name("phone_mobile"));
		phone.sendKeys("9012345678");
        
		WebElement address1 = driver.findElement(By.name("alias"));
		address1.sendKeys("Hilo,Hawaii");
		
		WebElement reg = driver.findElement(By.name("submitAccount"));
		reg.click();
		
		 Thread.sleep(3000);
		 
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\automation1.png");
		FileUtils.copyFile(source, des);
 }}
