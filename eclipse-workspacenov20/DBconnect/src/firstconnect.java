import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import com.mysql.jdbc.Statement;

public class firstconnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		/*
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("password"));
		}*/
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		WebElement username = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb","root","250545");
		//?useSSL=false
		Statement s = (Statement) con.createStatement();
				
		ResultSet rs = s.executeQuery("select name, password from demo where name = 'abc'");
				
		while(rs.next())
		{		
		username.sendKeys(rs.getString("name"));
		password.sendKeys(rs.getString("password"));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
