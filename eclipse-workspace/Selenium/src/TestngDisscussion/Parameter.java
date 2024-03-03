package TestngDisscussion;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter {
	@Parameters({"i","j"})
   @Test
   public void add(int a,int b)
   {
	   System.out.println("add:"+(a+b));
   }
	
	@Parameters({"i","j"})
	@Test
	public void sub(int a,int b)
	{
		System.out.println("sub:"+(a-b));
	}
	
	@Parameters({"i","j"})
	@Test
	public void mult(int a,int b)
	{
		System.out.println("Mult:"+(a*b));
	}
	
}
