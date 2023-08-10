package com.pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='login_title'])")
	private WebElement headText;

	@FindBy(id = "radiobutton_0")
	private WebElement selectBtn;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	public WebElement getHeadText() {
		return headText;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
