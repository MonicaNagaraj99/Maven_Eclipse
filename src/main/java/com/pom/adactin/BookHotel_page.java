package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_page {

public WebDriver driver;
	
	public BookHotel_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//label[@id='first_name_span']//preceding-sibling::input[@name='first_name']") 
	private WebElement first_name;
	
	@FindBy(xpath="//label[@id='last_name_span']//preceding-sibling::input[@name='last_name']") 
	private WebElement last_name;
	
	@FindBy(xpath="//label[@id='address_span']//preceding-sibling::textarea[@name='address']") 
	private WebElement address;
	
	@FindBy(xpath="//label[@id='cc_num_span']//preceding-sibling::input[@name='cc_num']") 
	private WebElement cc_num;
	
	@FindBy(xpath="//tr//ancestor::select[@name='cc_type']") 
	private WebElement cc_type;
	
	@FindBy(xpath="//select[@name='cc_exp_year']//preceding-sibling::select[@name='cc_exp_month']") 
	private WebElement expiry_month;
	
	@FindBy(xpath="//select[@name='cc_exp_month']//following-sibling::select[@name='cc_exp_year']") 
	private WebElement expiry_year;
	
	@FindBy(xpath="//span[@class='reg_error']//following::input[@name='cc_cvv']") 
	private WebElement cvv_num;
	
	@FindBy(xpath="//td//child::input[@name='book_now']") 
	private WebElement booknow;
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_num() {
		return cvv_num;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
