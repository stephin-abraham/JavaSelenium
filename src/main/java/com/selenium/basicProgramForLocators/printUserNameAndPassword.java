package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class printUserNameAndPassword {
    public static void main(String[] args) {
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

                driver.get("https://adactinhotelapp.com/");
                driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vengat16");
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Karthick");

                String s1= driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");
                String s2= driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");
                System.out.println(s1);
                System.out.println(s2);
    }
}