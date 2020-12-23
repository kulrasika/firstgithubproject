package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.rediffHomePage;
import objectrepository.rediffLoginpage;
import objectrepository.rediffshopandgift;

public class Login {
	
	@Test
	public void doLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		rediffLoginpage r = new rediffLoginpage(driver);
		
		r.Email().sendKeys("Userone");
		r.Password().sendKeys("pass");
		r.signin().click();
	
	
		
		driver.get("https://www.rediff.com/");		
		rediffHomePage h = new rediffHomePage(driver);		
		h.typeSearch().sendKeys("Clothes");
		h.Searchbutton().click();
		
	 //JavascriptExecutor js = new JavascriptExecutor();
		
		driver.get("http://shopping.rediff.com/");		
		rediffshopandgift s = new rediffshopandgift(driver);		
		s.homedecor().click();
		Thread.sleep(5000);
		s.homedecorative().click();
	 
	}

}
