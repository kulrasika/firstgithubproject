import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loator_GoogleCodelabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codelabs.developers.google.com/");
		
		//System.out.println(driver.findElement(By.xpath("//header/div/h2[text()='Welcome to Codelabs!']/parent::div")).getText());
		System.out.println(driver.findElement(By.cssSelector("[class='banner-title']")).getText());
		
		
		
		
	}

}
