import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_css_slesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Rasika");
		driver.findElement(By.cssSelector(".password")).sendKeys("Rasika");
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		
		
		
		
		
		
		
	}

}
