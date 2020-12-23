package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TwoTC {
	
	@Test
	public void FirstClass()
	{
	System.out.println("First Case");
	}

	 @Parameters({ "URL","Loginname"})
	@Test
	public void SecondClass(String url,String login)
	{
		System.out.println("Second Case");
		System.out.println(url);
		System.out.println(login);
		
	}
}
