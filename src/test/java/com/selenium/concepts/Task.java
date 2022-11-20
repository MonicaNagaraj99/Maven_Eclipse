package com.selenium.concepts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
  
	public static WebDriver driver;
	public static void enter() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_box.sendKeys("watches for women");
		
		enter();
		
		Thread.sleep(3000);
		
		WebElement watch1= driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div/div/span/a/div/img"));
	    watch1.click();
	    
		String parent = driver.getWindowHandle();
		Set<String> allwindows_ID = driver.getWindowHandles(); 
		
		for (String id1 : allwindows_ID) {
			if (id1.equals(parent)) {
				continue;
			}else {
				driver.switchTo().window(id1);
			}
		}
		Thread.sleep(3000);
		
		WebElement btn1 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		btn1.click();
		
		WebElement search_box2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_box2.sendKeys("watches for men");
		
		enter();
		
		WebElement watch2= driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div/span/a/div/img"));
	    watch2.click();
	    
	    Set<String> men = driver.getWindowHandles();
       String men_watch = "https://www.amazon.in/Fastrack-Analog-Black-Watch-3229SP01/dp/B08VJMYC3K/ref=sr_1_1_sspa?crid=2A8OBV786IVGX&keywords=watches+for+men&qid=1665802605&qu=eyJxc2MiOiIxMC4xMiIsInFzYSI6IjEwLjQ4IiwicXNwIjoiOC4wOCJ9&sprefix=watches+for+men%2Caps%2C1159&sr=8-1-spons&psc=1";
		
		for (String id2 : men) {
			if (driver.switchTo().window(id2).getCurrentUrl().equals(men_watch)) {
				break;
			}
		}
		WebElement btn2 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		btn2.click();
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		cart.click();
		
		WebElement qty = driver.findElement(By.xpath("(//span[@data-action='a-dropdown-button'])[2]"));
		qty.click();
		
		WebElement noQty = driver.findElement(By.xpath("//a[@id='quantity_2']"));
		noQty.click();
		
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.xpath("(//input[@data-action='delete'])[1]"));
	    delete.click();
	}
}
