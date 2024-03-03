package SeleniumPrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
    public static void main(String[] args) throws IOException {
		
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com");
    	WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    	
    	 ExcelRedaer1 er=new  ExcelRedaer1();
    	 String firstname1=er.readdata(2, 0);
    	 firstname.sendKeys("Sneha");
    	 WebElement type=driver.findElement(By.xpath("//*[@type='password']"));
    	
    	 String type1=er.readdata(1, 0);
    	
    	 type.sendKeys("Sneha@12");
    	WebElement login=driver.findElement(By.xpath("//*[@name='login']"));
    	 login.click();
    }
}
