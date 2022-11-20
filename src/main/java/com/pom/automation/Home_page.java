package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public WebDriver driver;
	
	public Home_page(WebDriver driver) {
		this.driver = driver;
		
		 PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath = "(//a[.='Casual Dresses'])[2]")
	private WebElement casualdress;
	
	@FindBy(xpath = "(//a[.='Evening Dresses'])[2]")
	private WebElement eveningdress;
	
	@FindBy(xpath = "(//a[.='Summer Dresses'])[2]")
	private WebElement summerdress;
	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}

	public WebElement getSummerdress() {
		return summerdress;
	}

}
