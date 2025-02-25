package com.selenium.basicProgramForLocators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUpAndDownusingLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        for(int i =0;i<10;i++){
            js.executeScript("window.scrollBy(0,50);");
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        for(int i =0;i<10;i++){
            js.executeScript("window.scrollBy(0,-50);");
            Thread.sleep(500);
        }
    }
}
