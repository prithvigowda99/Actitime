package com.actitime.testscripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class TestScript extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void testCreatCustomer() throws IOException, InterruptedException {
		FileLib f= new FileLib();
		HomePage hp=new HomePage(driver);
		TaskListPage t=new TaskListPage(driver);
		String name = f.getExceldata("CustomerName", 1, 2);
		String dis = f.getExceldata("CustomerName", 1, 3);

		Reporter.log("create customer",true);


		hp.getTaskmod().click();
		t.getAddNewbtn().click();
		t.getNewCust().click();
		t.getCustName().sendKeys(name);
		t.getCustDescr().sendKeys(dis);
		t.getSelectcustDD().click();
		t.getOurCompany().click();

		t.getCreateCustBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCust(), name));
		String eName = t.getActualCust().getText();
		Assert.assertEquals(eName, name);






	}

}
