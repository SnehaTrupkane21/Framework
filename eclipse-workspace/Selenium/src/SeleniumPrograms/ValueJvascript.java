package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueJvascript {public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.javaTpoint.com");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement Elementtovalue=driver.findElement(By.xpath("(//tbody//*[@type='text'])[2]"));
	js.executeScript("arguments[0].value='SendTest'",Elementtovalue );
}

}
