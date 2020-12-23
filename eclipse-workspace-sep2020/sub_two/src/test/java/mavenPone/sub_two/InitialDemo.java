package mavenPone.sub_two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InitialDemo {
	
	ExtentReports extent = new ExtentReports();
	@BeforeTest	
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\extentreports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Results");
		
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rasika Chaudhari");
	}
	
	
	@Test
	public void FirstClass()
	{
		ExtentTest test = extent.createTest("TestFirst");
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
	
		extent.flush();
		driver.close();
		
	}

}
