package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver = null;
	
	By username = By.id("user_email");
	By password = By.xpath("//input[@type = 'password']");
	By submit = By.xpath("//input[@type = 'submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
		
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	

	public WebElement Password()
	{
		return driver.findElement(password);
	}
	


	public WebElement Loginbutton()
	{
		return driver.findElement(submit);
	}
	
	

}
