package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Handling_iframe {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/frames");

        List<WebElement> iframeElements = driver.findElements(By.id("frame1"));

        System.out.println("Total number of iframes are " + iframeElements.size());
    

        driver.close();

    }
}
