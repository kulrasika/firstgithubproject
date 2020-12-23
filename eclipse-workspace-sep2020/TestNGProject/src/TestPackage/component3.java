package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class component3 {
	
@BeforeSuite
public void FirstinSuite()
{
	System.out.println("Entering Suite");
}
	
	@BeforeTest
	public void BeforeComponent3() {
		System.out.println("Now Entering Component2");
	}
	
	@Test(groups="smoke")
	public void C3Step1()
	{
		System.out.println("Inside Step1 of Component3");
	}


	@BeforeMethod
	public void BeforeeveryTest()
	{
		System.out.println("Before Method - COmponent3");
	}
	
@Test
public void C3Step2()
{
	System.out.println("Inside Step2");
}


@Test(groups="smoke")
public void C3Step3()
{
	System.out.println("Inside Step3");
}

@AfterTest
public void AfterComponent3()
{
	System.out.println("Now Exiting Component3");
}

@AfterMethod
public void AfterEveryMethod()
{
	System.out.println("After Method- Component3");
}

	
@BeforeClass
public void BeforeEveryClass()
{
	System.out.println("Before this class - Component3");
	}

@AfterClass
public void AfterEveryClass()
{
	System.out.println("After this class - Component3");
	}

@AfterSuite
public void LastinSuite()
{
	System.out.println("Exiting Suite");
}
	
}
