import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		WebElement clickB=driver.findElement(By.xpath("//*[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']"));
		clickB.click();
		Thread.sleep(2000);	
		WebElement resume=driver.findElement(By.xpath("//*[@type='file']"));
		resume.sendKeys("C:\\Users\\USER\\Documents\\REGRESSION TESTING.docx");
				
		
		
		
		
		
		
		
		
	}

}
