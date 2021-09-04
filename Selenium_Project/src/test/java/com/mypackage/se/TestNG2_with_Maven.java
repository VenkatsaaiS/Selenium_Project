package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2_with_Maven {

    @Test
    void contactusTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");


        driver.findElement(By.cssSelector("div#contact-link")).click();
        Assert.assertEquals(driver.getTitle(),"Contact us - My Store");
        System.out.println(driver.getTitle());

   driver.close();
    }
}
