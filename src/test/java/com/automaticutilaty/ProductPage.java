package com.automaticutilaty;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import all_browser.CollectionBrowser;

public class ProductPage extends CollectionBrowser{
	WebDriver driver;
	public void product(WebDriver driver) {
		this.driver=driver;
	}
	
		@FindBy(id="user-name") static WebElement uname;
		@FindBy(id="password") static WebElement pass;
		@FindBy(id="login-button")static WebElement loginbtn;
		@FindBy(id="react-burger-menu-btn")static WebElement menubar;
		@FindBy(id="about_sidebar_link")static WebElement aboutPage;
		@FindBy(xpath="//a[@class='bm-item menu-item' and @id='logout_sidebar_link']") static WebElement logoutopt;
		@FindBy(id="reset_sidebar_link") static WebElement resetopt;
	
	
	 @FindBy(id="shopping_cart_container") static WebElement cartopt;
	@FindBy(xpath="//a[text()='Twitter']") WebElement twittericon;
	@FindBy(xpath="//a[text()='Facebook']") WebElement facebookicon;
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]") WebElement linkdinicon;
	
	//public void Product(String username,String password) {
		
		
	//}

	public void product(WebDriver driver,String username, String password) {
		// TODO Auto-generated method stub
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
		
		menubar.click();
		aboutPage.click();
		driver.navigate().back();
		menubar.click();	
		logoutopt.click();

		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
		cartopt.click();
		driver.navigate().back();
		
		WebElement filteropt=driver.findElement(By.className("product_sort_container"));
		
		filteropt.click();
		
		twittericon.click();
		//driver.navigate().back();
		facebookicon.click();
		linkdinicon.click();
	/*	ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		for(String s:tabs) {
			driver.switchTo().window(tabs.get(0));
			linkdinicon.click();
			break;
		}
		
		
		facebookicon.click();*/
		
	}
}
