package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicLocatorProgram {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("abc@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }
}
