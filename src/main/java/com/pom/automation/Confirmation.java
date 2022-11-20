package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	
public WebDriver driver;
	
	public Confirmation(WebDriver driver) {
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[.='Your order on My Store is complete.']")
	private WebElement text;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backtoorders;
	
	@FindBy(xpath = "//table[@id='order-list']/tbody/tr[1]/td[1]")
	private WebElement reference ;
	
	@FindBy(xpath = "//span[contains(.,'account')]")
	private WebElement backtoaccount;
	
	public WebElement getText() {
		return text;
	}

	public WebElement getBacktoorders() {
		return backtoorders;
	}

	public WebElement getReference() {
		return reference;
	}

	public WebElement getBacktoaccount() {
		return backtoaccount;
	}
}
