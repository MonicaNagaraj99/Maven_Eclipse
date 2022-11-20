
package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleWindowHandling {
	public static WebDriver driver;

	public  void rightClick(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
	}

	public  void down() throws AWTException {
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
	}

	public  void enter() throws AWTException {
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		WebElement redrail = driver.findElement(By.id("redRail"));
 
		SingleWindowHandling z = new SingleWindowHandling();
		
		z.rightClick(driver, redrail);
		z.down();
		z.enter();
		
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
		
		WebElement text_newwindow = driver.findElement(By.xpath("//span[contains(text(),'IRCTC ')]"));
		text_newwindow.getText();
	}
	
}
