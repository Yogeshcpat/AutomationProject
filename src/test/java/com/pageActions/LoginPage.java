package com.pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Existing User Login - Build 1']")
	private WebElement fTitle;
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@name='login']")
	private WebElement loginbtn;

	public WebElement getfTitle() {
		return fTitle;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
