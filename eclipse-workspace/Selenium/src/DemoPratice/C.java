package DemoPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/forms");
		driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
		WebElement radio=driver.findElement(By.xpath("//*[@class='btn btn-light active']"));
		
	   if(radio.isEnabled()==true)
	   {
		   radio.click();
	   }
	}

}
