import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstGrid {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc  = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.MAC);
	
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.10:4455/wd/hub"),dc);
	
	driver.get("https://www.google.com/");
	
	
	}
	
	
}
