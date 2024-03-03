package TestngDisscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POOO {
	
	@Test
	public void printElement() {  
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	List<WebElement> element=driver.findElements(By.xpath("(//*[@class='dataTable']//tbody//tr)"));
	  int n=element.size();
	  System.out.println(n);
	 List<WebElement> allvalue =driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
	 int i=1;
	 for(WebElement value:allvalue)
	 {
		
		 String textValue=value.getText();
		 System.out.print(textValue+" ");
		 i++;
		 if(i==6)
		 {
			 System.out.println();
			 i=1;
			 
		 }
		 
		 
		  
	  }
	
	}
}
