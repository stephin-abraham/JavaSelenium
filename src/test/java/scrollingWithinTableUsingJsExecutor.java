import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class scrollingWithinTableUsingJsExecutor {
    @Test
    public void scrolling() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//creating an object and casting driver type to javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scrolls the page 500px of main window
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(3000);
        //selecting DOM which is present inside a window
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

    }
}
