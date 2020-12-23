import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
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
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hrish\\eclipse-workspace\\Screenshot\\test.png"));
		
		driver.findElement(By.id("fromPlaceName")).clear();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENGALURU INTERNATION AIRPORT");
		
		
	
	}

}
