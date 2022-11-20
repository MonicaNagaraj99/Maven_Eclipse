package com.selenium.concepts;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle extends SingleWindowHandling{
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		SingleWindowHandling x = new SingleWindowHandling();
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		Thread.sleep(2000);
		x.rightClick(driver, mobiles);
		x.down();
		x.enter();
		
		WebElement Books = driver.findElement(By.linkText("Books"));
		Thread.sleep(2000);
		x.rightClick(driver, Books);
		x.down();
		x.enter();
		
		WebElement Fashion = driver.findElement(By.linkText("Fashion"));
		Thread.sleep(2000);
		x.rightClick(driver, Fashion);
		x.down();
		x.enter();
		
		Set<String> All_id = driver.getWindowHandles();
		String Books_URL = "https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books";
		
		for (String id : All_id) {
			if (driver.switchTo().window(id).getCurrentUrl().equals(Books_URL)) {
				break;
			}
		}
		Thread.sleep(3000);
		WebElement Non_fiction = driver.findElement(By.linkText("Non fiction"));
		Non_fiction.click();
		
		WebElement book1 = driver.findElement(By.xpath("//img[@alt='You Can']"));
		book1.click();
		
//		Thread.sleep(3000);
//		WebElement Addtocart = driver.findElement(By.id("submit.add-to-cart"));
//		Addtocart.click();
}
}