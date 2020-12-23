package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class component2 {
	
	@BeforeTest
	public void BeforeComponent2() {
		System.out.println("Now Entering Component2");
	}
	
	@Test (dependsOnMethods = {"C2Step3","C2Step2"},enabled = false)
	public void C2Step1()
	{
		System.out.println("Inside Step1");
	}


@Test
public void C2Step2()
{
	System.out.println("Inside Step2");
}


@Test (dataProvider = "getData")
public void C2Step3(String uname, String password)
{
	System.out.println("Inside Step3");
	System.out.println(uname);
	System.out.println(password);
}

@AfterTest
public void AfterComponent2()
{
	System.out.println("Now Exiting Component2");
	}

@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][2];
	
	data[0][0] = "Username1";
	data[0][1] = "Password1";
	
	data[1][0] = "Username2";
	data[1][1] = "Password2";
	
	data[2][0] = "Username3";
	data[2][1] = "Password3";
	
	return data;
	
}
}

	
