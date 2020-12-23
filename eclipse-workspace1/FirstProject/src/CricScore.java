import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-scores/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		
		
		driver.findElement(By.linkText("Scorecard")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebElement ausruntable = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		List<WebElement> score = driver.findElements(By.xpath("//*[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class = 'cb-col cb-col-8 text-right text-bold']"));
		
		System.out.println(score.size());
		int scoretotal = 0;
		int runsum=0;
		for(int i=0;i<score.size();i++)
		{
			
			String scorestring = score.get(i).getText();
			int scoreint = Integer.parseInt(scorestring);
			runsum = runsum + scoreint;
					
					
		}
		
		String extras = driver.findElement(By.xpath("//*[@id='innings_1'] //div[text()='Extras'] //following-sibling::div[1]")).getText();
		scoretotal = runsum+Integer.parseInt(extras);
		System.out.println("Total Score"+scoretotal);
		//div[@class = 'cb-col cb-col-100 cb-scrd-itms']
		
		
	}

}
