package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_page {
  
	public WebDriver driver;
	
	public SelectHotel_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='hidden']//preceding-sibling::input[@name='radiobutton_0']") 
	private WebElement radio_btn;
	
	@FindBy(xpath="//input[@type='button' and @name='cancel']//preceding-sibling::input[@name='continue' or type='submit']") 
	private WebElement contn;
	
	@FindBy(name="cancel") 
	private WebElement cancel;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getContn() {
		return contn;
	}

	public WebElement getCancel() {
		return cancel;
	}
}
