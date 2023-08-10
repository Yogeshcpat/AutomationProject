package com.pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "login_title")
	private WebElement headText1;
	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getHeadText1() {
		return headText1;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

}
