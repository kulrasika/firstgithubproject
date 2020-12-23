import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	
		driver.getCurrentUrl();
		
		String Url = "https://www.google.com/";
				boolean isCorrect = Url.equalsIgnoreCase(driver.getCurrentUrl());
				
				if (isCorrect == true)
						System.out.println("Correct URL");
				else					
					System.out.println("InCorrect URL");
				
				
				System.out.println("**********Printing Page Source*************");
				System.out.println(driver.getPageSource());
	}

}
