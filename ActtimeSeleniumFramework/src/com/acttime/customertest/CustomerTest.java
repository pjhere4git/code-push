package com.acttime.customertest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acttime.gnericlib.Browser;
import com.acttime.gnericlib.Constants;
import com.acttime.gnericlib.ExcelLib;
import com.acttime.pageobjRepolib.Common;
import com.acttime.pageobjRepolib.CreateNewUSer;
import com.acttime.pageobjRepolib.Login;
import com.acttime.pageobjRepolib.TimeTRack;
import com.acttime.pageobjRepolib.USerList;

public class CustomerTest {
//object declaration
	WebDriver driver;
	ExcelLib eLib;
	Login loginPage;
	Common comPage;

	
	@BeforeClass
	public void configBeforeClass(){
		//object intalization
		driver = Browser.getBrowser();
		eLib = new ExcelLib();
		loginPage = PageFactory.initElements(driver, Login.class);
		comPage = PageFactory.initElements(driver, Common.class);
	  
	
	}
	@BeforeMethod
	public void configBeforMtd(){
		loginPage.login(Constants.userName, Constants.password);
	}
	
	@Test
	public void createCustomerTest() {
    
	   System.out.println("execute create Customer");
	}
	@Test
	public void modifyCustomerTest() {
		   System.out.println("execute m Customer");

	}
	
	@AfterMethod
	public void configAfterMtd(){
		comPage.logOut();
	}
	
	
	@AfterClass
	public void configAfterClass(){
		driver.quit();
	}
	

}


