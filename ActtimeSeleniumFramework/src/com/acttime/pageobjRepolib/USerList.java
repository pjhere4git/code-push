package com.acttime.pageobjRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.gnericlib.WebDriverCommonLib;

public class USerList extends WebDriverCommonLib{

	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createNewUSerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement sucessfullMsg;
	
	
	public WebElement getCreateNewUSerBtn() {
		return createNewUSerBtn;
	}


	public WebElement getSucessfullMsg() {
		return sucessfullMsg;
	}


	public void navigateToCreateNewUSerPage(){
		createNewUSerBtn.click();
		waitForPageToLoad();
	}
	
}
