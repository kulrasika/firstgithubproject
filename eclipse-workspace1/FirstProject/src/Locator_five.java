import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("Lucky!");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[contains(@class,'FPdoLc')]/center/input[starts-with(@value,'Google')]")).click();

	}

}
