package com.acttime.pageobjRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.gnericlib.WebDriverCommonLib;

public class TimeTRack extends WebDriverCommonLib{
	
	@FindBy(xpath="//div[text()='Tasks']")
	WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Users']")
	WebElement userImg;
	
	
	public void navigateToTaskPage(){
		taskImg.click();
		waitForPageToLoad();
	}

	public void navigateToUserPage(){
		userImg.click();
		waitForPageToLoad();
	}
}
