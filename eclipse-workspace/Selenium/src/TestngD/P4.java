package TestngD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		List<WebElement> allcities=driver.findElements(By.xpath("\"//div[@class='chFlights']//span[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500']\"\r\n"
				+ ""));
		for(WebElement city:allcities)
		{
			
			String citymname=city.getText();
			System.out.println(citymname);
			
		}
		
		
		
	}

}
