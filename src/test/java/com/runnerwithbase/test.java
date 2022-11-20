package com.runnerwithbase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utilityfiles.BaseClass_WebElements;

public class test extends BaseClass_WebElements  {

	public static WebDriver driver;
	
	public  void moveToElement(WebDriver d, WebElement e) {
	Actions a = new Actions(d);
	a.moveToElement(e).build().perform();
	}
	public void click(WebDriver d, WebElement e) {
		Actions b =  new Actions(d);
	      b.click(e).build().perform();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe");

	driver = new ChromeDriver();
	
	test obj = new test();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	WebElement dresses3 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	obj.moveToElement(driver, dresses3);
	
	WebElement summer_Dresses = driver.findElement(By.xpath("(//a[.='Summer Dresses'])[2]"));
	obj.click(driver, summer_Dresses);
	
    WebElement printed_dress3 = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[1]"));
	
	obj.moveToElement(driver, printed_dress3);
	
	WebElement quickView3 = driver.findElement(By.xpath("//span[text()='Quick view']"));
    click_method(quickView3);
  
	WebElement frame3 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame3);
	
    Thread.sleep(7000);
	
	WebElement qty3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
    click_method(qty3);
    
	WebElement size3 = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	Select s3 = new Select(size3);
	s3.selectByVisibleText("L");
	
	WebElement color3 = driver.findElement(By.xpath("//a[@name='Black']"));
    click_method(color3);
    
	WebElement add_cart3 = driver.findElement(By.xpath("//button[@name='Submit']"));
    click_method(add_cart3);
    
	WebElement checkout1_3 = driver.findElement(By.xpath("//span[contains(.,'checkout')]"));	
    click_method(checkout1_3);

	WebElement checkout2_3 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
    click_method(checkout2_3);
    
	WebElement checkout3_3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
    click_method(checkout3_3);
    
	WebElement checkbox_3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
    click_method(checkbox_3);
    
	WebElement checkout4_3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
    click_method(checkout4_3);
    
	WebElement payment_3 = driver.findElement(By.xpath("//a[contains(@title,'bank wire')]"));
    click_method(payment_3);
 
	WebElement cnfrm_order_3 = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
   click_method(cnfrm_order_3);
 
	WebElement text_3 = driver.findElement(By.xpath("//strong[.='Your order on My Store is complete.']"));
	
	JavascriptExecutor js =  (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()",text_3);
	
	TakesScreenshot ss3 = (TakesScreenshot) driver;
	File source3 = ss3.getScreenshotAs(OutputType.FILE);
	File des3 = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\summerdress.png");
	FileUtils.copyFile(source3, des3);
	
    Thread.sleep(3000);
	
	WebElement backToOrder3 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
    click_method(backToOrder3);
   
	WebElement table3 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
    String text_method3 = getText_method(table3);
    System.out.println(text_method3);
	
	WebElement myAcct3 = driver.findElement(By.xpath("//span[contains(.,'account')]"));
    click_method(myAcct3);

	}
}

