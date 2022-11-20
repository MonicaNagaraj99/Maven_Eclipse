package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress {
	
	public WebDriver driver;
	
	public Eveningdress(WebDriver driver) {
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Printed Dress']")
	private WebElement printeddress;

	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickview;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//a[@name='Pink']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//span[contains(.,'checkout')]")
	private WebElement checkout;
	
	
	public WebElement getPrinteddress() {
		return printeddress;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
