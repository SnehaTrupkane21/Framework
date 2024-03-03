package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndSropP {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(element);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(drag, target).perform();
	}
}
