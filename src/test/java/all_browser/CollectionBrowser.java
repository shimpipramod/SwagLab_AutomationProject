package all_browser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

 public class CollectionBrowser {
	
	

	public static WebDriver lunch_Browser1(WebDriver driver, String browser, String url) {
			if(browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\ManualSelenium_Setup\\chromedriver.exe");
			ChromeOptions opetions=new ChromeOptions();
			opetions.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(opetions);
			
			
			
		}
		 else if(browser.equals("edge")) {
			 System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Desktop\\ManualSelenium_Setup\\msedgedriver.exe");
			 
			 driver=new EdgeDriver();
		}
		
	
	else
	{
		System.out.println("Browser is not present");

	}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;

		
	}
	
	public static WebDriver closeBrowser(WebDriver driver)   {
		
		
		//driver.quit();
		return driver;
	}
	
	
}
