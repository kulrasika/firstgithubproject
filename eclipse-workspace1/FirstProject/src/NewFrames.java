import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement targetframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(targetframe);
		
		WebElement source = driver.findElement(By.id("draggable"));
				
		WebElement target = driver.findElement(By.id("droppable"));
		
		source.click();
		target.click();
		
		Actions anf = new Actions(driver);
		
		anf.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
