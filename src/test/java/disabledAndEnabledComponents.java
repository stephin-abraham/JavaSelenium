import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class disabledAndEnabledComponents {
    @Test
    public void enabledAndDisabled() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        // Print the opacity of the Return Date element
        System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getCssValue("opacity"));

        // Click on the 'round trip' option
        driver.findElement(By.xpath("//div[text()='round trip']")).click();

        // Check the opacity of the 'Return Date' element after the click
        String opacityValue = driver.findElement(By.xpath("//div[text()='Return Date']")).getCssValue("opacity");

        if(opacityValue.equals("1")) {  // Assuming opacity of 1 means enabled
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        // Close the browser
        driver.quit();
    }
}