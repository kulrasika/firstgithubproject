import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class capability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	DesiredCapabilities ch = DesiredCapabilities.chrome();
	ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	ch.acceptInsecureCerts();
	ChromeOptions c = new ChromeOptions();
	c.merge(ch);
	
	
	
	
	
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		
		
	}

}
