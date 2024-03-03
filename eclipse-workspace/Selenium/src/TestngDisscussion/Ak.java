package TestngDisscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ak {
	@BeforeSuite
	@Test
	public void TestCase1()
	{
		System.out.println("BeforeSuite1");
		
	}
	@AfterSuite
	@Test
	public void TestCase2()
	{
		System.out.println("AfterSuite2");
		
	}
	@BeforeClass
	@Test
	public void TestCase3()
	{
		System.out.println("BeforeClass3");
		
	}
	@AfterClass
	@Test
	public void TestCase4()
	{
		System.out.println("AfterClass4");
		
	}
	@BeforeMethod
	@Test
	public void TestCase5()
	{
		System.out.println("BeforeMethod5");
		
	}
	@AfterMethod
	@Test
	public void TestCase6()
	{
		System.out.println("AfterMethod6");
		
	}
   @BeforeTest
   @Test
	public void TestCase7()
	{
		System.out.println("BeforeTest7");
		
	}
   @AfterTest
   @Test
	public void TestCase8()
	{
		System.out.println("AfterTest8");
		
	}

@Test
	public void TestCase9()
	{
		System.out.println("Hii");
		
	}

}
