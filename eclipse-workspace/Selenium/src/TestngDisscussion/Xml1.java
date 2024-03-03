package TestngDisscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xml1 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println(" beforeClass");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@Test
	public void Test()
	{
		System.out.println("Test");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass");
		
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	
}
