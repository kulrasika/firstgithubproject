package Framework.revised;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.Landingpage;
import pageObjects.LoginPage;
import pageObjects.forgotpassword;
import resources.Init_Driver;

public class HomePage extends Init_Driver {
	public static Logger log = LogManager.getLogger(Init_Driver.class.getName());
	public WebDriver driver;
	
	
		
	@BeforeTest
	public void StartDriver() throws Throwable
	{
		driver = InitialiseDriver();
				
		
		
	}
	
	@Test(dataProvider = "getdata")	
	public void basepagenavigation(String username,String password) throws Throwable
	{	
		driver.get(prop.getProperty("url"));
		log.info("URL fetched from property");
		Landingpage l = new Landingpage(driver);
		log.info("Executing TEST : HomePage");
		l.closenewsletter(driver);
		log.info("Opening Login page");
		LoginPage lp = l.Login();
		
		 
		if((driver.getCurrentUrl()).equalsIgnoreCase("http://www.qaclickacademy.com/"))
		{			
		log.info("Entering Login details");		
		lp.Username().sendKeys(username);
		lp.Password().sendKeys(password);
		lp.Loginbutton().click();
		}
		else
		{
			
			lp.Username().sendKeys(username);
			lp.Password().sendKeys(password);
			lp.Loginbutton().click();
		}
			
		
	forgotpassword f = lp.ForgotPassword();
	f.email().sendKeys("xxx@gmail.com");
	f.sendmeinstruction().click();
	
		//System.out.println("text");
		
		
	}
	
	

	@DataProvider
	public Object[][] getdata()
	{
	Object[][] data = new Object[3][2];
	
log.info("Fetching user details 1");
	data[0][0] = "abc@gmail.com";
	data[0][1] = "password";
	//Object[0][2] = "";
	log.info("Fetching user details 2");
	data[1][0] = "def@gmail.com";
	data[1][1] = "password";
	//Object[1][2] = "";
	log.info("Fetching user details 3");
	data[2][0] = "xyz@gmail.com";
	data[2][1] = "password";
	//Object[2][2] = "";
	
	return data;
	
	}
	
	@AfterTest
	public void Shutdown()
	{
		log.info("Closing driver");
		driver.quit();
	}

	

}
