package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniump8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.get("https://www.javatpoint.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement plant=driver.findElement(By.xpath("//h2[text()='Java Technology']"));
		
		js.executeScript("arguments[0].scrollIntoView();", plant);
		
	}

}
