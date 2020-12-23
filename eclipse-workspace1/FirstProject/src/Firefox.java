import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.gecko.driver", "C:\\Firefoxdriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	
		System.out.println(driver.getCurrentUrl());
		driver.get("https://login.yahoo.com/");
		System.out.println(driver.getTitle());	
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.close();
		
	}

}
