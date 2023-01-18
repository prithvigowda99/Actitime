package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}

	@BeforeMethod	
	public void loginPage() throws IOException {
		LoginPage l=new LoginPage(driver);
		FileLib f=new FileLib();
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pwd = f.getProperty("password");

		driver.get(url);
		l.getUntbx().sendKeys(un);;
		l.getPwdbx().sendKeys(pwd);
		l.getLgbt().click();

	}

	@AfterMethod
	public void logoutPage() {
		HomePage h=new HomePage(driver);
		h.getLogoutbt();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();

	}



}




