package EndtoEnd.FrameworkProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Init_Driver {
	
	public WebDriver driver = null;
	
	public Properties prop = new Properties();
	
	public WebDriver InitialiseDriver () throws Throwable
	{

	
	FileInputStream fis = new FileInputStream("C:\\Users\\hrish\\eclipse-workspace\\FrameworkProject\\src\\main\\java\\EndtoEnd\\FrameworkProject\\data.properties");
	prop.load(fis);
	String browser = prop.getProperty("browser");
	
	if (browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Firefoxdriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	
	}
	

}