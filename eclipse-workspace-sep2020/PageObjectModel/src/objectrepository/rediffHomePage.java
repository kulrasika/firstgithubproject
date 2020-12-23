package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomePage {

WebDriver driver;

public rediffHomePage(WebDriver driver)
{
this.driver = driver;

}
	By randomtextbox = By.id("srchword");
	By randombutton = By.className("newsrchbtn");	
	By businesstextbox= By.className("getquoteinput");	
	By businesstextboxbutton = By.className("getqbtn");

public WebElement typeSearch()
{
	return driver.findElement(randomtextbox);
}

public WebElement Searchbutton()
{
	return driver.findElement(randombutton);
}
public WebElement typeBusiness()
{
	return driver.findElement(businesstextbox);
}

public WebElement searchbusiness()
{
	return driver.findElement(businesstextboxbutton);
	}

}

