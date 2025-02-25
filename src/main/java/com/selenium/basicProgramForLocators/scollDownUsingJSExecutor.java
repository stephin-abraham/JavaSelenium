package com.selenium.basicProgramForLocators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollDownUsingJSExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-5000);");
    }
}
