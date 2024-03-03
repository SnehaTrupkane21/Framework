package SeleniumPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMDG {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String ParentWindowId=driver.getWindowHandle();
		 
		System.out.println(ParentWindowId);
     driver.findElement(By.xpath("(//*[text()='Privacy Policy'])[1]")).click();
		
		Set<String>AllWindowID=driver.getWindowHandles();
		
		//List<String> list=new ArrayList(AllWindowID);
		 
		for(String winId:AllWindowID)
		{
			if(!(winId.equals(ParentWindowId))) {
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			System.out.println(winId);
		}
		}
		
	//	driver.findElement(By.xpath("//*[text()='Search']")).sendKeys("Testing hii");
		
	}

}
