package Framework.revised;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.Init_Driver;

public class NavigationBar extends Init_Driver {
	
	public static Logger log = LogManager.getLogger(Init_Driver.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void StartDriver() throws Throwable
	{
		driver = InitialiseDriver();
		driver.get(prop.getProperty("url"));
		
		log.info("URL fetched from property");
	}
	
	
	@Test
	
	public void navigationbar() throws Throwable
	{
		
		Landingpage l = new Landingpage(driver);
		log.info("Executing TEST : NavigationBar");
		l.closenewsletter(driver);
		
        Assert.assertTrue(l.getnavigationbar().isDisplayed());
        
		
	}

	@AfterTest
	public void Shutdown()
	{
		log.info("Closing driver");
		driver.close();
	}

	
}
