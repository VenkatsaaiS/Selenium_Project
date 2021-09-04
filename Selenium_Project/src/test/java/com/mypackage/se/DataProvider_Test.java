package com.mypackage.se;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProvider_Test {

        // this will take data from dataprovider which we created
        @Test(dataProvider="testdata")
        public void TestChrome(String uname,String password) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://twitter.com/login");

         //   driver.findElement(By.xpath("//input[@type='text']")).clear();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(uname);
            System.out.println("Username Insertion Successful....");


     //       driver.findElement(By.xpath("//input[@type='password']")).clear();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            System.out.println("Password Insertion Successful....");
         driver.close();
        }

        @DataProvider(name="testdata")
        public Object[][] TestDataFeed(){

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
            Object [][] twitterdata=new Object[2][2];

// Enter data to row 0 column 0
            twitterdata[0][0]="username1@gmail.com";
// Enter data to row 0 column 1
            twitterdata[0][1]="Password1";
// Enter data to row 1 column 0
            twitterdata[1][0]="username2@gmail.com";
// Enter data to row 1 column 0
            twitterdata[1][1]="Password2";
// return arrayobject to testscript
            return twitterdata;
        }
    }
