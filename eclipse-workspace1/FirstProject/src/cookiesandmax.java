import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/how-to-delete-cookies-in-selenium-webdriver");
		
		driver.manage().window().maximize();
		
	
		
		//driver.manage().deleteCookieNamed("has_js");
		driver.manage().deleteAllCookies();
	
		driver.findElement(By.linkText("Date Picker")).click();
		
	}

}
