package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver = null;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	
	private By title= By.cssSelector(".text-center");
	
	private By header= By.cssSelector("div[class*='video-banner'] h3");
		
	private By navigation_bar= By.cssSelector("ul[class*=navbar-right]");
	
	
	
	public Landingpage(WebDriver driver)
	{
	this.driver = driver;
	}
	
	public LoginPage Login()
	{
		LoginPage lp= new LoginPage(driver);
		driver.findElement(signin).click();
		return lp;
	}
	
	
	public WebElement Featuredcoursetitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement Featuredcourseheader()
	{
		return driver.findElement(header);
	} 
	
	public WebElement getnavigationbar()
	{
		return driver.findElement(navigation_bar);
	}
	
	public void closenewsletter(WebDriver driver)
	{
		this.driver = driver;
		
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//w.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sumome-react-wysiwyg-popup-animation-group"))));
		
		//WebElement newsletter = ;
		
		//WebElement newsletterclose = ;
		
		//Set<String> handle = driver.getWindowHandles();
		
		//Iterator it = handle.iterator();
		
		if((driver.getCurrentUrl()).contains("sign_in"))
		return;			
	
		if(!driver.findElement( By.cssSelector("ul[class*=navbar-right]")).isEnabled())
		{
		if(driver.findElement(By.cssSelector("div.sumome-react-wysiwyg-popup-animation-group")).isDisplayed())
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			
		}
		
	}
}
