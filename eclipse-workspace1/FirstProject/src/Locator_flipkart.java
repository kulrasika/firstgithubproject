import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='dHGf8H']/div/div/a")).click();
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Rasika");
//This  program will not work as the window which opens is a new one and we need to traverse there first
		driver.findElement(By.xpath("//div[contains(@class,'_39M2dM')]/input[@type='text']")).sendKeys("Rasiks");
	}

}
