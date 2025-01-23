package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class handlingStaticDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //implicit wait

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = driver.findElement(By.id("//select[@id='dropdown-class-example']"));
        Select staticDropdown = new Select(dropdown);
        staticDropdown.selectByIndex(2);
        staticDropdown.selectByValue("Option2");
        staticDropdown.selectByVisibleText("Option1");
    }
}
