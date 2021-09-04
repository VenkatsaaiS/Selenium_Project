package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Sample {

    @Test
    public void test1()
    {
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Jar Files\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh();
      //  driver.get("https://www.google.com");
        System.out.println("Successfully Launched Google Home Page.....");
      //  Assert.assertEquals("Googl",driver.getTitle());
     driver.close();

    }

    }
