package com.runnerwithbase;

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

import com.pageobjectmanager.POManger_Automation;
import com.pom.automation.Login;
import com.selenium.concepts.MyStore_Automation;
import com.utilityfiles.BaseClass_WebElements;

public class MyStoreAutomation_RwB extends BaseClass_WebElements {
    
	public static WebDriver driver = browser("chrome");
	
	 public static POManger_Automation manager = new POManger_Automation(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
	 get_url("http://automationpractice.com/index.php");
     manage_commands("maximize");	
	
     implicitWait(30);
     
    click_method(manager.getLogin().getSgin());
  
    sendKeys_method(manager.getLogin().getEmail(), "trail1@gmail.com");

    sendKeys_method(manager.getLogin().getPassword(), "012345");	
    
	click_method(manager.getLogin().getSubmit_btn());
	
	Mouse_Actions("moveToElement", manager.getHome().getDresses());
	
	Mouse_Actions("click", manager.getHome().getEveningdress());
			
	Mouse_Actions("moveToElement", manager.getEveningdress().getPrinteddress());
	
	click_method(manager.getEveningdress().getQuickview());
		
	frame_webelement(manager.getEveningdress().getFrame());
	
	sleep(5000);
		
    click_method(manager.getEveningdress().getQuantity());
 	
	dropdown_value("select", manager.getEveningdress().getSize(), "2");
	
    click_method(manager.getEveningdress().getColor());
    
    click_method(manager.getEveningdress().getAddtocart());

    click_method(manager.getEveningdress().getCheckout());
    
    click_method(manager.getOrder().getSummary_co());
    
    click_method(manager.getOrder().getAddress_co());
    
    click_method(manager.getOrder().getTerms());
    
    click_method(manager.getOrder().getShipping_co());
    
    click_method(manager.getOrder().getPayment());

    click_method(manager.getOrder().getConfirm());
    
	js_scroll(manager.getConfirmation().getText());
	
	screenshot("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\evedress.png");

    sleep(3000);

    click_method(manager.getConfirmation().getBacktoorders());

	System.out.println(getText_method(manager.getConfirmation().getReference()));

    click_method(manager.getConfirmation().getBacktoaccount());
    
     Mouse_Actions("moveToElement", manager.getHome().getDresses());
	
	Mouse_Actions("click", manager.getHome().getCasualdress());
	
    Mouse_Actions("moveToElement", manager.getCasualdress().getPrinteddress());
	
    click_method(manager.getCasualdress().getQuickview());
    
	frame_webelement(manager.getCasualdress().getFrame());

    sleep(4000);

    click_method(manager.getCasualdress().getQuantity());
    
	dropdown_text("Select", manager.getCasualdress().getSize(), "L");
	
    click_method(manager.getCasualdress().getAddtocart());
    
	click_method(manager.getCasualdress().getCheckout());
	
    click_method(manager.getOrder().getSummary_co());

    click_method(manager.getOrder().getAddress_co());

    click_method(manager.getOrder().getTerms());

    click_method(manager.getOrder().getShipping_co());
    
    click_method(manager.getOrder().getPayment());
    
    click_method(manager.getOrder().getConfirm());
    
	js_scroll(manager.getConfirmation().getText());

	screenshot("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\casualdress.png");
	
	sleep(3000);
	
    click_method(manager.getConfirmation().getBacktoorders());
    
	System.out.println(getText_method(manager.getConfirmation().getReference()));
	
    click_method(manager.getConfirmation().getBacktoaccount());
    
    Mouse_Actions("moveToElement", manager.getHome().getDresses());
	
    Mouse_Actions("click", manager.getHome().getSummerdress());

    Mouse_Actions("moveToElement", manager.getSummerDress().getPrinteddress());
	
    click_method(manager.getSummerDress().getQuickview());
  
	frame_webelement(manager.getSummerDress().getFrame());
	
    sleep(3000);

    click_method(manager.getSummerDress().getQuantity());
    
	dropdown_value("Select", manager.getSummerDress().getSize(),"3");
	
    click_method(manager.getSummerDress().getColor());
    
    click_method(manager.getSummerDress().getAddtocart());
    
    click_method(manager.getSummerDress().getCheckout());
    
    click_method(manager.getOrder().getSummary_co());

    click_method(manager.getOrder().getAddress_co());

    click_method(manager.getOrder().getTerms());

    click_method(manager.getOrder().getShipping_co());
    
    click_method(manager.getOrder().getPayment());
    
    click_method(manager.getOrder().getConfirm());
    
	js_scroll(manager.getConfirmation().getText());
    
	screenshot("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\summerdress.png");

	sleep(3000);
	
     click_method(manager.getConfirmation().getBacktoorders());
    
	System.out.println(getText_method(manager.getConfirmation().getReference()));
	
    click_method(manager.getConfirmation().getBacktoaccount());

	}
}
