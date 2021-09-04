package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

//        WebElement element=driver.findElement(By.id("fileUpload"));
//        element.sendKeys("c:\myfile.txt);


        driver.findElement(By.cssSelector("div#contact-link")).click();
        Assert.assertEquals(driver.getTitle(),"Contact us - My Store");

        System.out.println("Thank you for contacting us...");

        driver.close();
    }
}
