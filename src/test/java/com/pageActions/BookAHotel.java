package com.pageActions;

import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td[@class='login_title'])[2]")
	private WebElement bookText;
	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement ccNo;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNum;
	@FindBy(id = "book_now")
	private WebElement bookNow;

	public WebElement getBookText() {
		return bookText;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
