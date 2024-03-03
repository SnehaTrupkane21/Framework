package TestngD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {
	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/automation-practice-form");
			
			WebElement dropdownElement = driver.findElement(By.xpath("//div[text()='Select State']"));
			
			 Actions actions = new Actions(driver);
		        actions.moveToElement(dropdownElement).click().build().perform();

		        // Now, you may need to locate and click on a specific option within the dropdown
		        // For example, let's assume there is an option with text 'New York'
		        WebElement optionElement = driver.findElement(By.xpath("//div[text()='NCR']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);

		        // Click on the option
		        optionElement.click();



		/*	List<WebElement> yearValues = driver.findElements(By.xpath("//*[@id='state']//div"));
		
			
			for(WebElement yearValue:yearValues)
			{
				String value = yearValue.getText();
				System.out.println(value);
			}
		*/
	        
	}

	      

		
	}

