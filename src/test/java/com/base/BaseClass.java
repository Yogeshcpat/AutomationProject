package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import org.apache.poi.ss.usermodel.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get(url);
	}

	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void url() {
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
	}

	public static void dropDownMethod(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void minimize() {
		driver.manage().window().minimize();
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void outputAttribute(WebElement element) {
		System.out.println(element.getAttribute("value"));
	}

	public static void outputText(WebElement element) {
		System.out.println(element.getText());
	}

	public static void outAttribute(WebElement element) {
		System.out.println(element.getAttribute("value"));
	}

	public static void takeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sabitha\\OneDrive\\Pictures\\Screenshots\\TakesScreenshot.jpeg");
		FileUtils.copyFile(src, destination);
	}

	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + filename + ".jpeg");
		FileUtils.copyFile(source, dest);
	}

	public static String stringData(int row, int cell) throws IOException {
		File f = new File("src\\test\\resources\\testData\\AdactinData.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String stringValue = c.getStringCellValue();
		return stringValue;
	}

	public static String numericData(int row, int cell) throws IOException {
		File f = new File("src\\test\\resources\\testData\\AdactinData.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String numericValue = String.valueOf(l);
		return numericValue;

	}

	public static void quite() {
		driver.quit();
	}

}                     
