package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BH {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com");
		JavascriptExecutor js=(JavascriptExecutor)driver ;
		WebElement element=driver.findElement(By.xpath("//p[text()='Company Questions']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		
		
		
		
		
		
	}

}
