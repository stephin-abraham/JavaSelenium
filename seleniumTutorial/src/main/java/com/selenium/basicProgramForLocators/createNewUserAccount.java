package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createNewUserAccount {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Stephin");
        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Abraham");
        driver.findElement(By.cssSelector("input#userEmail")).sendKeys("stephintest@gmail.com");
        driver.findElement(By.cssSelector("input[id='userMobile']")).sendKeys("8964657843");

    }
}
