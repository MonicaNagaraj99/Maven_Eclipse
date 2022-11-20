package com.runnerwithbase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pageobjectmanager.POManager_Adactin;
import com.pom.adactin.BookHotel_page;
import com.pom.adactin.Confirm_Booking;
import com.pom.adactin.Itinerary;
import com.pom.adactin.Login_Page;
import com.pom.adactin.SearchHotel_page;
import com.pom.adactin.SelectHotel_page;
import com.utilityfiles.BaseClass_WebElements;

public class Adactin_RunnerwithBase extends BaseClass_WebElements{
	
	public static WebDriver driver = browser("chrome");
	public static POManager_Adactin manager = new POManager_Adactin(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		get_url("https://adactinhotelapp.com/");
		
		implicitWait(30);
        manage_commands("maximize");
		
        sendKeys_method(manager.getLogin().getUsername(), "Tester0987");
        sendKeys_method(manager.getLogin().getPassword(), "Automate1234");
        click_method(manager.getLogin().getLogin_btn());
        
		dropdown_value("select", manager.getSearch().getLocation(), "Los Angeles");
		dropdown_index("select", manager.getSearch().getHotel(), 2);
		dropdown_text("select", manager.getSearch().getRoomtype(), "Deluxe");
		dropdown_value("select", manager.getSearch().getNo_of_rooms(), "2");
		
		clear_method( manager.getSearch().getIndate());
        sendKeys_method(manager.getSearch().getIndate(), "01/11/2022");
       
		clear_method(manager.getSearch().getOutdate());
        sendKeys_method(manager.getSearch().getOutdate(), "02/11/2022");
		
        dropdown_index("select", manager.getSearch().getAdults(), 4);
		dropdown_text("select", manager.getSearch().getChildren(), "1 - One");
		
		click_method(manager.getSearch().getSearch_btn());
		
		click_method(manager.getSelect().getRadio_btn());
		
		Mouse_Actions("moveToElement",manager.getSelect().getContn());
        sleep(3000);
        Mouse_Actions("click",manager.getSelect().getContn());
		
        sendKeys_method(manager.getBook().getFirst_name(), "Monica");
	    sendKeys_method(manager.getBook().getLast_name(), "N");
        sendKeys_method(manager.getBook().getAddress(), "ABC Colony, Park Road");
        sendKeys_method(manager.getBook().getCc_num(), "0987654321123456");	
        
		dropdown_index("select", manager.getBook().getCc_type(), 2);
		dropdown_value("select",manager.getBook().getExpiry_month(),"11");
		dropdown_text("select", manager.getBook().getExpiry_year(), "2022");
		
		sendKeys_method(manager.getBook().getCvv_num(), "098");
		
		Mouse_Actions("moveToElement", manager.getBook().getBooknow());
		Mouse_Actions("click", manager.getBook().getBooknow());
		
		click_method(manager.getConfirm().getItinerary());
		
        click_method(manager.getLast().getCheckbox());		
		
        sleep(3000);
         
        screenshot("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\Adactin.png");
        
        click_method(manager.getLast().getCancel());
        
        sleep(3000);
		
        simple_alert("accept");

	}
}
