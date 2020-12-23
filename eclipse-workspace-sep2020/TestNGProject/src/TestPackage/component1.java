package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class component1 {
	
	@BeforeTest
	public void BeforeComponent1() {
		System.out.println("Now Entering Component1");
	}
	
	
	@Parameters({ "URL","Loginname" })
	@Test
		public void C1Step1(String url,String login)
	{
		System.out.println("Inside Step1");
		System.out.println(url);
		System.out.println(login);
	}


@Test (timeOut = 4000)
public void C1Step2()
{
	System.out.println("Inside Step2");
	Assert.assertTrue(false);
}


@Test
public void C1Step3()
{
	System.out.println("Inside Step3");
}

@AfterTest
public void AfterComponent1()
{
	System.out.println("Now Exiting Component1");
	}

	
}
