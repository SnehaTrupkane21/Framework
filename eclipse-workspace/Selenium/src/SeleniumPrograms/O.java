package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Priyanka");
		Thread.sleep(2000);
        List<WebElement> search= driver.findElements(By.xpath("//*[text()='Priyanka Gandhi Vadra']"));

		for(WebElement a:search)
		{
			String value=a.getText();
			if(value.equals("Priyanka Gandhi Vadra"))

			{
				a.click();
				break;
				
			}
		}
		
		
		
	}

}
