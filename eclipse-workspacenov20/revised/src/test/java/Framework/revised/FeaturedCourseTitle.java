package Framework.revised;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.Init_Driver;

public class FeaturedCourseTitle extends Init_Driver {
	Landingpage l;
	public WebDriver driver;
	public static Logger log = (Logger) LogManager.getLogger(Init_Driver.class.getName());

	
		@BeforeTest
	public void StartDriver() throws Throwable
	{
		
		driver = InitialiseDriver();
		driver.get(prop.getProperty("url"));
		
		log.info("URL fetched from property");
		
	}
	
	@Test
	
	public void fcoursetitle() throws Throwable
	{
		
		//driver = InitialiseDriver();
		//driver.get("http://www.qaclickacademy.com/");
		
		
		l = new Landingpage(driver);
		l.closenewsletter(driver);
		log.info("Executing TEST : FeaturedCourseTitle");
		log.info("Created landing page object");
		Assert.assertEquals(l.Featuredcoursetitle().getText(), "FEATURED COURSES", "Fail");
        
		
	}

	@Test
	public void featuredcourseheader()
	{
		
		//driver = InitialiseDriver();
		//driver.get("http://www.qaclickacademy.com/");
		
		l = new Landingpage(driver);
		
		log.info("Executing TEST : FeaturedCourseHeader");
		log.info("Validatin if header is as expected");
		System.out.println("I am a new test for header");
		System.out.println(l.Featuredcourseheader().getText());
		Assert.assertEquals(l.Featuredcourseheader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING", "Fail");        
	}
	
	@AfterTest
	public void Shutdown()
	{
		log.info("Closing driver");
		driver.close();
		driver=null;
		
	}

	
}
