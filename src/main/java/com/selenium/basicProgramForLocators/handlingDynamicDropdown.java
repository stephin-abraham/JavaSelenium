package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class handlingDynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://spicejet.com");
        driver.findElement(By.xpath("//div[contains(text(),'From')]/following-sibling::div/input")).click();
        Thread.sleep(1000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'From')]/following-sibling::div/input")).sendKeys("Co");
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
            for(WebElement e : list){
                if(e.getText().equals("Kochi")){
                    e.click();
                    break;
                }
            }


    }
}
