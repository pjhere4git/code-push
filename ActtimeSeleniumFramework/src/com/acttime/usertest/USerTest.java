package com.acttime.usertest;

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

public class USerTest {
//object declaration
	WebDriver driver;
	ExcelLib eLib;
	Login loginPage;
	Common comPage;
	TimeTRack timePage;
	USerList userlistPage;
	CreateNewUSer createUSerPage;
	
	@BeforeClass
	public void configBeforeClass(){
		//object intalization
		driver = Browser.getBrowser();
		eLib = new ExcelLib();
		loginPage = PageFactory.initElements(driver, Login.class);
		comPage = PageFactory.initElements(driver, Common.class);
	    timePage = PageFactory.initElements(driver, TimeTRack.class);
	    userlistPage = PageFactory.initElements(driver, USerList.class);
	    createUSerPage = PageFactory.initElements(driver, CreateNewUSer.class);
	}
	
	@BeforeMethod
	public void configBeforMtd(){
		loginPage.login(Constants.userName, Constants.password);
	}
	
	@Test
	public void createUserTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
    //read data from Excel
		String userID = eLib.getExcelData("Sheet1", 1, 2);
		String firstName = eLib.getExcelData("Sheet1", 1, 3);
		String lastName = eLib.getExcelData("Sheet1", 1, 4);
		String email = eLib.getExcelData("Sheet1", 1, 5);
		String userPassword = eLib.getExcelData("Sheet1", 1, 6);
	 //step 2 : navigate to USer Page
		timePage.navigateToUserPage();
	 //step 3 : create USer
		userlistPage.navigateToCreateNewUSerPage();
		createUSerPage.createUSer(userID, firstName, lastName, email, userPassword);
		//step 4 : modify & verify user
		String expMSg = "User account has been successfully created.";
		WebElement msgWb = userlistPage.getSucessfullMsg();
		String actMsg = msgWb.getText();
		Assert.assertEquals(actMsg, expMSg);
	
	}
	@Test
	public void modifyUSerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
	    //read data from Excel
			String userID = eLib.getExcelData("Sheet1", 2, 2);
			String firstName = eLib.getExcelData("Sheet1", 2, 3);
			String lastName = eLib.getExcelData("Sheet1", 2, 4);
			String email = eLib.getExcelData("Sheet1", 2, 5);
			String userPassword = eLib.getExcelData("Sheet1", 2, 6);
			 //step 2 : navigate to USer Page
			timePage.navigateToUserPage();
		 //step 3 : create USer
			userlistPage.navigateToCreateNewUSerPage();
			createUSerPage.createUSer(userID, firstName, lastName, email, userPassword);
		//step 4 : modify & verify user
			String expMSg = "User account has been successfully created.";
			WebElement msgWb = userlistPage.getSucessfullMsg();
			String actMsg = msgWb.getText();
			Assert.assertEquals(actMsg, expMSg);
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


