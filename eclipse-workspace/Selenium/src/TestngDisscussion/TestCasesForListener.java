package TestngDisscussion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestCasesForListener {
	@Test
	public void testCase1()
	{
		
		boolean a=false;
		assertTrue(a);
		System.out.println("Hii");
		
		
		
	}
	@Test
	public void TestCase2()
	{
		String num="abc";
		String num1="Abc";
		assertEquals(num1, num);
		System.out.println("Hey,i am using assert");
		
		
	}
	@Test
	public void TestCase3()
    {
		System.out.println("this will calledskip methods");
		
	}
	@Test
	public void TestCase5()
	{
		String as="abc";
		String as1="abc";
		System.out.println("this called sucessful");
	}
	
}
