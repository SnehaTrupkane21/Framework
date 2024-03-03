package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/");
		WebElement element=driver.findElement(By.xpath("https://demoqa.com/"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguements[0].click()", element);
		WebElement element3=driver.findElement(By.xpath("(//*[text()='Demo Site'])[2]"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js.executeScript("arguements[0].click()", element3);
		
		
		
		WebElement element1=driver.findElement(By.xpath("(//*[@id='item-3'])[1]"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("arguements[0].click()", element1);
		
		
	}

}




