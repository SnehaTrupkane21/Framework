package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String parentWinId = driver.getWindowHandle();// to get the id of window which got opened first i.e parent window id
		
		System.out.println(parentWinId);
		
		
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
					
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("firstnametyping");
		
		for(String winId:allWindowId)
		{
			System.out.println(winId);
			
			if(!(winId.equals(parentWinId)))
			{
				driver.switchTo().window(winId);
			}
			
		}
		
		
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Testing typing");
		


	}}