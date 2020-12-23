package EndtoEnd.FrameworkProject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.LoginPage;
import EndtoEnd.FrameworkProject.Init_Driver;

public class FeaturedCourseTitle extends Init_Driver {
	public static Logger log = (Logger) LogManager.getLogger(Init_Driver.class.getName());
	
	
	
	@BeforeTest
	public void StartDriver() throws Throwable
	{
		
		driver = InitialiseDriver();
		log.info("Driver initialised");
		driver.get(prop.getProperty("url"));
		
		log.info("URL fetched from property");
		
	}
	
	@Test
	
	public void freaturedcoursetitle() throws Throwable
	{
		
		//driver = InitialiseDriver();
		//driver.get("http://www.qaclickacademy.com/");
		
		
		Landingpage l = new Landingpage(driver);
		log.info("Created landing page object");
		Assert.assertEquals(l.Featuredcoursetitle().getText(), "FEATURED COURSES", "Fail");
        
		
	}
	
	@AfterTest
	public void Shutdown()
	{
		log.info("Closing driver");
		driver.close();
		driver=null;
		
	}

	
}
