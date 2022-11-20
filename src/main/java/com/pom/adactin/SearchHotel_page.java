package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_page {
	
	public WebDriver driver;
	
	public SearchHotel_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//tr//descendant::select[@class='search_combobox' and @id='location']") 
	private WebElement location;
	
	@FindBy(xpath="//tr//descendant::select[@class='search_combobox' and @id='hotels']") 
	private WebElement hotel;
	
	@FindBy(xpath="//tr//descendant::select[@class='search_combobox' and @id='room_type']") 
	private WebElement roomtype;
	
	@FindBy(xpath="//tr//descendant::select[@class='search_combobox' and @id='room_nos']") 
	private WebElement no_of_rooms;
	
	@FindBy(xpath="//span[@id='adults_room_span']//preceding-sibling::select[@class='search_combobox' and @id='adult_room']") 
	private WebElement adults;
	
	@FindBy(xpath="//span[@id='child_room_span']//preceding-sibling::select[@class='search_combobox' and @id='child_room']") 
	private WebElement children;
	
	@FindBy(xpath="//span[@class='reg_error']//following::input[@name='datepick_in' or @id='datepick_in']") 
	private WebElement indate;
	
	@FindBy(xpath="//span[@class='reg_error']//following::input[@name='datepick_out' or @id='datepick_out']") 
	private WebElement outdate;
	
	@FindBy(xpath="//input[@name='Reset']//preceding-sibling::input[@name='Submit']") 
	private WebElement search_btn;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}
	
}
