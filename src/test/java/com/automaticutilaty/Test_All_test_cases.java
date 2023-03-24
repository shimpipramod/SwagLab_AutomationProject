package com.automaticutilaty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Test_All_test_cases extends BaseSwagLab {
	public String  name;
	  public String  pass;
	//
	@Test  
	public void testLogin( ) throws Exception {
		File f=new  File("C:\\Users\\HP\\Desktop\\Selenium Worksplase\\com.SwagLab1.project\\src\\test\\java\\test_data_driven_excel\\amazon_login1.xlsx");
		  
		  FileInputStream fils= new FileInputStream(f);
		  
		  
		  XSSFWorkbook exl =new XSSFWorkbook(fils);
		 
		  XSSFSheet sheet=exl.getSheetAt(0);
		  int count= sheet.getLastRowNum();
		  //int cellcount=sheet.getLastRowNum();
		  
//<!---get the all data frome excel file      ---->		  
		  for(int i=1;i<=count;i++) {
			  
			  
			   name=sheet.getRow(i).getCell(0).getStringCellValue();
			  System.out.println(name);
			  
			   pass=sheet.getRow(i).getCell(1).getStringCellValue();
			  
			   LoginPage p1=PageFactory.initElements(driver,LoginPage.class);
				p1.getdata(name, pass);
				Thread.sleep(3000 );
		  }
		
		
		
	}
	
	@Test
	public void product_Page() throws InterruptedException {
		ProductPage pg=PageFactory.initElements(driver, ProductPage.class);
		pg.product(driver,"standard_user","secret_sauce");
		
	}
	
	@Test
	public void end_To_EndTestCase() {
		
		
		End_To_EndTesting t1=PageFactory.initElements(driver, End_To_EndTesting.class);
		
		t1.end_to_endimplents("standard_user" , "secret_sauce", "pramod", "shimpi", "20221");
	}
		

	/*@Test
	public void excel_data() {
	
		
	}
	*/
	
	
	
	
	/*@DataProvider(name="login_data")
	public Object[][] dataprovider() 
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="secret_sauce";
		data[1][1]="secret_sauce";
		
		data[2][0]="standard_user";
		data[2][1]="standard_user";
		
		return data;
			
	}
		
	
	*/
	
}
