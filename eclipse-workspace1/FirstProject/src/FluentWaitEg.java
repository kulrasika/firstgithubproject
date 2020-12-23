import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEg {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		

						
				driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.xpath("//a[text()= 'Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		

		WebElement Hello = wait.until( new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				WebElement target = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				boolean istrue = target.isDisplayed();
				if(istrue)
				return target;
				else
				return null;	
			
			}

		}
		);
				
	
		
		WebElement hw = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		hw.click();
		System.out.println(hw.getText());
				
		
				
		/*if(isdisplayed == true)
		{
			System.out.println("Yes the element got displayed!");
		}
		*/
		
		
	}

	

}
