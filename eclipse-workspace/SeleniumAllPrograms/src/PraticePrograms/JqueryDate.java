package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDate {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
	while(true) {
		WebElement date=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		String text=date.getText();
		System.out.println(date);
		if(text.equals("August 1998"))
		{
			break;
			
		}
		else
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		
		
		
	}
	driver.findElement(By.xpath("//tbody//a[text()='21']")).click();
		
		
	}

}
