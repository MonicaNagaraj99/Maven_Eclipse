package testNG;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageobjectmanager.POManager_Adactin;
import com.reader_singleton.Filedata_Manager;
import com.utilityfiles.BaseClass_WebElements;

public class Adactin_TestNG extends BaseClass_WebElements {

	public static WebDriver driver;
	public static POManager_Adactin manager;

	@BeforeClass(groups = "browser")
	public static void WebDriver() {
		driver = browser("chrome");
		manager = new POManager_Adactin(driver);
	}

	@Test(priority = -1, alwaysRun = true, groups = "url")
	private void url() {

		get_url("https://adactinhotelapp.com/");

		implicitWait(30);
		manage_commands("maximize");
	}

	@Test(priority = 0, description = "Login", groups = "login")
	private void Login() throws IOException {
		String username = Filedata_Manager.getInstanceFD().getInstanceTD().getUsername();
		String password = Filedata_Manager.getInstanceFD().getInstanceTD().getPassword();
		sendKeys_method(manager.getLogin().getUsername(), username);
		sendKeys_method(manager.getLogin().getPassword(), password);
		click_method(manager.getLogin().getLogin_btn());
	}

	@Test(priority = 1, enabled = true, groups = "hotel")
	private void hoteltype() throws IOException {

		String location = Filedata_Manager.getInstanceFD().getInstanceTD().getLocation();
		String hotelIndex = Filedata_Manager.getInstanceFD().getInstanceTD().getHotelIndex();
		int hotel = Integer.parseInt(hotelIndex);
		String roomType = Filedata_Manager.getInstanceFD().getInstanceTD().getRoomType();
		String noofRooms = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofRooms();

		dropdown_value("select", manager.getSearch().getLocation(), location);
		dropdown_index("select", manager.getSearch().getHotel(), hotel);
		dropdown_text("select", manager.getSearch().getRoomtype(), roomType);
		dropdown_value("select", manager.getSearch().getNo_of_rooms(), noofRooms);
	}

	@Test(priority = 2, dataProvider = "Adactindate", groups = "hotel", 
			dataProviderClass = DataProvider_Utility.class)
	private void date(String indate, String outdate) throws IOException {
		clear_method(manager.getSearch().getIndate());
		sendKeys_method(manager.getSearch().getIndate(), indate);

		clear_method(manager.getSearch().getOutdate());
		sendKeys_method(manager.getSearch().getOutdate(), outdate);
	}

	@Test(priority = 3, invocationCount = 2, invocationTimeOut = 3000, groups = "hotel")
	private void noofperson() throws IOException {

		String noofAdult = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofAdult();
		int adult = Integer.parseInt(noofAdult);
		String noofChildren = Filedata_Manager.getInstanceFD().getInstanceTD().getNoofChildren();

		dropdown_index("select", manager.getSearch().getAdults(), adult);
		dropdown_text("select", manager.getSearch().getChildren(), noofChildren);
	}

	@Test(priority = 4, retryAnalyzer = Retry_Utility.class, groups = "search")
	private void search() {
		click_method(manager.getSearch().getSearch_btn());
	}

	@Test(dependsOnMethods = "search", groups = "select")
	private void select() throws InterruptedException {
		click_method(manager.getSelect().getRadio_btn());
		Mouse_Actions("moveToElement", manager.getSelect().getContn());
		sleep(3000);
		Mouse_Actions("click", manager.getSelect().getContn());
	}

	@Parameters({ "filename", "lastname", "address", "cc_Num" })
	@Test(priority = 5, groups = "data")
	private void data(String filename, @Optional("N") String lastname, String address, String cc_Num)
			throws IOException {
		sendKeys_method(manager.getBook().getFirst_name(), filename);
		sendKeys_method(manager.getBook().getLast_name(), lastname);
		sendKeys_method(manager.getBook().getAddress(), address);
		sendKeys_method(manager.getBook().getCc_num(), cc_Num);
	}

	@Test(priority = 6, groups = "card")
	private void card() throws IOException {
		String getcctypeIndex = Filedata_Manager.getInstanceFD().getInstanceTD().getcctypeIndex();
		int cctype = Integer.parseInt(getcctypeIndex);
		String expirymonth = Filedata_Manager.getInstanceFD().getInstanceTD().getExpirymonth();
		String getexpiryyear = Filedata_Manager.getInstanceFD().getInstanceTD().getexpiryyear();

		dropdown_index("select", manager.getBook().getCc_type(), cctype);
		dropdown_value("select", manager.getBook().getExpiry_month(), expirymonth);
		dropdown_text("select", manager.getBook().getExpiry_year(), getexpiryyear);

		String cvv_Num = Filedata_Manager.getInstanceFD().getInstanceTD().getCVV_Num();
		sendKeys_method(manager.getBook().getCvv_num(), cvv_Num);

	}

	@Test(priority = 7, groups = "book")
	private void book() {
		Mouse_Actions("moveToElement", manager.getBook().getBooknow());
		Mouse_Actions("click", manager.getBook().getBooknow());

		click_method(manager.getConfirm().getItinerary());
		click_method(manager.getLast().getCheckbox());
	}

	@Ignore
	@Test(priority = 10, groups = "ss")
	private void screen() throws IOException {

		screenshot("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Screenshots\\Adactin.png");
	}

	@Test(priority = 11, groups = "exception", expectedExceptions = NoSuchElementException.class)
	private void username() throws IOException {
		implicitWait(10);
		String username = Filedata_Manager.getInstanceFD().getInstanceTD().getUsername();
		sendKeys_method(manager.getLogin().getUsername(), username);
	}

	@Test(priority = 11, timeOut = 6000, groups = "alert")
	private void alert() throws InterruptedException {
		click_method(manager.getLast().getCancel());
		sleep(3000);
		simple_alert("accept");
	}

	@AfterClass(groups = "quit")
	private void quit() {

		quit_Method();
	}

}
