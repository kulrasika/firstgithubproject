package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	public WebDriver driver = null;
	
	private By username = By.id("user_email");
	private By password = By.xpath("//input[@type = 'password']");
	private By submit = By.xpath("//input[@type = 'submit']");
	private By fp = By.cssSelector("[href*='password/new/index.php']");
	
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
	
	public forgotpassword ForgotPassword()
	{
		driver.findElement(fp).click();
		forgotpassword fpwd = new forgotpassword(driver);
		return fpwd;
		
	}
	

}
