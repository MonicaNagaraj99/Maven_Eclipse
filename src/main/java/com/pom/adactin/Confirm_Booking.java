package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Booking {
     
	public WebDriver driver;
	
	public Confirm_Booking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='search_hotel']//following-sibling::input[@name='my_itinerary']") 
	private WebElement itinerary;

	@FindBy(name="search_hotel") 
	private WebElement searchhotel_btn;
	
	@FindBy(id="logout") 
	private WebElement logout_btn;
	

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getSearchhotel_btn() {
		return searchhotel_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}
}
