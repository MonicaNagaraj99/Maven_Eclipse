package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.BookHotel_page;
import com.pom.adactin.Confirm_Booking;
import com.pom.adactin.Itinerary;
import com.pom.adactin.Login_Page;
import com.pom.adactin.SearchHotel_page;
import com.pom.adactin.SelectHotel_page;

public class POManager_Adactin {
	
	private WebDriver driver;
	
	private Login_Page login; 
	private  SearchHotel_page search ;
	private SelectHotel_page select ;
	private  BookHotel_page book ;
	private Confirm_Booking confirm ;
	private  Itinerary last ;
	
	public POManager_Adactin(WebDriver driver) {
		this.driver = driver;
	}
	
	public Login_Page getLogin() {
		
		if(login==null)
		{
			login = new Login_Page(driver);
		}
		return login;
	}
	public SearchHotel_page getSearch() {
		
		if(search==null)
		{
			search = new SearchHotel_page(driver);
		}
		return search;
	}
	public SelectHotel_page getSelect() {
		
		if(select==null)
		{
			select = new SelectHotel_page(driver);
		}
		return select;
	}
	public BookHotel_page getBook() {
		
		if(book==null)
		{
			book = new BookHotel_page(driver);
		}
		return book;
	}
	public Confirm_Booking getConfirm() {
		
		if(confirm==null)
		{
			confirm = new Confirm_Booking(driver);
		}
		return confirm;
	}
	public Itinerary getLast() {
		
		if(last==null)
		{
			last = new Itinerary(driver);
		}
		return last;
	}
	
}
