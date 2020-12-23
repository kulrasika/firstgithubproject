package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpassword {
	
public WebDriver driver = null;
	
	private By email = By.cssSelector("input#user_email");
	
	private By sendmeinstruction = By.cssSelector("input[type='submit']");
	
	
	public forgotpassword(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	


	public WebElement sendmeinstruction()
	{
		return driver.findElement(sendmeinstruction);
	}
	
	

}
