package TestngD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class p5 {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com");

	        // Wait for the elements to be present on the page
	       // WebDriverWait wait = new WebDriverWait(driver, 10);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     //   List<WebElement> allProducts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	              //  By.xpath("//div[@class='_1AtVbE']//div[@class='_1AtVbE']")));
	        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='_1AtVbE']//div[@class='_1AtVbE']"));

	        // Print the text of each product
	        for (WebElement product : allProducts) {
	            String productName = product.getText();
	            System.out.println(productName);
	        }

	        // Close the browser
	        driver.quit();
	    }
	

      
   

}