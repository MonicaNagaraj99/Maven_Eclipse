package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
 
	 public WebDriver driver;
	 
	 public Login(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this);
		}
	 
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement sigin;
	 
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement submit_btn;
	
	public WebElement getSgin() {
		return sigin;
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}

	
	
}
