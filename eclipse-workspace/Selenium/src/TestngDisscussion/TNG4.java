package TestngDisscussion;

import org.testng.annotations.Test;

public class TNG4 {

	@Test(invocationCount=3)
	public void m1()
	{
		System.out.println("hey i am sneha");
	}

	@Test(invocationCount=20)
	public void m2()
	{
		System.out.println("i love my self ,i love you sneha");
		
	}
	
}
