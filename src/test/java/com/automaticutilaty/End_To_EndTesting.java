package com.automaticutilaty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class End_To_EndTesting {
	WebDriver driver;
	public void end_To_End(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(id="user-name") static WebElement uname;
	
	@FindBy(id="password") static WebElement pass;
	
	@FindBy(id="login-button")static WebElement loginbtn;
	
	@FindBy(xpath="//a[@id='item_4_title_link']") WebElement productlink;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement addtocartbtn;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement removebtn;
	
	@FindBy(id="checkout") WebElement checkoutbtn;
	
	@FindBy(id="shopping_cart_container") WebElement cartopt;
	
	/*check	out details form*/
	@FindBy(id="first-name") WebElement firstname;
	
	@FindBy(id="last-name") WebElement lastname;
	
	@FindBy(id="postal-code") WebElement pincode;
	
	@FindBy(id="continue") WebElement continuebtn;
	
	@FindBy(id="finish") WebElement finish;
	
	@FindBy(id="back-to-products") WebElement homepagebtn;
	
	
	
	public void end_to_endimplents(String username, String password, String fname, String lname, String pin) {
		// TODO Auto-generated method stub
		
	
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
		
		productlink.click();
		addtocartbtn.click();
		
		cartopt.click();
		checkoutbtn.click();
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		pincode.sendKeys(pin);
		continuebtn.click();
		finish.click();
		homepagebtn.click();
		
		
		
		
	}



	

}
