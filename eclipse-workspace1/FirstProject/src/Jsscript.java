import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_UP);
			
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
	    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		 script = "return document.getElementById(\"fromPlaceName\").value";
		 text = (String) js.executeScript(script);
		}
		driver.findElement(By.id("fromPlaceName")).clear();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENGALURU INTERNATION AIRPORT");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("toPlaceName")).sendKeys("BENGALURU DARSHINI");
		
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
