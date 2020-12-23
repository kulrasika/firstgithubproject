package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Init_Driver {
	
	public WebDriver driver = null;
	
	public Properties prop = new Properties();
	
	public WebDriver InitialiseDriver () throws Throwable
	{

	
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	//String browser = System.getProperty("browser");
	String browser = prop.getProperty("browser");
	
	if (browser.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		if(browser.contains("headless"))
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	
	}
	
	public String getScreenshot(String methodname,WebDriver driver) throws IOException
	{
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+methodname+".png";
		FileUtils.copyFile(f, new File(destinationfile));
		return destinationfile;
		
		
		
		
		
	}
	

}
