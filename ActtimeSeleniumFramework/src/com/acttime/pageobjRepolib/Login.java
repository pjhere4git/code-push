package com.acttime.pageobjRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.gnericlib.Browser;
import com.acttime.gnericlib.Constants;
import com.acttime.gnericlib.WebDriverCommonLib;

public class Login extends WebDriverCommonLib{
	
	@FindBy(name="username")
	WebElement userEdt;
	
	@FindBy(name="pwd")
	WebElement pswEdt;
	
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	public void login(String userName, String psw){
		waitForPageToLoad();
		Browser.driver.get(Constants.url);
		Browser.driver.manage().window().maximize();
		userEdt.sendKeys(userName);
		pswEdt.sendKeys(psw);
		loginBtn.click();
	}

}










