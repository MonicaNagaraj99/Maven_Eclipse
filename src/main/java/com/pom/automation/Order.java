package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
public WebDriver driver;
	
	public Order(WebDriver driver) {
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement summary_co;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement address_co;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement terms;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement shipping_co;
	
	@FindBy(xpath = "//a[contains(@title,'bank wire')]")
	private WebElement payment;
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement check_confirm;
	
	public WebElement getSummary_co() {
		return summary_co;
	}

	public WebElement getAddress_co() {
		return address_co;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getShipping_co() {
		return shipping_co;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return check_confirm;
	}
}
