package com.projectsconcepts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.POManager_Adactin;
import com.reader_singleton.Filedata_Manager;
import com.utilityfiles.BaseClass_WebElements;

public class Adactin_Singleton extends BaseClass_WebElements {

	public static WebDriver driver = browser("chrome");
	public static POManager_Adactin manager = new POManager_Adactin(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		get_url("https://adactinhotelapp.com/");

		implicitWait(30);
		manage_commands("maximize");

		String username = Filedata_Manager.getInstanceFD().getInstanceTD().getUsername();
		String password = Filedata_Manager.getInstanceFD().getInstanceTD().getPassword();
		sendKeys_method(manager.getLogin().getUsername(), username);
		sendKeys_method(manager.getLogin().getPassword(), password);
		click_method(manager.getLogin().getLogin_btn());

		String location = Filedata_Manager.getInstanceFD().getInstanceTD().getLocation();
		
		String hotelIndex = Filedata_Manager.getInstanceFD().getInstanceTD().getHotelIndex();
		int hotel = Integer.parseInt(hotelIndex);
		
		String roomType = Filedata_Manager.getInstanceFD().getInstanceTD().getRoomType();
		String noofRooms = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofRooms();
		
		dropdown_value("select", manager.getSearch().getLocation(), location);
		dropdown_index("select", manager.getSearch().getHotel(), hotel);
		dropdown_text("select", manager.getSearch().getRoomtype(), roomType);
		dropdown_value("select", manager.getSearch().getNo_of_rooms(), noofRooms);

		clear_method(manager.getSearch().getIndate());
		String indate = Filedata_Manager.getInstanceFD().getInstanceTD().getIndate();
		sendKeys_method(manager.getSearch().getIndate(), indate);

		clear_method(manager.getSearch().getOutdate());
		String outdate = Filedata_Manager.getInstanceFD().getInstanceTD().getOutdate();
		sendKeys_method(manager.getSearch().getOutdate(), outdate);

		String noofAdult = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofAdult();
		int adult = Integer.parseInt(noofAdult);
		String noofChildren = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofChildren();
		
		dropdown_index("select", manager.getSearch().getAdults(), adult);
		dropdown_text("select", manager.getSearch().getChildren(), noofChildren);

		click_method(manager.getSearch().getSearch_btn());

		click_method(manager.getSelect().getRadio_btn());

		Mouse_Actions("moveToElement", manager.getSelect().getContn());
		sleep(3000);
		Mouse_Actions("click", manager.getSelect().getContn());

		String filename = Filedata_Manager.getInstanceFD().getInstanceTD().getFilename();
		String lastname = Filedata_Manager.getInstanceFD().getInstanceTD().getLastname();
		String address = Filedata_Manager.getInstanceFD().getInstanceTD().getAddress();
		String cc_Num = Filedata_Manager.getInstanceFD().getInstanceTD().getCC_Num();
		sendKeys_method(manager.getBook().getFirst_name(), filename);
		sendKeys_method(manager.getBook().getLast_name(), lastname);
		sendKeys_method(manager.getBook().getAddress(), address);
		sendKeys_method(manager.getBook().getCc_num(), cc_Num);

		String getcctypeIndex = Filedata_Manager.getInstanceFD().getInstanceTD().getcctypeIndex();
		int cctype = Integer.parseInt(getcctypeIndex);
		
		String expirymonth = Filedata_Manager.getInstanceFD().getInstanceTD().getExpirymonth();
		String getexpiryyear = Filedata_Manager.getInstanceFD().getInstanceTD().getexpiryyear();
		
		dropdown_index("select", manager.getBook().getCc_type(), cctype);
		dropdown_value("select", manager.getBook().getExpiry_month(), expirymonth);
		dropdown_text("select", manager.getBook().getExpiry_year(), getexpiryyear);

		String cvv_Num = Filedata_Manager.getInstanceFD().getInstanceTD().getCVV_Num();
		sendKeys_method(manager.getBook().getCvv_num(), cvv_Num);

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
