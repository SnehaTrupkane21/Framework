package TestngD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://select2.org/getting-started/basic-usage");
		List<WebElement>allCities=driver.findElements(By.xpath("//*[@class='js-states form-control']//optgroup//option"));
		for(WebElement city:allCities)
		{
			String name=city.getText();
			
			if(name.equals("Arizona"))
			{
				city.click();
				break;
			}
			System.out.println(name);
		}
		
		
		
	}

}
