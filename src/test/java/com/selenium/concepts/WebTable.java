package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static WebDriver driver;
	
  public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");
	
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
		 
		 driver.get("https://qavbox.github.io/demo/webtable/");
		 
	   WebElement particularcell = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[32]/td[4]"));
	   String text = particularcell.getText();
	   System.out.println(text);
	   
	   System.out.println("----Specific Row----");
	   List<WebElement> Row17 = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[17]"));
	   for (WebElement row : Row17) {
		System.out.println(row.getText());
	}
	   System.out.println("----Specific Column----");
	   List<WebElement> column3 = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[3]"));
	   for(WebElement column :column3){
		  System.out.println(column.getText()); 
	   }
	   System.out.println("----All Data----");
	   List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
	   for (WebElement All : Alldata) {
		   System.out.println(All.getText());
	   }
	   System.out.println("----Heading----");
	   List<WebElement> heading = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
	   for (WebElement Head : heading) {
		   System.out.println(Head.getText());
	   }
}
}
