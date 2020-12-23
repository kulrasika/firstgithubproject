
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_adv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
				
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		
		String print = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
		while(!print.equalsIgnoreCase("October"))
		{driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next ui-corner-all')]")).click();
		print = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
	}
		List <WebElement> days = driver.findElements(By.xpath("//td[@data-month='9']"));
		for(int i=0;i<(days.size()-1);i++)
		{
			if(days.get(i).getText().equalsIgnoreCase("13"))
			{days.get(i).click();
			break;
			}
		}
	}

		
}
