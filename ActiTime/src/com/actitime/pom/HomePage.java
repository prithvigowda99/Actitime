package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutbt;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskmod;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbt() {
		return logoutbt;
	}

	public WebElement getTaskmod() {
		return taskmod;
	}
	
	
	
	

	
	
}
