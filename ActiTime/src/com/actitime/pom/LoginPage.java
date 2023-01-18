package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbt;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwdbx() {
		return pwdbx;
	}

	public WebElement getLgbt() {
		return lgbt;
	}
	
	
		
	}
	


