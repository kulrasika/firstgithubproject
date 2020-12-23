import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limitwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
	WebElement footerdriver = driver.findElement(By.cssSelector("div[class = 'cb-footer cb-col-100 cb-col']"));
	
	int countoflinks = footerdriver.findElements(By.tagName("a")).size();
	
	System.out.println("Count of links in Footer: "+countoflinks);
	
	
	int firstcolumncount  = footerdriver.findElements(By.xpath("//div[text()='MOBILE SITE & APPS']/following-sibling::ul/li/a")).size();
	
	System.out.println("Count of links in first column of footer: "+firstcolumncount);
	
	System.out.println("And the links are:"+'\n');
	
	for (int i=0;i<firstcolumncount;i++)	
	{
		String linkname= footerdriver.findElements(By.xpath("//div[text()='MOBILE SITE & APPS']/following-sibling::ul/li/a")).get(i).getText();
		System.out.println(linkname+'\n');
		
	}
	
	
	}

}
