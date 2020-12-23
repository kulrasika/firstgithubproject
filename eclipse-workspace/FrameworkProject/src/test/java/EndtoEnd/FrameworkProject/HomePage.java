package EndtoEnd.FrameworkProject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.LoginPage;
import EndtoEnd.FrameworkProject.Init_Driver;

public class HomePage extends Init_Driver {
	public static Logger log = LogManager.getLogger(Init_Driver.class.getName());
	
	
		
	@BeforeTest
	public void StartDriver() throws Throwable
	{
		driver = InitialiseDriver();
		log.info("Driver initialised");
		driver.get(prop.getProperty("url"));		
		log.info("URL fetched from property");
		
		
	}
	
	@Test(dataProvider = "getdata")
	
	public void basepagenavigation(String username,String password) throws Throwable
	{
		Landingpage l = new Landingpage(driver);
		
		l.closenewsletter(driver);
		log.info("Opening Login page");
		l.Login().click();
		
		LoginPage lp= new LoginPage(driver);
		log.info("Entering Login details");
		
		lp.Username().sendKeys(username);
		lp.Password().sendKeys(password);
		//System.out.println("text");
		
		lp.Loginbutton().click();
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
