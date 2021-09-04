package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First_Test {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Desktop\\chromedriver_win32\\chromedriver.exe");
    //    ChromeOptions chromeOptions=new ChromeOptions();
    //    chromeOptions.setHeadless(true);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");


       /*    // Using By id.....
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("venkatsai1811@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("@18111992@");
        driver.findElement(By.id("signInSubmit")).click();   */

     /*  // Using Xpath.....
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("venkatsai1811@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();   */

        // Using cssSelector.....
        driver.findElement(By.cssSelector("a#nav-link-accountList")).click();
        driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-autofocus.auth-required-field")).sendKeys("venkatsai1811@gmail.com");
        driver.findElement(By.cssSelector("input.a-button-input")).click();
        driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-autofocus.auth-required-field")).sendKeys("@18111992@");
        driver.findElement(By.cssSelector("input.a-button-input")).click();


     driver.close();
    }
}
