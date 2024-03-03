package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		 
     /*  String ParentWindowID= driver.getWindowHandle();
		
       System.out.println("ParentID "+ParentWindowID);
		
		WebElement click1=driver.findElement(By.xpath("(//*[text()='Privacy Policy'])[2]"));
		click1.click();*/
		
		Set<String> WindowId=driver.getWindowHandles();

	for(String windowID:WindowId)
	{
		 System.out.println(windowID);
	  if(windowID.equals(WindowId))
	  {
		 
	driver.switchTo().window(windowID);
		 
		  
	  }
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}

}
