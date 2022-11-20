package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simple = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		simple.click();
		
		WebElement simple_btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple_btn.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		confirm.click();
		
		WebElement confirm_btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirm_btn.click();
		
		Alert b = driver.switchTo().alert();
		b.dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		prompt.click();
		
		WebElement prompt_btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt_btn.click();
		
		Alert c = driver.switchTo().alert();
        c.getText();
        c.dismiss();
	}
}
