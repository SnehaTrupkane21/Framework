package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BA {
	
   WebDriver driver;
  @Test(priority=1)
  public void LaunchBrowser()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
	  driver.navigate().refresh();
	  driver.navigate().refresh();
	  
  }
 @Test(priority=2)
  public void Search()
  {
	  
	
	WebElement element=driver.findElement(By.xpath("//*[@name='q']"));
	 element.sendKeys("SamsungA54");
	  
  }
		
		@Test(priority=3)
		public void clickOnPhone()
		{
			WebElement Click=driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]"));
			Click.click();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}


