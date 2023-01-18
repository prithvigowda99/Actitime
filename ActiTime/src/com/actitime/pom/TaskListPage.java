package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescr;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCust;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

	public WebElement getAddNewbtn() {
		return addNewbtn;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getCustDescr() {
		return custDescr;
	}

	public WebElement getSelectcustDD() {
		return selectcustDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCust() {
		return actualCust;
	}
	
	

}
