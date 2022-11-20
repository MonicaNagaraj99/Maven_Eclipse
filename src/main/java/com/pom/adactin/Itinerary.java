package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {
 
public WebDriver driver;
	
	public Itinerary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@bgcolor='#FFFFFF']//child::input[@type='checkbox' and @name='ids[]']") 
	private WebElement checkbox;
	
	@FindBy(xpath="//td[@align='center']//child::input[@value='Cancel Selected']")
	private WebElement cancel;
	
	@FindBy(name="search_hotel") 
	private WebElement searchhotel_btn;
	
	@FindBy(id="logout") 
	private WebElement logout_btn;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSearchhotel_btn() {
		return searchhotel_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}
}
