package WebTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTable {
	
	@Test
	public void printElementOfWebTable()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> numberofrows=driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr"));
	    int totalsize=numberofrows.size();
	   System.out.println(totalsize);
	   List<WebElement>allValue=driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
	  int i=1;
	  for(WebElement value:allValue)
	  {
		  
		  String text=value.getText();
		  System.out.print(text);
		  i++;
		  if(i==5)
		  {
			  System.out.println();
			  i=1;
			  
		  }
		  
	  }
	


	}
	
}
