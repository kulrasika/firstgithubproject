import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_hadoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hadoop.apache.org/");
		
		driver.findElement(By.xpath("//div[@class='container']/p[4]/a/following-sibling::a[2]")).click();
		
		//  "//div[@class='container']/p[4]/a/following-sibling::a[2]"
	}

}
