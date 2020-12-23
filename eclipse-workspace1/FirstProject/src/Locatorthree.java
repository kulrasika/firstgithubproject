import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locatorthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		/*
		driver.findElement(By.cssSelector("*[id = 'username']")).sendKeys("Rasika");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rasika");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		*/
		driver.findElement(By.xpath("//*[@id = 'username']")).sendKeys("Rasika");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rasika");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	
	};
	

}
