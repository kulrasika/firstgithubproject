import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keychord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Adding some comments for GitHub
		String enter = Keys.chord(Keys.SHIFT,"Hello");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(enter);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
