package com.acttime.pageobjRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.gnericlib.WebDriverCommonLib;

public class Common extends WebDriverCommonLib{
	
	@FindBy(id="logoutLink")
	WebElement logoutLnk;
	
	public void logOut(){
		logoutLnk.click();
		waitForPageToLoad();
	}

}
