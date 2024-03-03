package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickM {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javaTpoint.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Elementtoclick=driver.findElement(By.xpath("(//div[@class='homecontent']//p[text()='Selenium'])[2]"));
		
		js.executeScript("arguments[0].click()",Elementtoclick );
	}

}
