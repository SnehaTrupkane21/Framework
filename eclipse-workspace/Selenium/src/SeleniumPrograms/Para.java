package SeleniumPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para
{
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
	  public void mul(int a,int b)
	  {
			System.out.println("mul:"+(a*b));
			
	  }
		
	
}
