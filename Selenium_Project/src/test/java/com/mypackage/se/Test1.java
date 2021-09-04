package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/V4/");
//        //   System.out.println(driver.getTitle());
//
//        driver.findElement(By.name("uid")).sendKeys("mngr346461");
//        driver.findElement(By.name("password")).sendKeys("nesasYr");
//        driver.findElement(By.name("btnLogin")).submit();
//
//        driver.findElement(By.linkText("New Customer")).click();
//        driver.findElement(By.name("name")).sendKeys("Varun");
//        driver.findElement(By.xpath("//input[@value='m']")).click();
//        driver.findElement(By.name("dob")).sendKeys("18/11/1992");
//        driver.findElement(By.name("addr")).sendKeys("H No 1 48 Chaitanya Colony");
//        driver.findElement(By.name("city")).sendKeys("Huzurnagar");
//        driver.findElement(By.name("state")).sendKeys("Telangana");
//        driver.findElement(By.name("pinno")).sendKeys("508204");
//        driver.findElement(By.name("telephoneno")).sendKeys("2234567890");
//        driver.findElement(By.name("emailid")).sendKeys("fpppu-1920@yopmail.com");
//        driver.findElement(By.name("password")).sendKeys("123456789");
//        driver.findElement(By.name("sub")).click();
//
//        System.out.println("Registration Successful... Thank you for banking with GURU99");
//
//        driver.close();

    }
}
