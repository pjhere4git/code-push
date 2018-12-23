package com.acttime.pageobjRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.gnericlib.WebDriverCommonLib;

public class CreateNewUSer extends WebDriverCommonLib{

	@FindBy(name="username")
	WebElement userNAmeEdt;
	
	@FindBy(name="firstName")
	WebElement firstNameEdt;
	
	@FindBy(name="lastName")
	WebElement lastNameEdt;
	
	@FindBy(name="email")
	WebElement emailEdt;
	
	@FindBy(name="passwordText")
	WebElement passwordEdt;
	
	
	@FindBy(name="passwordTextRetype")
	WebElement passReTypeEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement createrUSerSubtbtn;
	
	
	public void createUSer(String userID, String fName, String lName, String email, String userPsw){
		userNAmeEdt.sendKeys(userID);
		firstNameEdt.sendKeys(fName);
		lastNameEdt.sendKeys(lName);
		emailEdt.sendKeys(email);
		passwordEdt.sendKeys(userPsw);
		passReTypeEdt.sendKeys(userPsw);
		createrUSerSubtbtn.click();
		waitForPageToLoad();
		
	}
	
	
	
	
	
	
	
	
}
