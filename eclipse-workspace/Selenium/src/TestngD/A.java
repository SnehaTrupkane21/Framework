package TestngD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // Fill out the form fields
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");

        // Select 'Male' radio button
      //  driver.findElement(By.xpath("//*[@id='gender-radio-1']")).click();
        WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(maleRadioButton).click().build().perform();

        // Enter mobile number
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
        WebElement dropdown=driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
        dropdown.click();


        
        while(true)
		{
			String monthYear = driver.findElement(By.xpath("//*[text()='February 2024']")).getText();
			
			System.out.println(monthYear);
			
			if(monthYear.equals("August 2022"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[text()='Previous Month']")).click();
			}
		}
		
		
		driver.findElement(By.xpath("//*[text()='16']")).click();
		
		
		
		
		

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Select 'Sports' checkbox
        driver.findElement(By.xpath("//label[text()='Sports']/input")).click();

        // Select 'Reading' checkbox
        driver.findElement(By.xpath("//label[text()='Reading']/input")).click();

        // Select 'Haryana' from the 'Select State' dropdown
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select selectState = new Select(stateDropdown);
        selectState.selectByVisibleText("Haryana");

        // Select 'Noida' from the 'Select City' dropdown
        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select selectCity = new Select(cityDropdown);
        selectCity.selectByVisibleText("Noida");

        // Submit the form
        driver.findElement(By.id("submit")).click();

        // Close the browser
        driver.quit();
    }
}
