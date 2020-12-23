import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hrishi");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Chaudhari");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("Hrishi");
		
	
		
		
		
	}

}
