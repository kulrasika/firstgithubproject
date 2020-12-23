import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Sorting by price
		
		List <WebElement> firstlist = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		
		 ArrayList<Integer> firstone = new ArrayList<Integer>();
		 ArrayList<Integer> secondone = new ArrayList<Integer>();
		
		 
		for(int i=0;i<(firstlist.size()-1);i++)
		{
			String s = firstlist.get(i).getText();
			firstone.add(Integer.parseInt(s));
			
		}
		
		for(int i=0;i<(firstone.size()-1);i++)
		{
			secondone.add(firstone.get(i));
			
		}
	
	Collections.sort(secondone);
	
	if (firstone.equals(secondone))
	{
		System.out.println("Items are sorted by price");
	}
	else
	{
		System.out.println("Items are not sorted");
	}
	Assert.assertTrue(firstone.equals(secondone));
	}
	
	
}
	


