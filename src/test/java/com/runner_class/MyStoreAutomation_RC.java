package com.runner_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class MyStoreAutomation_RC {
    
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
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe" );

	driver = new ChromeDriver();
	
	MyStoreAutomation_RC obj = new MyStoreAutomation_RC();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement sigin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	sigin.click();
	
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("trail1@gmail.com");
	
	WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
	passwd.sendKeys("012345");
	
	WebElement sign_Btn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	sign_Btn.click();
	
	WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	
	obj.moveToElement(driver, dresses);
	
	WebElement eve_Dresses = driver.findElement(By.xpath("(//a[.='Evening Dresses'])[2]"));
	obj.click(driver, eve_Dresses);
		
	WebElement printed_dress = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
	
	obj.moveToElement(driver, printed_dress);
	
	WebElement quickView = driver.findElement(By.xpath("//span[text()='Quick view']"));
	quickView.click();
		
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame);
	
	Thread.sleep(7000);
	
	WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	qty.click();
	
	WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	Select s = new Select(size);
	s.selectByValue("2");
	
	WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
	color.click();
	
	WebElement add_cart = driver.findElement(By.xpath("//button[@name='Submit']"));
	add_cart.click();
	
	WebElement checkout1 = driver.findElement(By.xpath("//span[contains(.,'checkout')]"));
	checkout1.click();
	
	WebElement checkout2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
	checkout2.click();
	
	WebElement checkout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
	checkout3.click();
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox.click();
	
	WebElement checkout4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	checkout4.click();
	
	WebElement payment = driver.findElement(By.xpath("//a[contains(@title,'bank wire')]"));
	payment.click();
	
	WebElement cnfrm_order = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
	cnfrm_order.click();
	
	WebElement text = driver.findElement(By.xpath("//strong[.='Your order on My Store is complete.']"));
	
	JavascriptExecutor js =  (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()",text);
	
	TakesScreenshot ss1 = (TakesScreenshot) driver;
	File source = ss1.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\evedress.png");
	FileUtils.copyFile(source, des);
	
	Thread.sleep(3000);
	
	WebElement backToOrder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
	backToOrder.click();
	
	WebElement table1 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
	String  text_table1 = table1.getText();
	System.out.println(text_table1);
	
	WebElement myAcct = driver.findElement(By.xpath("//span[contains(.,'account')]"));
	myAcct.click();
	
	WebElement dresses2 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	obj.moveToElement(driver, dresses2);
	
	WebElement casual_Dresses = driver.findElement(By.xpath("(//a[.='Casual Dresses'])[2]"));
	obj.click(driver, casual_Dresses);
	
    WebElement printed_dress2 = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
	
	obj.moveToElement(driver, printed_dress2);
	
	WebElement quickView2 = driver.findElement(By.xpath("//span[text()='Quick view']"));
	quickView2.click();
		
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame2);
	
    Thread.sleep(7000);
	
	WebElement qty2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	qty2.click();
	
	WebElement size2 = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	Select s2 = new Select(size2);
	s2.selectByVisibleText("L");
	
	WebElement add_cart2 = driver.findElement(By.xpath("//button[@name='Submit']"));
	add_cart2.click();
	
	WebElement checkout1_2 = driver.findElement(By.xpath("//span[contains(.,'checkout')]"));
	checkout1_2.click();
	
	WebElement checkout2_2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
	checkout2_2.click();
	
	WebElement checkout3_2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
	checkout3_2.click();
	
	WebElement checkbox_2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox_2.click();
	
	WebElement checkout4_2 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	checkout4_2.click();
	
	WebElement payment_2 = driver.findElement(By.xpath("//a[contains(@title,'bank wire')]"));
	payment_2.click();
	
	WebElement cnfrm_order_2 = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
	cnfrm_order_2.click();
	
	WebElement text_2 = driver.findElement(By.xpath("//strong[.='Your order on My Store is complete.']"));
	
	js.executeScript("arguments[0].scrollIntoView()",text_2);
	
	TakesScreenshot ss2 = (TakesScreenshot) driver;
	File source2 = ss2.getScreenshotAs(OutputType.FILE);
	File des2 = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\casualdress.png");
	FileUtils.copyFile(source2, des2);
	
    Thread.sleep(3000);
	
	WebElement backToOrder2 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
	backToOrder2.click();
	
	WebElement table2 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
	String  text_table2 = table2.getText();
	System.out.println(text_table2);
	
	WebElement myAcct2 = driver.findElement(By.xpath("//span[contains(.,'account')]"));
	myAcct2.click();
	
	WebElement dresses3 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	obj.moveToElement(driver, dresses3);
	
	WebElement summer_Dresses = driver.findElement(By.xpath("(//a[.='Summer Dresses'])[2]"));
	obj.click(driver, summer_Dresses);
	
    WebElement printed_dress3 = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[1]"));
	
	obj.moveToElement(driver, printed_dress3);
	
	WebElement quickView3 = driver.findElement(By.xpath("//span[text()='Quick view']"));
	quickView3.click();
		
	WebElement frame3 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame3);
	
    Thread.sleep(7000);
	
	WebElement qty3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	qty3.click();
	
	WebElement size3 = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	Select s3 = new Select(size3);
	s3.selectByVisibleText("L");
	
	WebElement color3 = driver.findElement(By.xpath("//a[@name='Black']"));
	color3.click();
	
	WebElement add_cart3 = driver.findElement(By.xpath("//button[@name='Submit']"));
	add_cart3.click();
	
	WebElement checkout1_3 = driver.findElement(By.xpath("//span[contains(.,'checkout')]"));	
	checkout1_3.click();
	
	WebElement checkout2_3 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
	checkout2_3.click();
	
	WebElement checkout3_3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
	checkout3_3.click();
	
	WebElement checkbox_3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox_3.click();
	
	WebElement checkout4_3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	checkout4_3.click();
	
	WebElement payment_3 = driver.findElement(By.xpath("//a[contains(@title,'bank wire')]"));
	payment_3.click();
	
	WebElement cnfrm_order_3 = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
	cnfrm_order_3.click();
	
	WebElement text_3 = driver.findElement(By.xpath("//strong[.='Your order on My Store is complete.']"));
	
	js.executeScript("arguments[0].scrollIntoView()",text_3);
	
	TakesScreenshot ss3 = (TakesScreenshot) driver;
	File source3 = ss3.getScreenshotAs(OutputType.FILE);
	File des3 = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Screenshot\\summerdress.png");
	FileUtils.copyFile(source3, des3);
	
    Thread.sleep(3000);
	
	WebElement backToOrder3 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
	backToOrder3.click();
	
	WebElement table3 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
	String  text_table3 = table3.getText();
	System.out.println(text_table3);
	
	WebElement myAcct3 = driver.findElement(By.xpath("//span[contains(.,'account')]"));
	myAcct3.click();
	
	}
}
