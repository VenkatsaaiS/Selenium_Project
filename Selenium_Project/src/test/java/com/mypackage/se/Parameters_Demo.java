package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parameters_Demo {

    WebDriver driver=null;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String url)
    {
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();


        }
        else
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.manage().window().maximize();

        }
        driver.get(url);
    }

    @Test
    void logoTest(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logo=driver.findElement(By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed....");
    }

    @Test
    void homePagetest(){

        //  Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }

    @AfterClass
    void tearDown(){

        driver.close();
    }
}
