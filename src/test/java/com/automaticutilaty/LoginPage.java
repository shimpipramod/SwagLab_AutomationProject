package com.automaticutilaty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public  void loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="user-name") WebElement uname;
	@FindBy(id="password") WebElement upass;
	@FindBy(id="login-button") WebElement loginbtn;
	
	public  void getdata(String uname1,String pass) {
		uname.clear();
		uname.sendKeys(uname1);
		upass.clear();
		upass.sendKeys(pass);
		
		//loginbtn.click();
	}

}
