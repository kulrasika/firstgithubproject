package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffLoginpage {

WebDriver driver;

public rediffLoginpage(WebDriver driver)
{
this.driver = driver;

}
	By username = By.id("login1");
	By password = By.id("password");	
	By signin= By.className("signinbtn");	
	By Home = By.linkText("rediff.com");

public WebElement Email()
{
	return driver.findElement(username);
}

public WebElement Password()
{
	return driver.findElement(password);
}
public WebElement signin()
{
	return driver.findElement(signin);
}

public WebElement home()
{
	return driver.findElement(Home);
	}

}

