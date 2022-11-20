package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page   {
   public WebDriver driver;
   
	@FindBy(xpath="//span[@id='username_span']//preceding-sibling::input[@name='username' and @class='login_input']") 
	private WebElement username;
	
	@FindBy(xpath="//span[@id='password_span']//preceding-sibling::input[@name='password']") 
	private WebElement password;
	
	@FindBy(xpath="//td//child::input[@name='login']") 
	private WebElement login_btn;
	
	
	public Login_Page(WebDriver driver) {
       this.driver=driver;
      
       PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
