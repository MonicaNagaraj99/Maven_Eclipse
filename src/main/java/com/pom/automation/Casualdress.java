package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casualdress {

public WebDriver driver;
	
	public Casualdress(WebDriver driver) {
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='product_img_link']//child::img[@title='Printed Dress']")
	private WebElement printeddress;

	@FindBy(xpath = "//a[@class='quick-view']//child::span[text()='Quick view']")
	private WebElement quickview;
	
	@FindBy(xpath = "//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath = "//span//child::i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath = "//option[@selected='selected']//parent::select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//button[@type='submit']//child::span[.='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//i[@class='icon-chevron-right right']//parent::span[normalize-space()='Proceed to checkout']")
	private WebElement checkout;
	
	public WebDriver getDriver() {
		return driver;
	}

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

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
