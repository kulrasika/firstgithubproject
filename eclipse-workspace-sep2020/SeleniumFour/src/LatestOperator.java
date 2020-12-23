import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;

public class LatestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program uses latest relative operators used in selenium
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditbox = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditbox)).getText()); 
		
		WebElement dob = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dob)).sendKeys("2020-07-09");
		
		WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();
		
		WebElement radio= driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(radio)).getText());	
		
		driver.quit();
		
	}

}
