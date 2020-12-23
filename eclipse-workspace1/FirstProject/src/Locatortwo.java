import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("User");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("User");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
