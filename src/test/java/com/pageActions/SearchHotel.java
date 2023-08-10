package com.pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement Header;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomno;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "adult_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getTitle1() {
		return Header;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getsHotel() {
		return hotels;
	}

	public WebElement getrType() {
		return roomtype;
	}

	public WebElement getRoomNo() {
		return roomno;
	}

	public WebElement getAdultNo() {
		return adultroom;
	}

	public WebElement getChildNo() {
		return childroom;
	}

	public WebElement getSearchBtn() {
		return submit;
	}

}
