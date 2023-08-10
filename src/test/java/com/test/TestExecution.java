package com.test;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;

import com.pageActions.BookAHotel;
import com.pageActions.BookingConfirmation;
import com.pageActions.LoginPage;
import com.pageActions.SearchHotel;
import com.pageActions.SelectHotel;

@Listeners(com.listener.ITestListenerClas.class)
public class TestExecution extends BaseClass {

	@Test
	private void test() throws IOException, InterruptedException {

		browserLaunch("https://adactinhotelapp.com/");
		maximize();

		minimize();

		maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		title();
		url();

		LoginPage lp = new LoginPage();
		outputText(lp.getfTitle());

		inputText(lp.getUsername(), stringData(1, 0));

		inputText(lp.getPassword(), stringData(1, 1));

		btnClick(lp.getLoginbtn());

		SearchHotel sp = new SearchHotel();
		outputText(sp.getTitle1());
		dropDownMethod(sp.getLocation(), stringData(1, 2));

		Assert.assertEquals(sp.getLocation().getAttribute("value"), stringData(1, 2));

		dropDownMethod(sp.getsHotel(), stringData(1, 3));

		Assert.assertEquals(sp.getsHotel().getAttribute("value"), stringData(1, 3));

		dropDownMethod(sp.getrType(), stringData(1, 4));

		Assert.assertEquals(sp.getrType().getAttribute("value"), stringData(1, 4));

		dropDownMethod(sp.getRoomNo(), stringData(1, 5));

		dropDownMethod(sp.getAdultNo(), stringData(1, 6));

		dropDownMethod(sp.getChildNo(), stringData(1, 7));

		btnClick(sp.getSearchBtn());

		SelectHotel sp1 = new SelectHotel();

		outputText(sp1.getHeadText());

		btnClick(sp1.getSelectBtn());

		btnClick(sp1.getContinueBtn());

		BookAHotel b = new BookAHotel();
		outputText(b.getBookText());
		inputText(b.getFirstname(), stringData(1, 8));

		Assert.assertEquals(b.getFirstname().getAttribute("value"), stringData(1, 8));
		inputText(b.getLastname(), stringData(1, 9));

		Assert.assertEquals(b.getLastname().getAttribute("value"), stringData(1, 9));
		inputText(b.getAddress(), numericData(1, 10));

		Assert.assertEquals(b.getAddress().getAttribute("value"), numericData(1, 10));
		inputText(b.getCcNo(), numericData(1, 11));

		Assert.assertEquals(b.getCcNo().getAttribute("value"), numericData(1, 11));
		dropDownMethod(b.getCctype(), stringData(1, 12));

		Assert.assertEquals(b.getCctype().getAttribute("value"), stringData(1, 12));
		dropDownMethod(b.getCcexpmonth(), stringData(1, 13));
		dropDownMethod(b.getCcexpyear(), numericData(1, 14));

		Assert.assertEquals(b.getCcexpyear().getAttribute("value"), numericData(1, 14));
		inputText(b.getCvvNum(), numericData(1, 15));

		Assert.assertEquals(b.getCvvNum().getAttribute("value"), numericData(1, 15));
		btnClick(b.getBookNow());

		BookingConfirmation bc = new BookingConfirmation();

		outputText(bc.getHeadText1());

		outAttribute(bc.getOrderNo());

		takeScreenShot();

		quite();

	}

}
