package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver = null;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	
	By title= By.cssSelector(".text-center");
	
	By navigation_bar= By.cssSelector("ul[class*=navbar-right]");
	
	
	
	public Landingpage(WebDriver driver)
	{
	this.driver = driver;
	}
	
	public WebElement Login()
	{
		return driver.findElement(signin);
	}
	
	public WebElement Featuredcoursetitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getnavigationbar()
	{
		return driver.findElement(navigation_bar);
	}
	
	public void closenewsletter(WebDriver driver)
	{
		this.driver = driver;
		
		//WebElement newsletter = ;
		
		//WebElement newsletterclose = ;
		
		if(driver.findElement(By.xpath("//div[contains(@class,'sumome-react-wysiwyg-background')]")).isDisplayed())
		{
			driver.findElement(By.xpath("//div[contains(@class,'sumome-react-wysiwyg-close-button')]")).click();
		}
		
		
		
	}
}