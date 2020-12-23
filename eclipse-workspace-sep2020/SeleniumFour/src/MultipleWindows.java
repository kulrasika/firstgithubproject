import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itwindows = handles.iterator();
		
		String parent = itwindows.next();
		String child = itwindows.next();
		
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/#/index");
		String coursename = null;
		List<WebElement> courselist= driver.findElements(By.xpath("//h2/a"));
		
		if(courselist.size()==0)
			System.out.println("No Elements in the list");
		else
			System.out.println("Elements present");
		
		for(int i=0;i<(courselist.size()-1);i++)
		{
		coursename = courselist.get(i).getText();
		System.out.println(coursename);
		if(coursename.toLowerCase().contains("core"));
		break;
		}
		
		driver.switchTo().window(parent);
		
		WebElement nameeditbox = driver.findElement(By.name("name"));
		
		nameeditbox.sendKeys(coursename);
		
		File src = nameeditbox.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File( "C:\\Users\\hrish\\eclipse-workspace\\Screenshot\\elementsc.bmp"));
		
		int height=nameeditbox.getRect().getDimension().getHeight();
		int width = nameeditbox.getRect().getDimension().getWidth();
		
		System.out.println("Height = "+height+"Width = "+ width);
	
		
		System.out.println("Program ended");
		
		}

}
