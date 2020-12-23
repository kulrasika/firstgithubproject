package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffshopandgift {
	
	WebDriver driver;
	
	public rediffshopandgift(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	/*By username = By.id("login1");
	By password = By.id("password");	
	By signin= By.className("signinbtn");	
	By Home = By.linkText("rediff.com");
	*/
	
	@FindBy(linkText = "Home & Decor")
	WebElement homedecor;
	

	@FindBy(xpath = "//p[text()='Home Decoratives']")
	WebElement homedecorative;
	
	
	public WebElement homedecor()
	{
		return homedecor;
	}

	public WebElement homedecorative()
	{
		return homedecorative;
	}
}


