package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNG_with_Annotations {

    @Test
    void aboutmeSearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://about.me/venkatsai1811");
        driver.findElement(By.cssSelector("a.button.xlarge.dark.primary.glyph-article")).click();

     //   Assert.assertEquals(driver.getTitle(),"");
        System.out.println(driver.getTitle());
        System.out.println("Test Completed Successfully");

    driver.close();
    }
}
