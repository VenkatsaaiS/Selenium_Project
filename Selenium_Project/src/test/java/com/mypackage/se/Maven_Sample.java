package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Maven_Sample {

    WebDriver driver = null;

    @BeforeTest
    @Parameters("browser")
    void setup(String browser) throws Exception {

        if(browser.equalsIgnoreCase("firefox")) {
            //   System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Jar Files\\geckodriver-v0.29.1-win32\\geckodriver.exe");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else {
            throw new Exception("Browser is not correct");
        }
        Thread.sleep(3000);
    }

    @Test
    void crossbrowsertest() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
        //   System.out.println(driver.getTitle());

//            driver.findElement(By.name("uid")).sendKeys("mngr346461");
//            driver.findElement(By.name("password")).sendKeys("nesasYr");
//            driver.findElement(By.name("btnLogin")).submit();
//
//            driver.findElement(By.linkText("New Customer")).click();
//            driver.findElement(By.name("name")).sendKeys("Varun");
//            driver.findElement(By.xpath("//input[@value='m']")).click();
//            driver.findElement(By.name("addr")).sendKeys("H No 1 48 Chaiy Colony");
//            driver.findElement(By.name("city")).sendKeys("Huzurabad");
//            driver.findElement(By.name("state")).sendKeys("Telangana");
//            driver.findElement(By.name("pinno")).sendKeys("508204");
//            driver.findElement(By.name("telephoneno")).sendKeys("1233567890");
//            driver.findElement(By.name("emailid")).sendKeys("sappeppappu-1820@yopmail.com");
//            driver.findElement(By.name("password")).sendKeys("123456789");
//            driver.findElement(By.name("sub")).click();

        //     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterTest
    void teardown() {

        System.out.println("Registration Successful... Thank you for banking with GURU99");
        driver.close();
    }
}