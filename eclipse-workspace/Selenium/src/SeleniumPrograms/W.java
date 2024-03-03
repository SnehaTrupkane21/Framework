package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class W {
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.navigate().refresh();
		driver.get("https://www.facebook.com");
	}

}
