package com.selenium.basicProgramForLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loopingDropdownNotUsingSelectTag {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

      driver.get("https://spicejet.com");
      driver.findElement(By.xpath("//div[text()='Passengers']")).click();
      for(int i=0;i<5;i++) {
          driver.findElement(By.xpath("//div[text()='Adult']/parent::div/following-sibling::div/div[3]")).click();
      }
    }
}
