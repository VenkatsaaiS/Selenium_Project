package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test4 {
        WebDriver driver=null;

        @BeforeMethod
        void loginTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
        @Test
        void searchOrangehrmpage() {

            driver.get("https://opensource-demo.orangehrmlive.com/");

            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            //  driver.findElement(By.id("welcome")).click();
            //    driver.findElement(By.cssSelector("#welcome-menu > ul > li:nth-child(3) > a")).click();
        }

        @AfterMethod
        void tearDown(){

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        System.out.println("Login Successful...");


        driver.close();
    }
}
