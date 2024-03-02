package PraticePrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Buddhapic {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait

        driver.get("https://www.creativehatti.com/downloads/illustration-design-of-lord-buddha/");

        // Use WebDriverWait to wait for the page to load
    //    WebDriverWait wait = new WebDriverWait(driver, 10);
      //  wait.until(ExpectedConditions.titleContains("Illustration Design of Lord Buddha"));

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);

        // Handle file paths in a platform-independent way
        String fileName = "buddhapicture.jpeg";
        String path = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator + fileName;

        // Scroll to the desired element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement tillElement = driver.findElement(By.xpath("(//*[text()='Illustration Design of Lord Buddha'])[3]"));
        js.executeScript("arguments[0].scrollIntoView();", tillElement);

        // Copy the screenshot file to the specified path
        File destination = new File(path);
        FileHandler.copy(source, destination);

        // Close the WebDriver
        //driver.quit();
    }
}
