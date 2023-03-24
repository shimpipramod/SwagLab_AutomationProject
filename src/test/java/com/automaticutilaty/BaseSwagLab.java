package com.automaticutilaty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import all_browser.CollectionBrowser;

public class BaseSwagLab {
	
	public WebDriver driver;
	
	
	
	@BeforeMethod
  public void browserLounch() {
	  driver=CollectionBrowser.lunch_Browser1(driver, "Chrome", "https://www.saucedemo.com/");
	//FactoryPage p1=new FactoryPage();
	  
	 }
	
	
	
	@AfterMethod
	public void closebrowser()   {
		
		driver=CollectionBrowser.closeBrowser(driver);
	}
	
	
}
