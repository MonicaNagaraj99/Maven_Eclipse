package com.selenium.concepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Tester0987");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automate1234");
		
		WebElement login_btn = driver.findElement(By.name("login"));
		login_btn.click();
		
		WebElement locaction = driver.findElement(By.xpath("//select[@id='location']"));
		WebElement hotel= driver.findElement(By.xpath("//select[@name='hotels']"));
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
		
		Select d1 = new Select(locaction);
		d1.selectByValue("Los Angeles");
		
		Select d2 = new Select(hotel);
		d2.selectByIndex(2);
		
		Select d3 = new Select(roomtype);
		d3.selectByVisibleText("Deluxe");
		
		Select d4 = new Select(no_of_rooms);
		d4.selectByValue("2");
		
		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		indate.clear();
		indate.sendKeys("20/10/2022");
		
		WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outdate.clear();
		outdate.sendKeys("22/10/2022");
		
		Select d5 = new Select(adults);
		d5.selectByIndex(4);
		
		Select d6 = new Select(children);
		d6.selectByVisibleText("1 - One");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		WebElement radio_btn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radio_btn.click();
		
		WebElement contn = driver.findElement(By.xpath("//input[@id='continue']"));
		
		Actions b = new Actions(driver);
		b.moveToElement(contn).build().perform();
		Thread.sleep(3000);
		b.click(contn).build().perform();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		first_name.sendKeys("Monica");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		last_name.sendKeys("N");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("ABC Colony, Park Road");
		
		WebElement cc_num = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cc_num.sendKeys("0987654321123456");
		
		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		WebElement cc_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		WebElement cc_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		
		Select c1 = new Select(cc_type);
		c1.selectByIndex(2);
		
		Select c2 = new Select(cc_month);
		c2.selectByValue("11");
		
		Select c3 = new Select(cc_year);
		c3.selectByVisibleText("2022");
		
		WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cc_cvv.sendKeys("098");
		
		WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
		b.moveToElement(book_now).build().perform();
		b.click(book_now).build().perform();
		
		WebElement itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		itinerary.click();
		
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\MiniProjectscreenshot\\adactin.png");
		FileUtils.copyFile(source, des);
		
		WebElement cancel = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
		cancel.click();
		
		Thread.sleep(2000);
		
		Alert v = driver.switchTo().alert();
		v.accept();
		
	}
}
