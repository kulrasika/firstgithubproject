import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Rasika");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Rasika");
		driver.findElement(By.xpath("//input[starts-with(@name,'procee')]")).click();
		
	}

}
